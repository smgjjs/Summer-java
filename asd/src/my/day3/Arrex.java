package my.day3;

import java.util.Arrays;

public class Arrex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String iArr[] = {"Hellow","Network","Programming","Good"};
		String iArr2[] = iArr;
		
		for(int i =0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "]" + iArr[i]);
			System.out.println("iArr2[" + i + "]" + iArr2[i]);
		}
		
		Arrays.sort(iArr);
		for(int i =0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "]" + iArr[i]);
			System.out.println("iArr2[" + i + "]" + iArr2[i]);
		}
		
	}

}
