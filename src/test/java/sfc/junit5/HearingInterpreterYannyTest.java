package sfc.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import sfc.BaseConfig;
import sfc.HearingInterpreter;
import sfc.YannyConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = { BaseConfig.class, YannyConfig.class })
class HearingInterpreterYannyTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        Assertions.assertEquals("yanny", word);
    }
}