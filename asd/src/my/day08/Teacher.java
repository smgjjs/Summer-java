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
		
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String h = scan.nextLine();
		
		setId(h);
		
		
		System.out.println("�������� �Է��Ͻÿ�");
		String hg = scan.nextLine();
		setSubject(hg);
		
	}

}
