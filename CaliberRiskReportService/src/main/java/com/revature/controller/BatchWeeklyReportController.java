/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.BatchWeeklyReport;
import com.revature.service.BatchWeeklyReportServiceLayer;

/**
 *
 * @author James
 */
@RestController
public class BatchWeeklyReportController {
    
    @Autowired
    private BatchWeeklyReportServiceLayer batchWeeklyReportServiceLayer;
    
    public BatchWeeklyReportController(BatchWeeklyReportServiceLayer batchWeeklyReportServiceLayer) {
        this.batchWeeklyReportServiceLayer = batchWeeklyReportServiceLayer;
    }
    
    @GetMapping("/reports/{id}")
    public ResponseEntity<List<BatchWeeklyReport>> getAllReports(@PathVariable("id") UUID idnum) {
        return ResponseEntity.ok(batchWeeklyReportServiceLayer.getAllReports(idnum));
    }
    
    @GetMapping("/reports")
    public ResponseEntity<List<BatchWeeklyReport>> getReports() {
    	List<BatchWeeklyReport> bwr = batchWeeklyReportServiceLayer.getReports();
    	return ResponseEntity.ok(bwr);
    }
}
