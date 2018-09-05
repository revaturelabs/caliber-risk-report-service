/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.repositories;

import com.revature.beans.BatchWeeklyReport;
import java.util.UUID;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mark
 */
@Repository
public interface BatchWeeklyReportRepository extends CassandraRepository<BatchWeeklyReport, UUID>{
    
}
