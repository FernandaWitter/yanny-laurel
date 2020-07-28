package sfc.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import sfc.HearingInterpreter;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("component-scan")
@SpringJUnitConfig(classes = HearingInterpreterComponentScannerTest.TestConfig.class)
class HearingInterpreterComponentScannerTest {

    @Profile("component-scan")
    @Configuration
    @ComponentScan("sfc")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("laurel", word);
    }
}
