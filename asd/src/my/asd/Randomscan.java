package my.asd;

import java.util.Random;
import java.util.Scanner;

public class Randomscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		int count = 0;
		System.out.println("�̹� ������:" + num);
		Scanner scan = new Scanner(System.in);

		
		
		while (true) {
			System.out.println("���� �Է�:");
			int num1 = scan.nextInt();

			if (num1 >= 0 && num1 <= 100) {

				count++;

				if (num1 == num) {
					System.out.println(count + "����� ����");
					break;
				} else {
					System.out.println("Ʋ��");
				}

			}

			else {
				System.out.println("���� �ʰ�");
			}

		}

	}

}
