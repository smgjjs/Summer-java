package my.asd;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ave1;
		double ave;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int num1 =scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int num2 =scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int num3 =scan.nextInt();
		
		ave = (num1+num2+num3)/3;
		
		
		if(num1 > ave) {
			System.out.println("국어 점수는 평균 이상");
		}
		else {
			System.out.println("국어 점수는 평균 이하");
		}
		
		if(num2 > ave) {
			System.out.println("영어 점수는 평균 이상");
		}
		else {
			System.out.println("영어 점수는 평균 이하");
		}
		
		if(num3 > ave) {
			System.out.println("수학 점수는 평균 이상");
		}
		else {
			System.out.println("수학 점수는 평균 이하");
		}
		
	}

}
