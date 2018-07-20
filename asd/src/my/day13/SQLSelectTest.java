package my.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLSelectTest {
	
		
		public static Connection makeConnection() {
			// 1. ����̹� �ε��ϱ�.
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("����̹� �ε� ����.");
				
				//2. ������ ���̽� �����ϱ�.
					String url = "jdbc:mysql://localhost:3306/book_db?serverTimezone=UTC"; // ���� �ּ� �� �����ͺ��̽� �̸�
					con = DriverManager.getConnection(url, "root", "1234");
					System.out.println("�����ͺ��̽� ���� ����...!!!");
			} catch (Exception e) {
				
				System.out.println("����̹��� �������� �ʽ��ϴ�.");
				
				
			e.printStackTrace();
			}
			
			return con;
		}

		
		public static void main(String[] args) {


			// 3.Statement ��ü ����
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