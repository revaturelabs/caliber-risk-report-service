/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.controller;

import com.revature.beans.BatchWeeklyReport;
import com.revature.repositories.BatchWeeklyReportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mark
 */
@RestController
public class BatchWeeklyReportController {
    
    @Autowired
    private BatchWeeklyReportRepository batchWeeklyReportRepository;
    
    // ------ Retrieve all Batch Weekly Reports --------------------------------------------------
    @GetMapping("/reports/all")
    public ResponseEntity<List<BatchWeeklyReport>> getAllBatchWeeklyReport() {
        
        System.out.println("Inside Get All BatchWeeklyReport");                 //debug
        
        // create iterable object from BatchWeeklyReport table in database
        List<BatchWeeklyReport> listBatchWeeklyReport = batchWeeklyReportRepository.findAll();
        
        //check if BatchWeeklyReport exist
        if (listBatchWeeklyReport.isEmpty()) {
            System.out.println("No BatchWeeklyReport found");                   //debug
            return new ResponseEntity(HttpStatus.NOT_FOUND);
            
        // if exists
        } else {
            System.out.println("Retrieved all BatchWeeklyReports");             //debug
            return new ResponseEntity(listBatchWeeklyReport, HttpStatus.OK);
        }
    }
    //-------------------------------------------------------------------------------------------
}
