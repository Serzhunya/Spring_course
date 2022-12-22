package aop.Aspects;

import aop.Song;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)

public class LoggingAspect {

    @Before("aop.Aspects.MyPoincut.patternForSetMethods()")
    public void LoggingForSet(JoinPoint joinPoint) {
        System.out.println("Logging announce");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        methodSignature.getReturnType();
        Object[] args = joinPoint.getArgs();
        System.out.println(args.length);
        if(args[0] instanceof Song) {
            System.out.println(((Song) args[0]).getName());
            System.out.println(((Song) args[0]).getYear());
        }
    }

}
