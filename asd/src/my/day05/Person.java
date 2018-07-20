package my.day05;

public class Person {
	
	String name;
	int age;
	char sex;
	String phonnum;
	
	
	
	public Person() {
		
		
		
	}
	
	
	public Person(String name, int age, char sex, String phonnum) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phonnum = phonnum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public void setgeustname(String name) {
		this.name =name;
		
	}
	
	public void setguestage(int age ) {
		this.age = age;
	}
	
	public void setsex(char sex) {
		this.sex = sex;
	}
	
	public void setguestphonnum(String phonnum) {
		this.phonnum = phonnum;
	}

	
	
	
	
	public String getgeustname(String name) {
		return name;
		
	}
	
	public int getguestage(int age ) {
		return age;
	}
	
	public char getsex(char sex) {
		return sex;
	}
	
	public String getguestphonnum(String phonnum) {
		return phonnum;
	}
	
	
	
	
	public String showProfile() {
		String info = "---" + name + "프로필 ---";
		info+= "\n 나이:" + age;
		info+= "\n 성별:" + sex;
		info+= "\n 전화:" + phonnum;
		return info;
		
		
	}
	
	public Person[] addPerson() {
		
		Person[] person = new Person[10];
		
		for(int i =0; i <person.length; i++) {
			person[i] = new Person();
		}
		
		return person;
	}
	
	
	
	
}
