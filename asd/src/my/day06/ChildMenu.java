package my.day06;

public class ChildMenu extends ParentMenu{

	public ChildMenu() {
		
	}
	
	public void 쇠고기청국장() {
		System.out.println("쇠고기청국장");
	}
	
	public void 얼큰된장국() {
		System.out.println("얼큰된장국");
	}
	
	public void 콩나물국() {
		System.out.println("콩나물국");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildMenu childmenu = new ChildMenu();
		childmenu.청국장();
		childmenu.된장국();
		childmenu.갈비찜();
		childmenu.콩비지();
		childmenu.쇠고기청국장();
		childmenu.얼큰된장국();
		childmenu.콩나물국();
		

	}

}
