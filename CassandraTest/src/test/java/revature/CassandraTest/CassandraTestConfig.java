package revature.CassandraTest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
 
 
@Configuration
@ActiveProfiles("test")
@PropertySource( {"classpath:application.properties",
        "classpath:application-test.properties"})
public class CassandraTestConfig extends CassandraConfig {
 
}
