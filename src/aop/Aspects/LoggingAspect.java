package aop.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LoggingAspect {

    @Pointcut ("execution(* set* (..))")
    private void patternForSetMethods(){}

    @Pointcut ("execution(* get* ())")
    private void patternForGetMethods(){}

    @Pointcut ("execution(* * (..))")
    private void patternForGetAndSetMethods(){}

    @Before("patternForGetMethods()")
    public void Logging() {
        System.out.println("Logging announce for get");
    }

    @Before("patternForGetMethods()")
    public void CheckSecurity() {
        System.out.println("CheckSecurity announce for get");
    }
    @Before("patternForGetMethods() || patternForSetMethods() ")
    public void CheckSecurity2() {
        System.out.println("CheckSecurity announce for set or get");
    }
}
