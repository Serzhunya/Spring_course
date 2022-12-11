package aop.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)

public class LoggingAspect {

    @Before("aop.Aspects.MyPoincut.patternForSetMethods()")
    public void LoggingForSet() {
        System.out.println("Logging announce");
    }

}
