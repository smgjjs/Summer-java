package my.day05;

import java.util.Scanner;

public class Jobapp {
	
	String name;
	int age;
	char sex;
	String phonnum;
	
	
	public void showmenu() {
		System.out.println("-----jop v 1.0 ------");
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ���");
		System.out.println("3. ������ ���� ���");
		System.out.println("4. ����ȸ�� ���� ���");
		System.out.println("5. ����");
		System.out.println("�޴��� �����Ͻÿ�");
		System.out.println("---------------------");
		
	}
	
	
	public static void inputPerson() {
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		System.out.println("���� ��� �Ͻÿ�");
		System.out.println("�̸� ���");
		String name =scan.next();
		person.setgeustname(name);
		System.out.println("���� ���");
		person.setguestage(scan.nextInt());
		System.out.println("����, ��ȭ��ȣ �Է�");
		System.out.println("---���� �޴�---");
		System.out.println("1. ����  2. ����");
		System.out.println("���� �޴� ��ȣ �Է�");
		int s = scan.nextInt();
		
		if(s==1) {
			person.setsex('M');
		}
		else if(s ==2 ) {
			person.setsex('F');
		}
		else {
			System.out.println("�߸��Է�");
			
			
		}
		
			System.out.println("��ȭ��ȣ �Է�");
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
