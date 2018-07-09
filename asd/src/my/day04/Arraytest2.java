package my.day04;

public class Arraytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 ------------------");

		float arr[][] = {{0.1f,10} ,{011} , {10,'A',20}};


		for (int i = 0; i < arr.length; i++) {

			for(int j =0; j <arr[i].length; j++){
			System.out.println("arr[" + i + "]" + "[" + j + "] =" + arr[i][j]);
		}
	}
	}

}
