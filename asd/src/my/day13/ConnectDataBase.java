package my.day13;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDataBase { 
	
	
	public static Connection makeConnection(){
		
		Connection con =null;
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 로딩 성공");
		
		
		String url ="jdbc:mysql://localhost:3306/book_db";
		con = DriverManager.getConnection("", "root","1234");
		System.out.println("데이터 베이스 연결 성공");
		
		
		}
		
		catch (Exception e) {
			System.out.println("드라이버가 존제하지 않음");
		}
		
		return con;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectDataBase cd = new ConnectDataBase();
		Connection con =cd.makeConnection();
		
	}

}
