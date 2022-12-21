package AllAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        System.out.println("XML file Loaded");
        College college = context.getBean("colleg", College.class);
        System.out.println("Spring created bean"+ college);
        college.test();
    }
}
