package sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
//		Box<Integer> box1 = new Box<Integer>();
//		int intValue = box1.get();
		
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.<String>boxing("홍길동");
		String strValue = box2.get();
		

	}

}
