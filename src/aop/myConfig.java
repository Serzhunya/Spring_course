package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
    // эта аннотация позволяет искать @Component в пакете "aop"
@ComponentScan("aop")
    // эта аннотация позволяет за кулисами использовать Spring AOP Proxy
@EnableAspectJAutoProxy
public class myConfig {
}
