package my.asd;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ave1;
		double ave;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		int num1 =scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int num2 =scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int num3 =scan.nextInt();
		
		ave = (num1+num2+num3)/3;
		
		
		if(num1 > ave) {
			System.out.println("���� ������ ��� �̻�");
		}
		else {
			System.out.println("���� ������ ��� ����");
		}
		
		if(num2 > ave) {
			System.out.println("���� ������ ��� �̻�");
		}
		else {
			System.out.println("���� ������ ��� ����");
		}
		
		if(num3 > ave) {
			System.out.println("���� ������ ��� �̻�");
		}
		else {
			System.out.println("���� ������ ��� ����");
		}
		
	}

}
