package my.day08;

import java.util.*;
import static java.lang.System.out;

public class Student extends Human{
	
	private String cname;
	private String id;

	
	public String getCname(){
		return cname;
	}
	
	public void setCname(String cname){
		this.cname =cname;
	}
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id =id;
	}
	
	public String getInfo() {
		
		String info= super.getInfo() +"\n�й�:" + id + "\n�б�: " +cname;
		return info;
	}

	//�л������� ����ϴ� �޼ҵ�
	public void inputInfo() {
		
		super.inputInfo();
		
		System.out.println("�й��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String nm = scan.nextLine();
		
		setId(nm);
		
		
		System.out.println("�б޸� �Է��Ͻÿ�");
		String ad = scan.nextLine();
		setCname(ad);
		
		
	}


}
