package my.day06;

public class MainClass {
	
	private int age;
	private int height;
	private int weight;
	private String phonenum;
	
	
	public MainClass() {
		
		
	}
	
	
	public MainClass(int age, int height, int weight, String phonenum) {
		this(age,height,weight);
		this.phonenum = phonenum;
		
	}
	
	public MainClass(int age, int height, int weight) {		
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	public MainClass(int age, int height) {		
		this.age = age;
		this.height = height;
		
	}
	
	
	public double calculateBMI() {
		double result =weight/(height/100.0*height/100);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass mc = new MainClass(26, 176,63,"010-3672-6776");
		System.out.println(mc.calculateBMI());

	}

}
