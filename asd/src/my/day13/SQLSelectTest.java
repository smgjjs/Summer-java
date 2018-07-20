package my.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLSelectTest {
	
		
		public static Connection makeConnection() {
			// 1. 드라이버 로딩하기.
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("드라이버 로딩 성공.");
				
				//2. 데이터 베이스 연결하기.
					String url = "jdbc:mysql://localhost:3306/book_db?serverTimezone=UTC"; // 서버 주소 및 데이터베이스 이름
					con = DriverManager.getConnection(url, "root", "1234");
					System.out.println("데이터베이스 연결 성공...!!!");
			} catch (Exception e) {
				
				System.out.println("드라이버가 존재하지 않습니다.");
				
				
			e.printStackTrace();
			}
			
			return con;
		}

		
		public static void main(String[] args) {


			// 3.Statement 객체 생성
			Connection con = makeConnection();
			try {
				Statement st = con.createStatement();
				String sql = "SELECT book_id, title FROM books";
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()) {
					int id = rs.getInt("book_id");
					String title = rs.getString("title");
					
					System.out.println(id + "  " + title );
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}