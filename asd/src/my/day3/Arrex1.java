package my.day3;

public class Arrex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iArr[] = {10,20,30,40,50};
		int iArr2[] = iArr;
		
		for(int i =0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "]" + iArr[i]);
			System.out.println("iArr[" + i + "]" + iArr2[i]);
		}
		
		
		iArr2[0] =100;
		iArr2[1] =200;
		iArr2[2] =300;
		iArr2[3] =400;
		iArr2[4] =500;
		
		
		for(int i =0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "]" + iArr[i]);
			System.out.println("iArr[" + i + "]" + iArr2[i]);
		}

	}

}
