package Depinjectionobjecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        //This is Basic Object calling code
        /*Studentdemo studentset = new Studentdemo();
        Mathcheat cheat  = new Mathcheat();
        studentset.setMatchcheat(cheat);
        studentset.cheating();*/

        //Using Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("Depinjectionobjecttype/ObjectInjectionbean.xml");
        System.out.println("File is loaded");
        Studentdemo studentdemo = context.getBean("stu", Studentdemo.class);
        studentdemo.cheating();

        //Example  2 for another two student
        AnotherStudent antStu = context.getBean("anstu",AnotherStudent.class);
        antStu.anothercheat();

    }
}
