package my.asd;

import java.util.Scanner;

public class AsdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, resul;
		
		System.out.println("숫자입력:");
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		resul = a%2;
		
		switch(resul) {
		case 0:
			System.out.println("나머지는 짝수입니다");
			break;
		case 1:
			System.out.println("나머지는 홀수입니다");
			break;
		default:
			break;
		}
		
		
		
	}

}
