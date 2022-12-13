package SimpleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Samsung {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("SimpleProject/LoosuCoupling.xml");
    System.out.println("File is loaded");
    Airtel airtel  = context.getBean("ser", Airtel.class);
    airtel.activate();
    Vodafone vodafone = context.getBean("vod", Vodafone.class);
    vodafone.vodafActivating();
    }
}
