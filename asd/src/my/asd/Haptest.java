package my.asd;

import java.util.Scanner;

public class Haptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0; 
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				a += i;
			} else { 
				b += i; 
			}
		}
		System.out.println("¦�� �� : " + a); 
		System.out.println("Ȧ�� �� : " + b); 
	}
}
