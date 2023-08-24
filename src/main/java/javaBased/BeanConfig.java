package javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "javaBased")
public class BeanConfig {
    @Bean
    public Doctor doctor() {
        return new Doctor();
    }
}
