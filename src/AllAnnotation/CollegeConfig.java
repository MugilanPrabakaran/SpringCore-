package AllAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.security.Principal;

@Configuration
@ComponentScan(basePackages = "src/AllAnnotation")
public class CollegeConfig {
    @Bean
    public NewPrincipal principalBean() {
        return new NewPrincipal();
    }

    @Bean
    public College colleg(){
        return new College(principalBean());
    }
}
