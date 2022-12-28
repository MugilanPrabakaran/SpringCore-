package com.beanlifecycle.annotation;

import java.sql.*;

public class StudentDAO {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/studentinfo";
    private String userName = "root";
    private String password = "Mukil@2019";

    public void selectAllRows() throws Exception {
        //load driver
        Class.forName(driver);
        //Get a connection
        Connection connection = DriverManager.getConnection(url, userName, password);
        //execute query
        Statement state =  connection.createStatement();
        ResultSet rs = state.executeQuery("Select * from studentdetails");
        System.out.println("Retrieving all student records");

        while (rs.next())/* next() means run loop until empty space*/{
            String studid = rs.getString(1);
            System.out.println("Student Id is : "+studid );
        }
        //Closing the connection
        connection.close();

    }
    public void deleterec(int studid) throws Exception {
        //load driver
        Class.forName(driver);
        //Get a connection
        Connection connection = DriverManager.getConnection(url, userName, password);
        //execute query
        Statement stmt =  connection.createStatement();
        //Deleting the particular student details
        stmt.executeUpdate("Delete from studentdetails where studid ="+studid);
        System.out.println("Deleted the Student Info "+studid);
        //closing the connection
        connection.close();
    }

}
