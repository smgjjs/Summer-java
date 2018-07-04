package my.asd;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		double area;
		
		System.out.println("반지름을 적으시오");
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		area =radius*radius*3.14;
		System.out.println("원지 면적은"+ area);

	}

}
