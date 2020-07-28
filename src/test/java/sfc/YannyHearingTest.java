package sfc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("base-test")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseConfig.class, YannyConfig.class})
public class YannyHearingTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    public void hearingYannyTest(){
        String word = hearingInterpreter.whatIHeard();
        Assert.assertEquals("yanny", word);
    }
}
