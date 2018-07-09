package my.day04;

public class BDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House house = new House();
		House house2 =new House();
		
		house.setownername("홍길동");
		house.setprice(2000);
		house.setRoomcount(3);

		
		house2.setownername("이몽룡");
		house2.setprice(3000);
		house2.setRoomcount(4);

		
		String name =house.getownername();
		System.out.println("house의 이름은:" + name);
		System.out.println("house의 가격은:" + house.getPrice());
		System.out.println("house의 집주인 이름은:" + house.getownername());
		
		System.out.println(house);
		System.out.println(house2);
		
	}

}
