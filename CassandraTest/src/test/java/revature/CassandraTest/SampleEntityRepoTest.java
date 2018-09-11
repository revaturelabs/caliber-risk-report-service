package revature.CassandraTest;

import com.datastax.driver.core.utils.UUIDs;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import java.util.List;
import java.util.UUID;
 
 
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleEntityRepoTest extends AbstractRepositoryTest {
 
    @Autowired
    SampleEntityRepository sampleEntityRepository;
 
    @Test
    public void saveOneTest() {
        UUID id = UUIDs.timeBased();
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setId(id);
        sampleEntity.setText("Hi");
        sampleEntity = sampleEntityRepository.save(sampleEntity);
        SampleEntity retrievedSampleEntity = sampleEntityRepository.findById(id);
        Assert.assertEquals("Hi", sampleEntity.getText());
    }
    //other tests...
}
