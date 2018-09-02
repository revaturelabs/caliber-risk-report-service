package com.revature;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datastax.driver.core.LocalDate;
import com.revature.model.Associate;
import com.revature.model.Associate_Ratings;
import com.revature.model.Batch_Ratings;
import com.revature.model.Batches;
import com.revature.model.QC_Report;
import com.revature.model.Survey_Reports;
import com.revature.model.Trainer;
import com.revature.repository.Associate_Ratings_Repo;
import com.revature.repository.Associate_Repo;
import com.revature.repository.Batch_Ratings_Repo;
import com.revature.repository.Batch_Repo;
import com.revature.repository.QC_report_repo;
import com.revature.repository.Survey_Reports_Repo;
import com.revature.repository.Trainer_Repo;

@SpringBootApplication
public class QcReportApplication implements CommandLineRunner{
	@Autowired
	QC_report_repo qcrr;
	@Autowired
	Associate_Ratings_Repo arr;
	@Autowired
	Associate_Repo ar;
	@Autowired
	Batch_Ratings_Repo brr;
	@Autowired
	Batch_Repo br;
	@Autowired
	Survey_Reports_Repo srr;
	@Autowired
	Trainer_Repo tr;
	
	public static void main(String[] args) {
		SpringApplication.run(QcReportApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		runQCReport();
		runARRReport();
		runARReport();
		runBRReport();		
		runSRReport();
		runTReport();
		runBReport();
	}
	
	private void runBRReport() {
		Batch_Ratings br1 = new Batch_Ratings(1,1,1,"yellow");
		Batch_Ratings br2 = new Batch_Ratings(2,2,2,"red");
		brr.save(br1);
		brr.save(br2);
		List<Batch_Ratings> br = brr.findAll();
		br.forEach(System.out::println);
		
	}
	private void runBReport() {
		long mill = System.currentTimeMillis();
		//Calendar calendar = Calendar.getInstance();
		//java.util.Date currentDate = calendar.getTime();
		LocalDate endDate = LocalDate.fromMillisSinceEpoch(mill);
		LocalDate portfolioSubmission = LocalDate.fromMillisSinceEpoch(mill);
		System.out.println(endDate);
		
		Batches b1 = new Batches(1,1, endDate, portfolioSubmission);
		Batches b2 = new Batches(2,2, endDate, portfolioSubmission);
		br.save(b1);
		br.save(b2);
		List<Batches> batch = br.findAll();
		batch.forEach(System.out::println);		
	}
	private void runSRReport() {
		Survey_Reports sr1 = new Survey_Reports(1,1,1, "green", "good");
		Survey_Reports sr2 = new Survey_Reports(2,2,2, "red", "bad");
		srr.save(sr1);
		srr.save(sr2);
		List<Survey_Reports> survey = srr.findAll();
		survey.forEach(System.out::println);
		
	}
	private void runTReport() {
		Trainer t1 = new Trainer(1, "Mike");
		Trainer t2 = new Trainer(2, "Russell");
		tr.save(t1);
		tr.save(t2);
		List<Trainer> trainers = tr.findAll();
		trainers.forEach(System.out::println);
		
	}
	
	private void runARReport() {
		Associate ar1 = new Associate(1,1,"green","Mike","good");
		Associate ar2 = new Associate(2,5,"yellow","Max", "needs fixing");
		ar.save(ar1);
		ar.save(ar2);
		List<Associate> arReport = ar.findAll();
		arReport.forEach(System.out::println);
	}
	
	private void runQCReport() {
		QC_Report r1 = new QC_Report(3, 1, 1, "yellow", "third");
		qcrr.save(r1);
		List<QC_Report> reports = qcrr.findByColor("yellow");
		reports.forEach(System.out::println);
	}
	
	private void runARRReport() {
		Associate_Ratings arr1 = new Associate_Ratings(1,1,1,"green");
		Associate_Ratings arr2 = new Associate_Ratings(2,2,2,"yellow");
		arr.save(arr1);
		arr.save(arr2);
		List<Associate_Ratings> arrReport = arr.findByAssociateid(2);
		arrReport.forEach(System.out::println);
	}
}