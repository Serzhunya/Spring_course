package aop.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)

public class CheckSecurity {
    @Before("aop.Aspects.MyPoincut.patternForSetMethods()")
    public void CheckSecurityForSet() {
        System.out.println("CheckSecurity announce");
    }
}
