package aop;

import org.springframework.stereotype.Component;

@Component("jassBean")
public class JassMusic implements Genre{
    public String name () {
        return "Jazz";
    }


}
