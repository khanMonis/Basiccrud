package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Employee;
import com.conn.JdbcConn;

public class EmployeeService {
	 public static int save(Employee e){  
	        int status=0;  
	        try{  
	            Connection con=JdbcConn.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into employee(name,address,email) values (?,?,?)");  
	            ps.setString(1,e.getName());  
	            ps.setString(2,e.getAddress());  
	            ps.setString(3,e.getEmail());  
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  

}
