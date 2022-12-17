package JDBC_Assigment;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Demo {
    @Value("${myconnection.username}")
    private String username;
    @Value("${myconnection.password}")
    private String password;
    @Value("${myconnection.url}")
    private String url;
    @Value("${myconnection.driver}")
    private String driver;

    public void displayjdbcinfo(){
        System.out.println(username + " "+ password + " "+ url +" "+driver );
    }

    public void getJDBCconnection() throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,username,password);
        System.out.println("Connected Successfully : "+con);
    }
}
