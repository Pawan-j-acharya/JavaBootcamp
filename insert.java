package com.ALvas.demo;
import java.sql.*;
public class insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3360/student","root","root");
		Statement stmt=con.createStatement();
		stmt.execute("insert into student value(1,'pawan','achar20@gamil.com',9896)");
		stmt.close();
		con.close();
		
	}

}
