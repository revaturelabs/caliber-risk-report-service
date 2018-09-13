package Cassandra.Ctest;

import junit.framework.TestCase;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import org.apache.cassandra.exceptions.ConfigurationException;
import org.apache.thrift.transport.TTransportException;
import org.cassandraunit.AbstractCassandraUnit4TestCase;
import org.cassandraunit.CassandraCQLUnit;
import org.cassandraunit.dataset.DataSet;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.cassandraunit.dataset.yaml.ClassPathYamlDataSet;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class Cassandratest extends AbstractCassandraUnit4TestCase {
	
	 /*@Rule
	 public CassandraCQLUnit cassandraCQLUnit = new CassandraCQLUnit(new ClassPathCQLDataSet("sample.cql","caliber"));
	 
	@Before
	public void setup() throws ConfigurationException, TTransportException, IOException{
   	 EmbeddedCassandraServerHelper.startEmbeddedCassandra("/Ctest.yaml");
}*/ 
	
	
	@Test
	public void conntest() throws Exception{
		
		assertThat(getKeyspace(), notNullValue());
		assertThat(getKeyspace().getKeyspaceName(), is("caliberKeyspace"));
	}
	
	
	
	
	/*public void testexcuteCql() throws Exception {
		
		try
		{
			ResultSet result = cassandraCQLUnit.session.execute("select * from spellsColumnFamilyName");
		  ArrayList<Row> r = (ArrayList<Row>) result.all();
		  for(Row x :r) {
			  System.out.println(x); 
		  }
		}catch (Exception e){
			assertTrue(false);
		}
		assertTrue(true);
	} */
		

	@Override
	public DataSet getDataSet() {
		return new ClassPathYamlDataSet("Ctest.yaml");
	}
	
	
	
     
	
	
}
