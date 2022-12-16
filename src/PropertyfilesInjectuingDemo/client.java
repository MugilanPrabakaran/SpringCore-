package PropertyfilesInjectuingDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("PropertyfilesInjectuingDemo/beans.xml");
        Student student = context.getBean("student",Student.class);
        student.displayinfo();
    }
}
