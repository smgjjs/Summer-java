package my.day04;

import java.util.Scanner;

public class Gugutest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 입력하시오");
		int dan = scan.nextInt();
		Gugudan(dan);
		

		}
	public static void Gugudan(int dan) {
		
		for(int i =1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}

}
