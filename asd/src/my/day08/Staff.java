package my.day08;

import java.util.Scanner;

public class  Staff extends Human
{
	private String id;
	private String dept;
	

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	public String getDept(){
		return dept;
	}
	
	
	public void inputInfo() {
		System.out.println("����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String h = scan.nextLine();
		
		setId(h);
		
		
		System.out.println("�μ��� �Է��Ͻÿ�");
		String hg = scan.nextLine();
		setDept(hg);
		
		
	}

public String getInfo() {
		
		String info= super.getInfo() +"\n���:" + id + "\n�μ�: " +dept;
		return info;
	}
	
}
