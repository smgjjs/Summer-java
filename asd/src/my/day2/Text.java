package my.asd;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하세요");
		int num1 =scan.nextInt();
		System.out.println("이름을 입력하세요");
		String  name =scan.next();
		
		System.out.println("학번은" + num1);
		System.out.println("이름은 " + name);

		
	}

}
