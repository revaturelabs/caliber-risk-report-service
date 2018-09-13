package revature.CassandraTest;
	
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

 
public interface SampleEntityRepository extends CassandraRepository<SampleEntity, String> {
    SampleEntity findById(UUID id);
}