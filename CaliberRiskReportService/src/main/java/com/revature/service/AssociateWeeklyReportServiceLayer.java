package com.revature.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.AssociateWeeklyReport;
import com.revature.repository.AssociateWeeklyReportRepository;


/**
 * @author David Martinez
 *
 */
@Service
public class AssociateWeeklyReportServiceLayer {

	@Autowired
	private AssociateWeeklyReportRepository awrr;
	
	@Autowired
    private GeneratorService generatorService;

	
	/**
	 * @param awrr	repository for AssociateWeeklyReport bean
	 */
	public AssociateWeeklyReportServiceLayer(AssociateWeeklyReportRepository awrr) {
		this.awrr = awrr;
	}
	
	/**
	 * setter for AssociateWeeklyReport table in the Cassandra database
	 * 
	 * @param awrr	repository for AssociateWeeklyReport bean
	 */
	public void setAwrr(AssociateWeeklyReportRepository awrr) {
		this.awrr = awrr;
	}

	/**
	 * Retrieve a list of all Associate Weekly Reports
	 * 
	 * @return	list of mapped awrr entries
	 */
	public List<AssociateWeeklyReport> getAll() {
		return awrr.findAll();
	}

	/**
	 * Retrieve a list of Associate Weekly Reports based on ID
	 * 
	 * @param id	ID of a specifically requested Associate
	 * @return		list of mapped awrr entries based on given ID
	 */
	public List<AssociateWeeklyReport> getAllbyId(Integer id) {
		return awrr.findByassId(id);
	}

	/**
	 * Retrieve a list of Associate Weekly Reports with too many reds
	 * 
	 * @author William Scott
	 * @return		list of mapped awrr entries with too many reds
	 */
	public List<AssociateWeeklyReport> getReportsWithToManyReds() {
		List<AssociateWeeklyReport> result = new ArrayList<>();
		HashMap<Integer, List<AssociateWeeklyReport>> map = new HashMap<>();

		for (AssociateWeeklyReport r : getAll()) {
			Integer id = r.getAssId();
			if (!map.containsKey(id)) {
				List<AssociateWeeklyReport> newList = new ArrayList<>();
				newList.add(r);
				map.put(id, newList);
			} else {
				map.get(id).add(r);
			}
		}

		for (List<AssociateWeeklyReport> i : map.values()) {
			if (hasTooManyReds(i)) result.addAll(i);
		}
		
		return result;
	}

	/**
	 * Checks Associate Weekly Reports to calculate whether or not they meet the 
	 * requirement for having too many reds (30%) before adding it to an ArrayList
	 * 
	 * @see		getReportsWithToManyReds
	 * @author 	William Scott
	 * @return	boolean saying whether or not given associate is below a certain threshold or not
	 */
	private boolean hasTooManyReds(List<AssociateWeeklyReport> reports) {
		int redCount = 0;
		for (AssociateWeeklyReport r : reports) {
			if (r.isRed())
				redCount++;
		}
		float redDensity = ((float) redCount) / ((float) reports.size());
		return redDensity >= 0.3;	
	}
	
	/**
	 * When a request is sent in, all Associate reports are generated
	 * and then sent in the response to generate them in Ember.
	 * 
	 * @return awrr		List of Associate Weekly Reports to be displayed
	 */
	public List<AssociateWeeklyReport> doAll() {
		generatorService.generateReports(new int[]{1});
		return awrr.findAll();
	}
}
