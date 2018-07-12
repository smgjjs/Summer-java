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
		System.out.println("사번을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String h = scan.nextLine();
		
		setId(h);
		
		
		System.out.println("부서를 입력하시오");
		String hg = scan.nextLine();
		setDept(hg);
		
		
	}

public String getInfo() {
		
		String info= super.getInfo() +"\n사번:" + id + "\n부서: " +dept;
		return info;
	}
	
}
