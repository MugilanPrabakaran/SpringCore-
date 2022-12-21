package AllAnnotation;

import org.springframework.context.annotation.*;

import java.security.Principal;

@Configuration
@ComponentScan(basePackages = "src/AllAnnotation")
@PropertySource("classpath:AllAnnotation/collegeInfo.properties")//used to link property files to Java JVM
public class CollegeConfig {
    /*@Bean
    public Teacher matchteacherBean() {
        //meaning  of the below return
        // Teacher matchteacherBean() = new Mathteacher();
        return new Mathteacher();
    }
    @Bean
    public NewPrincipal principalBean() {
        // meaning  of the below return
        // NewPrincipal principalBean() = new NewPrincipal();
        return new NewPrincipal();
    }

    @Bean
    public College colleg(){
      College college = new College();
      college.setPrincipal(principalBean());
      college.setTeacher(matchteacherBean());
      return college;
    }*/
}
