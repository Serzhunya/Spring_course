package aop;

import org.springframework.stereotype.Component;

@Component("rockBean")
public class RockMusic implements Genre {
    public String name () {
        return "Rock";
    }

}
