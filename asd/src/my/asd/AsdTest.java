package my.asd;

import java.util.Scanner;

public class AsdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, resul;
		
		System.out.println("�����Է�:");
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		resul = a%2;
		
		switch(resul) {
		case 0:
			System.out.println("�������� ¦���Դϴ�");
			break;
		case 1:
			System.out.println("�������� Ȧ���Դϴ�");
			break;
		default:
			break;
		}
		
		
		
	}

}
