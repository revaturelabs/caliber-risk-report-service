package com.revature.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Assessment;
import com.revature.beans.AssociateWeeklyReport;
import com.revature.beans.BatchWeeklyReport;
import com.revature.beans.Category;
import com.revature.beans.Grade;
import com.revature.beans.RevBatch;
import com.revature.beans.Trainee;
import com.revature.beans.Trainer;
import com.revature.repository.AssessmentRepository;
import com.revature.repository.AssociateWeeklyReportRepository;
import com.revature.repository.BatchWeeklyReportRepository;
import com.revature.repository.CategoryRepository;
import com.revature.repository.GradeRepository;
import com.revature.repository.NoteRepository;
import com.revature.repository.RevBatchRepository;
import com.revature.repository.TraineeRepository;
import com.revature.repository.TrainerRepository;

@Service
public class GeneratorService {
	
	@Autowired
	AssessmentRepository ar;
	
	@Autowired
	AssociateWeeklyReportRepository awrr;
	
	@Autowired
	BatchWeeklyReportRepository bwrr;
	
	@Autowired
	CategoryRepository cr;
	
	@Autowired
	GradeRepository gr;
	
	@Autowired
	NoteRepository nr;
	
	@Autowired
	RevBatchRepository rbr;
	
	@Autowired
	TraineeRepository tr;
	
	@Autowired
	TrainerRepository trr;
	
	public boolean checkData() {
		List<BatchWeeklyReport> reports = bwrr.findAll();
		for (BatchWeeklyReport report : reports) {
			if (new Date().getTime() - report.getReporttime().getTime() > 806400000) {
				return true;
			}
		}
		return false;
	}
	
	public void generateBatchWeekly() {
		List<RevBatch> batches = rbr.findAll();
		List<Assessment> assessments = ar.findAll();
		List<Category> categories = cr.findAll();
		List<Grade> grades = gr.findAll();
		List<Trainee> trainees = tr.findAll();
		List<Trainer> trainers = trr.findAll();
		for (RevBatch batch : batches) {
			//get associates in batch
			List<Trainee> batchass = new ArrayList<>();
			for (Trainee temp : trainees) {
				if (temp.getBatchId() == batch.getBatchId()) {
					batchass.add(temp);
				}
			}
			
			//loop through assessments
			for (Assessment ass : assessments) {
				if (ass.getBatchId() != batch.getBatchId()) {
					continue;
				}
				if (!ass.getType().equals("Verbal")) {
					continue;
				}
				BatchWeeklyReport report = new BatchWeeklyReport();
				report.setIdnum(batch.getBatchId());
				report.setBatchName(batch.getTrainingName());
				
				//get and set the associate Ids
				//count qc
				Set<Integer> associateIds = new HashSet<>();
				List<Grade> assgrades = new ArrayList<>();
				for (Grade temp : grades) {
					if (temp.getAssessmentId() == ass.getAssessmentId()) {
						assgrades.add(temp);
					}
				}
				Integer qcgreen = 0;
				Integer qcyellow = 0;
				Integer qcred = 0;
				Integer survgreen = 0;
				Integer survyellow = 0;
				Integer survred = 0;
				Integer qcscore = ass.getScore();
				Random rand = new Random();
				for (Trainee associate : batchass) {
					associateIds.add(associate.getTraineeId());
					int num = rand.nextInt(3) + 1;
					switch (num) {
						case (1): survgreen += 1; break;
						case (2): survyellow += 1; break;
						case (3): survred += 1; break;
						default: break;
					}
				}
				for (Grade grade : assgrades) {
					//40 red , 70 yellow
					if (grade.getScore() > 70) {
						qcgreen += 1;
					} else if (grade.getScore() > 40) {
						qcyellow +=1;
					} else {
						qcred += 1;
					}
				}
				report.setAssociates(associateIds);
				report.setQcgreens(qcgreen);
				report.setQcyellow(qcyellow);
				report.setQcred(qcred);
				report.setSurvgreen(survgreen);
				report.setSurvyellow(survyellow);
				report.setSurvred(survred);
				report.setQcscore(qcscore);
				report.setLocation(batch.getLocation());
				report.setWeeks(batch.getNumberWeeks());
				report.setCurrweek(ass.getWeek());
				report.setEnddate(batch.getEndDate());
				report.setSkilltype(batch.getSkilltype());
				//missing category and trainer
				for (Trainer trainer : trainers) {
					if (trainer.getTrainerId() == batch.getTrainerId()) {
						report.setTrainer(trainer.getName());
						break;
					}
				}
				for (Category cat : categories) {
					if (cat.getCategoryId() == ass.getCategory()) {
						report.setCategoryname(cat.getSkillCategory());
						break;
					}
				}
				report.setReporttime(new Date(batch.getStartDate().getTime() + ass.getWeek()*604800000));
				//batch.getStartDate().getTime() + ass.getWeek()*604800000
				bwrr.save(report);
			}
		}
	}
	
	public List<AssociateWeeklyReport> generateAssociateWeekly() {
		return null;
	}
}
