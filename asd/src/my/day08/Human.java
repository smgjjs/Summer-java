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
		System.out.println("�̸��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String nm = scan.nextLine();
		
		setname(nm);
		
		
		System.out.println("�ּҸ� �Է��Ͻÿ�");
		String ad = scan.nextLine();
		setaddress(ad);
		
		
	}
	
	
	public String getInfo() {
		String info = "�̸�:" + name + "\n�ּ�:" +address;
		return info;
	}
	
	public void printAll() {
		System.out.println(this.getInfo());
	}
	
	public String toString() {
		return name;
	}

}
