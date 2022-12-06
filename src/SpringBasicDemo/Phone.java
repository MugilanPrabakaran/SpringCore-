package SpringBasicDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded");
        //Typecasting
        airtel Airtel = (airtel) context.getBean("Airtel");
        Airtel.calling();
        Airtel.data();
        //Another Method of typecasting
        //Calling jio sim function without changing code main class and changed code in bean.xml
        Sim sim = context.getBean("Sim",jio.class);
        sim.data();
        sim.calling();
    }
}
