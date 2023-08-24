package beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class BeanConfig {
//    @Bean
//    public Doctor doctor() {
//        return new Doctor();
//    }
}
