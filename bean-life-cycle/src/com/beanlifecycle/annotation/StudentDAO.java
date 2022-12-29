package com.beanlifecycle.annotation;

import org.springframework.web.bind.annotation.PostMapping;

import java.sql.*;

public class StudentDAO {
    Connection connection;
    private String driver ;
    private String url ;

    private String userName;
    private String password;
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void createConnection() throws Exception{

     System.out.println("Creating connection to DB");
        //load driver
        Class.forName(driver);
        //Get a connection
        connection = DriverManager.getConnection(url, userName, password);
    }

    public void selectAllRows() throws Exception {
        createConnection();
        //execute query
        Statement state =  connection.createStatement();
        ResultSet rs = state.executeQuery("Select * from studentdetails");
        System.out.println("Retrieving all student records");

        while (rs.next())/* next() means run loop until empty space*/{
            String studid = rs.getString(1);
            System.out.println("Student Id is : "+studid );
        }
    }
    public void deleterec(int studid) throws Exception {
        createConnection();
        Statement stmt =  connection.createStatement();
        //Deleting the particular student details
        stmt.executeUpdate("Delete from studentdetails where studid ="+studid);
        System.out.println("Deleted the Student Info "+studid);
    }

    public void closConnection()throws Exception{
        //Closing the connection
        connection.close();
    }
}
