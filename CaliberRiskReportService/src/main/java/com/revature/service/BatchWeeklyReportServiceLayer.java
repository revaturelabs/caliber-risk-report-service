/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.service;

import com.revature.beans.BatchWeeklyReport;
import com.revature.repository.BatchWeeklyReportRepository;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author James
 */
@Service
public class BatchWeeklyReportServiceLayer {
    
    @Autowired
    private BatchWeeklyReportRepository batchWeeklyReportRepository;
    
    public BatchWeeklyReportServiceLayer(BatchWeeklyReportRepository batchWeeklyReportRepository) {
        this.batchWeeklyReportRepository = batchWeeklyReportRepository;
    }
    
    public BatchWeeklyReport getReportByReportIdAndDate(UUID idnum, Date reporttime) {
        return batchWeeklyReportRepository.findByIdnumAndReporttime(idnum, reporttime);
    }
    
    public List<BatchWeeklyReport> getAllReports(UUID idnum) {
        return batchWeeklyReportRepository.findByIdnum(idnum);
    }
    
    public List<BatchWeeklyReport> getReports() {
    	return batchWeeklyReportRepository.findAll();
    }
}