package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:App.properties")
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
