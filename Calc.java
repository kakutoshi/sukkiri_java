//6-1
//public class Calc {
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 2;
//		int total = tasu(a, b);
//		int delta = hiku(a, b);
//		System.out.println("足すと" + total + "、引くと" + delta);
//	}
//
//	public static int tasu(int a, int b) {
//		return (a + b);
//	}
//
//	public static int hiku(int a, int b) {
//		return (a - b);
//	}
//
//}

//6-3 6-4
public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		// 明示的に所属CalcLogicを示す
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}