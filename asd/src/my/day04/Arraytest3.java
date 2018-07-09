package my.day04;

public class Arraytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 ------------------");

		char ch[][] = new char[3][];

		ch[0] = new char[2];
		ch[1] = new char[4];
		ch[2] = new char[3];
		
		ch[0][0] ='H';
		ch[0][1] ='I';
		ch[1][0] ='J';
		ch[1][1] ='A';
		ch[1][2] ='V';
		ch[1][3] ='A';
		ch[2][0] ='A';
		ch[2][1] ='S';
		ch[2][2] ='K';
		
		
		for (int i = 0; i < ch.length; i++) {

			for(int j =0; j <ch[i].length; j++){
			System.out.println("ch[" + i + "]" + "[" + j + "] =" + ch[i][j]);
		}
	}
	}

}
