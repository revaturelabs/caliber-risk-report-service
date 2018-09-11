/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.service;

import com.revature.beans.BatchWeeklyReport;
import com.revature.repository.BatchWeeklyReportRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
    
    public BatchWeeklyReport getReportByReportIdAndDate(Integer idnum, Date reporttime) {
        return batchWeeklyReportRepository.findByIdnumAndReporttime(idnum, reporttime);
    }
    
    public List<BatchWeeklyReport> getAllReports(Integer idnum) {
        return batchWeeklyReportRepository.findByIdnum(idnum);
    }
    
    public List<BatchWeeklyReport> getReports() {
    	return batchWeeklyReportRepository.findAll();
    }
    
    public List<BatchWeeklyReport> getReportsWithConsecutiveReds() {
    	List<BatchWeeklyReport> result = new ArrayList<>();
    	HashMap<Integer, List<BatchWeeklyReport>> map = new HashMap<>();
    	
    	for (BatchWeeklyReport r: getReports()) {
    		Integer id = r.getIdnum();
    		if (!map.containsKey(id)) {
    			List<BatchWeeklyReport> newList = new ArrayList<>();
    			newList.add(r);
    			map.put(id, newList);
    		} else {
    			map.get(id).add(r);
    		}
    	}
    	
    	for (List<BatchWeeklyReport> i: map.values()) {
    		if (hasConsecutiveReds(i)) result.addAll(i);
    	}
    	
    	return result;
    }
    
    private boolean hasConsecutiveReds(List<BatchWeeklyReport> reports) {
    	boolean prevIsRed = false;
    	boolean currIsRed;
    	for (BatchWeeklyReport r: reports) {
    		currIsRed = r.isRed();
    		if (currIsRed && prevIsRed) return true;
    		prevIsRed = currIsRed;
    	}
    	return false;
    }
}
