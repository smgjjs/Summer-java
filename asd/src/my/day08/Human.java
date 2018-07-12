package my.day08;

import java.util.Scanner;

public abstract class Human {

	private String name;
	private String address;
	
	public String getname() {
		
		return name;
	}
	
	public String getaddress() {
		
		return address;
	}
	
	public void setaddress(String address) {
		this.address =address;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public abstract void setId(String id);
	public abstract String getId();
	
	
	public void inputInfo() {
		System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String nm = scan.nextLine();
		
		setname(nm);
		
		
		System.out.println("주소를 입력하시오");
		String ad = scan.nextLine();
		setaddress(ad);
		
		
	}
	
	
	public String getInfo() {
		String info = "이름:" + name + "\n주소:" +address;
		return info;
	}
	
	public void printAll() {
		System.out.println(this.getInfo());
	}
	
	public String toString() {
		return name;
	}

}
