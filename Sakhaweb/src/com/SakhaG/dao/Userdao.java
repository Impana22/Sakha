package com.SakhaG.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Userdao {
	public boolean getData(String username,String password) throws SQLException {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Welcome","sakha-impana","123");
		 PreparedStatement ps=con.prepareStatement("select * from user where username=? and password=?");
		 ps.setString(1, username);
		 ps.setString(2, password);
		 ResultSet rs=ps.executeQuery();
		 if(rs.next()) {
			 return true;
		 }
		return false;
		
	}

}
