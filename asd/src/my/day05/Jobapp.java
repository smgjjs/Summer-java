package my.day05;

import java.util.Scanner;

public class Jobapp {
	
	String name;
	int age;
	char sex;
	String phonnum;
	
	
	public void showmenu() {
		System.out.println("-----jop v 1.0 ------");
		System.out.println("1. 구직 등록");
		System.out.println("2. 구인 등록");
		System.out.println("3. 구직자 정보 출력");
		System.out.println("4. 구직회사 정보 출력");
		System.out.println("5. 종료");
		System.out.println("메뉴를 선택하시오");
		System.out.println("---------------------");
		
	}
	
	
	public static void inputPerson() {
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		System.out.println("구직 등록 하시오");
		System.out.println("이름 등록");
		String name =scan.next();
		person.setgeustname(name);
		System.out.println("나이 등록");
		person.setguestage(scan.nextInt());
		System.out.println("성별, 전화번호 입력");
		System.out.println("---성별 메뉴---");
		System.out.println("1. 남자  2. 여자");
		System.out.println("성별 메뉴 번호 입력");
		int s = scan.nextInt();
		
		if(s==1) {
			person.setsex('M');
		}
		else if(s ==2 ) {
			person.setsex('F');
		}
		else {
			System.out.println("잘못입력");
			
			
		}
		
			System.out.println("전화번호 입력");
			person.setguestphonnum(scan.next());
			String info = person.showProfile();
			System.out.println(info);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jobapp job = new Jobapp();
		Scanner scan = new Scanner(System.in);
		while(true) {
			job.showmenu();
			int no = scan.nextInt();
			if(no ==5) {
				System.out.println("END");
				System.exit(0);
			}
			else if(no ==1) {
				job.inputPerson();
				
			}
		}
		
		
		
	}

	
	
	
}
