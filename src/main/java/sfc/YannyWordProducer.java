package sfc;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("yanny")
@Component
public class YannyWordProducer implements WordProducer{

    @Override
    public String getWord() {
        return "yanny";
    }
}