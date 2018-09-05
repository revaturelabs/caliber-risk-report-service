/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.controller;

import com.revature.beans.BatchWeeklyReport;
import com.revature.service.BatchWeeklyReportServiceLayer;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    
//    @GetMapping("/reports/{id}")
//    public BatchWeeklyReport findReportById(@PathVariable("id") UUID idnum, ) {
//        return batchWeeklyReportServiceLayer.getReportByReportIdAndDate(idnum, reporttime);
//    }
    
    @GetMapping("/reports/{id}")
    public List<BatchWeeklyReport> getAllReports(@PathVariable("id") UUID idnum) {
        return batchWeeklyReportServiceLayer.getAllReports(idnum);
    }
    
}
