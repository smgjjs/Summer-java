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
		
		String info= super.getInfo() +"\n학번:" + id + "\n학급: " +cname;
		return info;
	}

	//학생정보를 출력하는 메소드
	public void inputInfo() {
		
		super.inputInfo();
		
		System.out.println("학번을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String nm = scan.nextLine();
		
		setId(nm);
		
		
		System.out.println("학급를 입력하시오");
		String ad = scan.nextLine();
		setCname(ad);
		
		
	}


}
