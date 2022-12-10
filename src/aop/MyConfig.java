package aop;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("aop")
@PropertySource("classpath:myApp.properties")
@EnableAspectJAutoProxy

public class MyConfig {

}
