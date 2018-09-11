package com.revature;

import org.cassandraunit.CassandraCQLUnit;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.datastax.driver.core.ResultSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QcReportApplicationTests {

	@Rule
	public CassandraCQLUnit ccu = new CassandraCQLUnit(new ClassPathCQLDataSet("tables.cql","keyspaceNameToCreate"));
	
	@Test
	public void contextLoads() throws Exception {
		
        ResultSet result = cassandraCQLUnit.session.execute("select * from mytable WHERE id='myKey01'");
        assertThat(result.iterator().next().getString("value"), is("myValue01"));
	}

}
