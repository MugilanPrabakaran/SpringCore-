package DependencyInjectionDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentInj {
    public static void main(String[] args) {
        //Here we are Hardcoded the value
        studentdetails student = new studentdetails();
        student.setStuName("Mukil");
        student.studentDetails();
        //Using Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionDemo/SetterInjectionbean.xml");
        studentdetails student = context.getBean("student", studentdetails.class);
        studentdetails student2 = context.getBean("student2", studentdetails.class);
        student.studentDetails();
        student2.studentDetails();
        //Normal Constructor code
        studentdetails s1 = new studentdetails("Mugilan Prabakaran",01);
        s1.studentDetails();
        //Constructor Injection
        ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionDemo/SetterInjectionbean.xml");
        studentdetails student2 = context.getBean("student2", studentdetails.class);
        student2.studentDetails();
    }
}
