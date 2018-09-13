package com.revature.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	private boolean hasTooManyReds(List<AssociateWeeklyReport> reports) {
		int redCount = 0;
		for (AssociateWeeklyReport r : reports) {
			if (r.isRed())
				redCount++;
		}
		float redDensity = ((float) redCount) / ((float) reports.size());
		return redDensity >= 0.3;	
	}
	
	public List<AssociateWeeklyReport> doAll() {
		generatorService.generateReports(new int[]{1});
		return awrr.findAll();
	}
}
