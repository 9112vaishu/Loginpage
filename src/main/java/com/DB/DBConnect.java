package com.DB;
import java.sql.*;
import java.sql.DriverManager;



public class DBConnect {
	
private static Connection conn;
public static Connection DgetConnection()
{	
	 try {
        if(conn==null) {
			 Class.forName("com.mysql.jdbc.Driver");
			 String username ="root";
			 String password="Vaishu@123";
			 String url="jdbc:mysql://localhost:3306/loginpage";
			 conn=DriverManager.getConnection(url ,username,password);	
             System.out.println("Connection sucssesfull");
	       
        }
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
}
   
	


}
