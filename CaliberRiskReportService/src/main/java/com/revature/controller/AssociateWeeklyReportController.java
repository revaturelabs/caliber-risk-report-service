package com.revature.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.AssociateWeeklyReport;
import com.revature.service.AssociateWeeklyReportServiceLayer;

/**
 * @author Mark Bedoya, David Martinez
 *
 */

@CrossOrigin
@RestController
public class AssociateWeeklyReportController {
	@Autowired
	private AssociateWeeklyReportServiceLayer awrsl;

	public AssociateWeeklyReportController(AssociateWeeklyReportServiceLayer awrsl) {
		this.awrsl = awrsl;
	}

	@GetMapping(value="/associates")
	public ResponseEntity<List<AssociateWeeklyReport>> getAll() {
		List<AssociateWeeklyReport> reports = awrsl.getAll();
		return ResponseEntity.ok(reports);
	}
	
	@GetMapping(value="/associates/{id}")
	public ResponseEntity<List<AssociateWeeklyReport>> getAllbyId(@PathVariable("id") Integer id) {
		List<AssociateWeeklyReport> reports = awrsl.getAllbyId(id);
		return ResponseEntity.ok(reports);
	}
	
	@GetMapping(value="/adoall")
	public ResponseEntity<List<AssociateWeeklyReport>> doAll() {
		List<AssociateWeeklyReport> reports = awrsl.doAll();
		return ResponseEntity.ok(reports);
	}
	
	@GetMapping(value="/red/associates")
	public ResponseEntity<List<AssociateWeeklyReport>> getReds() {
		List<AssociateWeeklyReport> reports = awrsl.getReportsWithToManyReds();
		return ResponseEntity.ok(reports);
	}
}
