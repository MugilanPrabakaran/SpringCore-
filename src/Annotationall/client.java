package Annotationall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Annotationall/collegebean.xml");
        System.out.println("XML  loaded");
        College college = context.getBean("collegeBean", College.class );
        System.out.println("Spring created Object using @Component" + college);
    }
}
