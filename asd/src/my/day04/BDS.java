package my.day04;

public class BDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House house = new House();
		House house2 =new House();
		
		house.setownername("ȫ�浿");
		house.setprice(2000);
		house.setRoomcount(3);

		
		house2.setownername("�̸���");
		house2.setprice(3000);
		house2.setRoomcount(4);

		
		String name =house.getownername();
		System.out.println("house�� �̸���:" + name);
		System.out.println("house�� ������:" + house.getPrice());
		System.out.println("house�� ������ �̸���:" + house.getownername());
		
		System.out.println(house);
		System.out.println(house2);
		
	}

}
