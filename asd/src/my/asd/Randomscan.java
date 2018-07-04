package my.asd;

import java.util.Random;
import java.util.Scanner;

public class Randomscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		int count = 0;
		System.out.println("이번 난수는:" + num);
		Scanner scan = new Scanner(System.in);

		
		
		while (true) {
			System.out.println("숫자 입력:");
			int num1 = scan.nextInt();

			if (num1 >= 0 && num1 <= 100) {

				count++;

				if (num1 == num) {
					System.out.println(count + "몇번에 맞춤");
					break;
				} else {
					System.out.println("틀림");
				}

			}

			else {
				System.out.println("숫자 초과");
			}

		}

	}

}
