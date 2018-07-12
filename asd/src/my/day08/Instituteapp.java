package my.day08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Instituteapp {

	private Human[] p =new Human[30];
	private int count;
	public Human[] getP() {
		return p;
	}
	public int getCount() {
		return count;
	}
	
	public void mainMenu() {
		System.out.println("----------Main Menu ----------");
		System.out.println(" 1.��� 2. ���� 3. ���� 4,�����޴� 5.����");
		System.out.println("---------------------------");
		System.out.println("��ȣ�� �Է��Ͻÿ�");
		System.out.println("---------------------------");

	}
	public void subMenu() {
		System.out.println("----------Main Menu ----------");
		System.out.println(" 1.�л� 2. ���� 3. ���� 4,�����޴� ");
		System.out.println("---------------------------");
		System.out.println("��ȣ�� �Է��Ͻÿ�");
		System.out.println("---------------------------");
	}
	
	public void register() {
		Scanner sc = new Scanner(System.in);
		outer:
		while(true) {
			subMenu();
			int no =0;
			try {
				no =sc.nextInt();
			}
			
			catch(InputMismatchException e) {
				System.out.println("���ڷ� �Է��ؾ� �ؿ�");
				return ;
			}
			
			switch(no) {
			case 1:
				Student st = new Student();
				st.inputInfo();
				addHuman(st);
				break;	
				
			case 2:
				Teacher tc =new Teacher();
				tc.inputInfo();
				addHuman(tc);
				break;		
				
			case 3:
				Staff sf =new Staff();
				sf.inputInfo();
				addHuman(sf);
				break;		
				
			case 4:
				break outer;
				
			default:
				System.out.println("�������� �ʴ� �޴���ȣ�Դϴ�");
			}
		}
	}
		
		
	public void addHuman(Human human) {
		if(count <p.length) {
			p[count++] =human;
		}
		else {
			System.out.println("30�� ���� �ʰ� �Ǿ����!");
		}
	}
	
	
	public String findHuman(String name) {
		for(int i =0; i<count; i++) {
		
		String pname =p[i].getname();
		
		
		if(name.equals(pname)) {
			p[i].printAll();
			return p[i].getInfo();
		}
	}
	
	System.out.println(name + "�̶� ����� �����!");
	return name+"�̶� ��� �����";
	
	}
	
	
	public String removePerson(String name) {
		for(int i =0; i< count; i++) {
			String pname = p[i].getname();
			if(name.equals(pname)) {
				for(int j=i; j<count; j++) {
					p[j] =p[j+1];
				}
				count--;
				System.out.println(name +"���� ������ �����ƾ��");
				return name+"�� ������ ����";
				
			}
		}
		System.out.println(name+"���� �����");
		return name+"�� �����";
	}
		
	public String printAll() { 
				String str = ""; 
		 		for (int i = 0; i < count; i++) { 
		 			if (p[i] instanceof Student) { 
		 				str += "\n---�л�����---\n"; 
		 			} else if (p[i] instanceof Teacher) { 
		 				str += "\n---��������---\n"; 
		 			} else { 
		 				str += "\n---��������---\n"; 
		 			} 
		 			str += p[i].getInfo(); 
		 		} 
		 		System.out.println(str); 
		 		return str; 
		 	}// printAll()------- 
		 
		 
		 	public static void main(String[] args) { 
		 		Instituteapp sa = new Instituteapp(); 
		 		Scanner sc = new Scanner(System.in); 
		 		while (true) { 
		 			sa.mainMenu(); 
		 			// �޴� ��ȣ �Է� 
		 			int no = 0; 
		 			try { 
						no = sc.nextInt(); 
		 			} catch (InputMismatchException e) { 
		 				System.out.println("���ڷ� �Է��ؾ� �ؿ�"); 
		 				return; 
		 			} 
		 			switch (no) { 
		 			case 1:// ��� 
		 				sa.register(); 
		 				break; 
		 			case 2:// �˻� 
		 				System.out.println("�˻��� ��� �̸�=>"); 
		 				String name = sc.next(); 
		 				System.out.println("--" + name + "���� �˻��մϴ�.--"); 
		 				sa.findHuman(name); 
		 				break; 
		 			case 3:// ���� 
		 				System.out.println("������ ��� �̸�=>"); 
		 				name = sc.next(); 
		 				sa.removePerson(name); 
		 				break; 
		 			case 4:// ��� 
		 				sa.printAll(); 
		 				break; 
					case 5:// ���� 
						System.out.println("Bye Bye~~"); 
		 				System.exit(0); 
		 			} 
		 		} 

		 	}
}
