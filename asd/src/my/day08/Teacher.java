package my.day08;

import java.util.Scanner;

public class  Teacher extends Human{
	private String id;
	private String subject;

	
	public String getId(){
		return id;
	}
	
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getSubject(){
		return subject;
	}
	
	public void setSubject(String subject){
		this.subject=subject;
	}
	
	
	public void inputInfo() {
		super.inputInfo();
		
		System.out.println("교번을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String h = scan.nextLine();
		
		setId(h);
		
		
		System.out.println("담당과목을 입력하시오");
		String hg = scan.nextLine();
		setSubject(hg);
		
	}

}
