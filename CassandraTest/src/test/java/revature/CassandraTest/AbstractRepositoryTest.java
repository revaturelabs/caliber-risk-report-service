package revature.CassandraTest;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.ecyrd.speed4j.log.Log;
import com.kenai.jnr.x86asm.Logger;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.XSlf4j;
import org.apache.thrift.transport.TTransportException;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.annotation.Import;
import java.io.IOException;
import java.util.Properties;
 

@Import(CassandraTestConfig.class)
@XSlf4j
public abstract class AbstractRepositoryTest {
 
    @BeforeClass
    public static void initCassandra() {
        try {
            Properties prop = new Properties();
            prop.load(AbstractRepositoryTest.class.getClassLoader().getResourceAsStream("application-test.properties"));
            String cassandraHosts = prop.getProperty("cassandra.hosts");
            String cassandraPort = prop.getProperty("cassandra.port");
 
            EmbeddedCassandraServerHelper.startEmbeddedCassandra("another-cassandra.yaml", 20000);
            //log.info("Connect to embedded db");
            Cluster cluster = Cluster.builder().addContactPoints(cassandraHosts).withPort(Integer.parseInt(cassandraPort)).build();
            Session session = cluster.connect();
 
           // log.info("Initialize keyspace");
            session.execute("create keyspace  \"mykeyspace\" WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};");
            session.execute("use \"mykeyspace\";");
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    @Before
    public void initTest() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @AfterClass
    public static void cleanCassandra() {
        EmbeddedCassandraServerHelper.cleanEmbeddedCassandra();
    }
 
}
