package aop.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

public class MyPoincut {
    @Pointcut ("execution(* add* (..))")
    public void patternForSetMethods(){
    }

}
