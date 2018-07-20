package my.day05;

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
		System.out.println(" 1.등록 2. 강사 3. 직원 4,상위메뉴 5.종료");
		System.out.println("---------------------------");
		System.out.println("번호를 입력하시오");
		System.out.println("---------------------------");

	}
	public void subMenu() {
		System.out.println("----------Main Menu ----------");
		System.out.println(" 1.학생 2. 강사 3. 직원 4,상위메뉴 ");
		System.out.println("---------------------------");
		System.out.println("번호를 입력하시오");
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
				System.out.println("숫자로 입력해야 해요");
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
				System.out.println("지원되지 않는 메뉴번호입니다");
			}
		}
	}
		
		
	public void addHuman(Human human) {
		if(count <p.length) {
			p[count++] =human;
		}
		else {
			System.out.println("30명 정원 초가 되었어요!");
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
	
	System.out.println(name + "이란 사람이 없어요!");
	return name+"이란 사람 없어요";
	
	}
	
	
	public String removePerson(String name) {
		for(int i =0; i< count; i++) {
			String pname = p[i].getname();
			if(name.equals(pname)) {
				for(int j=i; j<count; j++) {
					p[j] =p[j+1];
				}
				count--;
				System.out.println(name +"님의 정보가 삭제됐어요");
				return name+"님 정보가 삭제";
				
			}
		}
		System.out.println(name+"님은 없어요");
		return name+"님 없어요";
	}
		

}
