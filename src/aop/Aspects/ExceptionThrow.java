package aop.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)

public class ExceptionThrow {
    @Before("aop.Aspects.MyPoincut.patternForSetMethods()")
    public void ExceptionThrow() {
        System.out.println("ExceptionThrow announce");
    }
}
