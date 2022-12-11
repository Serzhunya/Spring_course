package aop.Aspects;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MyPoincut {
    @Pointcut ("execution(* * (..))")
    public void patternForSetMethods(){}

}
