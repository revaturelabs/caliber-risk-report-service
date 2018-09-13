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
    
<<<<<<< HEAD
    /**
     * Fetches batch reports using getReports() and
     * calculates reports that have "too many reds"
     * in them based on hasTooManyReds(), and then
     * adds them to an ArrayList
     * 
	 * @see hasTooManyReds, getReports
	 * @author William Scott
	 * @return result	ArrayList of every report that has too many reds
	 */
    public List<BatchWeeklyReport> getReportsWithTooManyReds() {
=======
    public List<BatchWeeklyReport> getReportsWithConsecutiveReds() {
>>>>>>> juby
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
    
<<<<<<< HEAD
    /**
     * Fetches batch reports using getReports() and
     * calculates reports that have "too many reds"
     * in them based on the category of the batch
     * and then adds them to an ArrayList
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
    
=======
>>>>>>> juby
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
    
<<<<<<< HEAD
    /**
	 * Calculates whether a batch report has a red
	 * percentile over 40%
	 * 
	 * @see getCategoriesWithTooManyReds
	 * @author William Scott
	 * @return boolean	Whether or not a report contains 40% reds or more.
	 */
=======
>>>>>>> juby
    private boolean hasTooManyReds(List<BatchWeeklyReport> reports) {
    	int redCount = 0;
    	for (BatchWeeklyReport r: reports) {
    		if (r.isRed()) redCount++;
    	}
    	float redDensity = ((float) redCount)/((float) reports.size());
<<<<<<< HEAD
    	//if 4 out of every 10 are red
    	return redDensity >= .4;
    }
    
    /**
     * When a request is sent in, all Batch reports are generated
	 * and then sent in the response to generate them in Ember.
	 * 
     * @return batchWeeklyReportRepository	List of Batch Weekly Reports to be displayed
     */
    public List<BatchWeeklyReport> doAll() {
    	generatorService.generateReports(new int[]{0});
=======
    	return redDensity >= .4;
    }
    
    public List<BatchWeeklyReport> doAll() {
    	generatorService.generateBatchWeekly();
>>>>>>> juby
    	return batchWeeklyReportRepository.findAll();
    }
}
