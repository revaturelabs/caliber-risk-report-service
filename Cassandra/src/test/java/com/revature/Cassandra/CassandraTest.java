package com.revature.Cassandra;

import com.datastax.driver.core.Session;
import org.cassandraunit.CassandraCQLUnit;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.junit.*;


import java.util.List;
import java.util.Optional;


public class CassandraTest 
{
	//It looks like the Database needs to be loaded via a CQL file
	@Rule
	public CassandraCQLUnit cassandraCQLUnit = new CassandraCQLUnit(new ClassPathCQLDataSet("LoadDataCassandra.cql", false, false));

	@After
    public void cleanUp() {
        EmbeddedCassandraServerHelper.cleanEmbeddedCassandra();
    }
    public void testGetBatchWeeklyReport()
    {
    	
    }
}
