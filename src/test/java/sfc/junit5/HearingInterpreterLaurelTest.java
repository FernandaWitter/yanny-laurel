package sfc.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import sfc.BaseConfig;
import sfc.HearingInterpreter;
import sfc.LaurelConfig;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("base-test")
@SpringJUnitConfig(classes = { BaseConfig.class, LaurelConfig.class })
class HearingInterpreterLaurelTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("laurel", word);
    }
}