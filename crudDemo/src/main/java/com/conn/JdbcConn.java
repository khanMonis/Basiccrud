package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConn {
	 public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  

}
