package sfc.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import sfc.HearingInterpreter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestPropertySource("classpath:laurel.properties")
@ActiveProfiles("externalized")
@SpringJUnitConfig(classes = PropertiesLaurelClass.TestConfig.class)
public class PropertiesLaurelClass {

    @Configuration
    @ComponentScan("sfc")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("LauReL", word);
    }
}