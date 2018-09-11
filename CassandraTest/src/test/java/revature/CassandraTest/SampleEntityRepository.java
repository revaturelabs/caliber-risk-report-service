package revature.CassandraTest;
	
import org.springframework.data.cassandra.repository.CassandraRepository;
 
import java.util.List;
import java.util.UUID;
 
public interface SampleEntityRepository extends CassandraRepository<SampleEntity> {
    SampleEntity findById(UUID id);
}