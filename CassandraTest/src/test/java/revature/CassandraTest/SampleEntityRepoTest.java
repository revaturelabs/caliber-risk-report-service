package revature.CassandraTest;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.datastax.driver.core.utils.UUIDs;
 
@ContextConfiguration
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
        Assert.assertEquals("Hi", retrievedSampleEntity.getText());
    }
    //other tests...
}
