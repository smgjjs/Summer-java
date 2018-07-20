package my.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyQuery4 {
	public static void main(String[] args) 
			throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/member?serverTimezone=UTC";
			Connection con = DriverManager.getConnection(url, "root", "1234");
			System.out.println("DB����~~");
			Statement st=con.createStatement();

			BufferedReader key
				=new BufferedReader(
					new InputStreamReader(System.in));

			String sql="";
			System.out.println("SQL���� �Է��ϼ�[�ƹ��ų�]=>");
			while((sql=key.readLine())!=null){
				//�Է¹��� sql������ �ϴ� ���� 
				boolean isRs=st.execute(sql);
				ResultSet rs=null;
				int updateCount=0;
				if(isRs){
				//isRs �� true-->select��--->ResultSet���ͼ�
				//�� ����� ���
					rs=st.getResultSet();
					System.out.println("---------------------------");
					System.out.println("ID\tNAME\tTEL\tADDR");
					System.out.println("---------------------------");
					while(rs.next()){
						 int id=rs.getInt(1);
						 //String id=rs.getString(1);
						 String name=rs.getString(2);
						 String tel=rs.getString(3);
						 String addr=rs.getString(4);
						 System.out.println(id+"\t"+name+"\t"+tel+"\t"+addr);
					}//while--------
					if(rs!=null) rs.close();
				}else{
				//isRs�� false--->DML��---> ����� ���ڵ�� ���
					updateCount=st.getUpdateCount();
					System.out.println(updateCount+"���� ���ڵ� ����");
				}
			}//while----------

			if(key!=null) key.close();	
			if(st!=null) st.close();
			if(con!=null) con.close();
		}
	}