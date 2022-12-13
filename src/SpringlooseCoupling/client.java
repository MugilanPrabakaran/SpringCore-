package SpringlooseCoupling;

import Depinjectionobjecttype.AnotherStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {

        //Using Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringlooseCoupling/ObjectInjectionbean.xml");
        System.out.println("File is loaded");
        Studentdemo studentdemo = context.getBean("stu", Studentdemo.class);
        studentdemo.cheat();
    }
}
