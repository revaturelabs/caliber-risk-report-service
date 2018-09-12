package com.revature.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.AssociateWeeklyReport;
import com.revature.repository.AssociateWeeklyReportRepository;

@Service
public class AssociateWeeklyReportServiceLayer {
	
	@Autowired
	private AssociateWeeklyReportRepository awrr;
	
	@Autowired
    private GeneratorService generatorService;

	public AssociateWeeklyReportServiceLayer(AssociateWeeklyReportRepository awrr) {
		this.awrr = awrr;
	}

	public void setAwrr(AssociateWeeklyReportRepository awrr) {
		this.awrr = awrr;
	}
	
	public List<AssociateWeeklyReport> getAll() {
		return awrr.findAll();
	}
	
	public List<AssociateWeeklyReport> getAllbyId(Integer id) {
		return awrr.findByassId(id);
	}
	
	public List<AssociateWeeklyReport> doAll() {
		generatorService.generateReports(new int[]{1});
		return awrr.findAll();
	}
}
