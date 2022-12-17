package JDBC_Assigment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBC_Assigment/JDBCDemo.xml");
        JDBC_Demo JDBCs = context.getBean("jdbc", JDBC_Demo.class);
        JDBCs.displayjdbcinfo();
        JDBCs.getJDBCconnection();
    }
}
