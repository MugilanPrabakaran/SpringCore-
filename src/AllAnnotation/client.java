package AllAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        //Here we are using replece ApplicationContext to AnnotationConfigApplicationContext to close the context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        System.out.println("XML file Loaded");
        College college = context.getBean("colleg", College.class);
        System.out.println("Spring created bean"+ college);
        college.test();
        context.close();
    }
}
