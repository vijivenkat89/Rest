package com.telusko.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class AlienRepository {
	
	Connection con=null;
	
	public AlienRepository()
	{
		
		try {
		String url="jdbc:mysql://localhost:3306/restdb";
		String username="root";
		String password="Dalu@3018";
		Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url, username, password);
		}
		catch(Exception e) {
		System.out.println(e);}
	}
	
 public List<Alien> getAliens() throws SQLException
 {
	 List<Alien> aliens=new ArrayList<>();
 	String sql="select * from calien";
	Statement st=con.createStatement(); 
 	 ResultSet rs=st.executeQuery(sql);
 	 while(rs.next())
 	 {
 		 Alien a=new Alien();
 		 a.setCid(rs.getInt(1));
 		 a.setCname(rs.getString(2));
 		 a.setCaddress1(rs.getString(3));
 		 a.setCaddress2(rs.getString(4));
 		 a.setCtown(rs.getString(5));
 		 a.setCcounty(rs.getString(6));
 		 a.setCcountry(rs.getString(7));
 		 a.setCpostcode(rs.getString(8));
 		aliens.add(a);
 	 }
	 return aliens;
 }
 public Alien getAlien(int id) throws SQLException
 {
	 Alien a=new Alien();
	 
	 String sql="select * from calien where cid=" +id;
		Statement st=con.createStatement(); 
	 	 ResultSet rs=st.executeQuery(sql);
	 	 while(rs.next())
	 	 {
	 		 a.setCname(rs.getString(2));
	 		 a.setCaddress1(rs.getString(3));
	 		 a.setCaddress2(rs.getString(4));
	 		 a.setCtown(rs.getString(5));
	 		 a.setCcounty(rs.getString(6));
	 		 a.setCcountry(rs.getString(7));
	 		 a.setCpostcode(rs.getString(8));
	 		
	 	 }
		 return a;
 }
public void create(Alien a1) throws SQLException {
	
	 Alien a=new Alien();
	 String sql="insert into calien values(?,?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql); 
		st.setInt(1, a.getCid());
		st.setString(2, a.getCname());
		st.setString(3, a.getCaddress1());
		st.setString(4, a.getCaddress2());
		st.setString(5, a.getCtown());
		st.setString(6, a.getCcounty());
		st.setString(7, a.getCcountry());
		st.setString(8, a.getCpostcode());
		st.executeUpdate();
	 	
	
}
}
