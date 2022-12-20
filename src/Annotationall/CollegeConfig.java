package Annotationall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Annotationall")
public class CollegeConfig {
    @Bean(name = "collegeBean")
    public College collegeBean(){
        return new College();
    }
}
