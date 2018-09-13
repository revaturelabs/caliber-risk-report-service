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
 * @author Jimmy Duffy, David Martinez
 */
@Service
public class BatchWeeklyReportServiceLayer {
    
    @Autowired
    private BatchWeeklyReportRepository batchWeeklyReportRepository;
    
    @Autowired
    private GeneratorService generatorService;
    
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
    
    /**
	 * 
	 * @author William Scott
	 * @return
	 */
    public List<BatchWeeklyReport> getReportsWithTooManyReds() {
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
    		if (hasTooManyReds(i)) result.addAll(i);
    	}
    	
    	return result;
    }
    
    /**
	 * 
	 * @author William Scott
	 * @return
	 */
    public List<BatchWeeklyReport> getCategoriesWithTooManyReds() {
    	List<BatchWeeklyReport> result = new ArrayList<>();
    	HashMap<String, List<BatchWeeklyReport>> map = new HashMap<>();
    	
    	for (BatchWeeklyReport r: getReports()) {
    		String category = r.getCategoryname();
    		if (!map.containsKey(category)) {
    			List<BatchWeeklyReport> newList = new ArrayList<>();
    			newList.add(r);
    			map.put(category, newList);
    		} else {
    			map.get(category).add(r);
    		}
    	}
    	
    	for (List<BatchWeeklyReport> i: map.values()) {
    		if (hasTooManyReds(i)) result.addAll(i);
    	}
    	
    	return result;
    }
    
    /*
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
    */
    
    /**
	 * 
	 * @author William Scott
	 * @return
	 */
    private boolean hasTooManyReds(List<BatchWeeklyReport> reports) {
    	int redCount = 0;
    	for (BatchWeeklyReport r: reports) {
    		if (r.isRed()) redCount++;
    	}
    	float redDensity = ((float) redCount)/((float) reports.size());
    	//if 4 out of every 10 are red
    	return redDensity >= .4;
    }
    
    public List<BatchWeeklyReport> doAll() {
    	generatorService.generateReports(new int[]{0});
    	return batchWeeklyReportRepository.findAll();
    }
}
