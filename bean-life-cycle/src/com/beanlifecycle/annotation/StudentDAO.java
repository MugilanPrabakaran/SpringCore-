package com.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

        while (rs.next()) {
            String studid = rs.getString(1);
            System.out.println("Student Id is : "+studid );
        }

    }
}
