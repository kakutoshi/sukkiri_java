//0-1
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("Hello World");
//	}
//}
//0-2
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("すがわら");
//	}
//}
//0-3
//public class Main {
//	public static void main(String[] args) {
//
//		System.out.println("すがわら");
//		System.out.println("31才です");
//		System.out.println("お酒が好きです");
//	}
//}
//0-5
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("すがわら");
//		System.out.println("31才です");
//		System.out.println("お酒が好きです");
//		System.out.println("31+31計算をします");
//		System.out.println(31 + 31);
//	}
//}
//0-6
//public class Main {
//	public static void main(String[] args) {
//		int x;
//		x = 6;
//		System.out.println(x * x * 3.14);
//
//	}
//}
//1-2
//public class Main {
//	public static void main(String[] args) {
//		int age;
//		age = 30;
//		System.out.println(age);
//
//	}
//}
//1-3
//public class Main {
//	public static void main(String[] args) {
//		int age = 20;
//		System.out.println("私の年齢は" + age);
//		age = 31;
//		System.out.println("・・・いや、本当の年齢は" + age);
//	}
//}

//1-5
//public class Main {
//	public static void main(String[] args) {
//		final double PI = 3.14;
//		int pie = 5;
//		System.out.println("半径" + pie + "㎝のパイの面積は、");
//		System.out.println(pie * pie * PI);
//		System.out.println("パイの半径を倍にします");
//		PI = 10;
//		System.out.println("半径" + pie + "㎝のパイの面積は、");
//		System.out.println(pie * pie * PI);
//
//	}
//}
//exe1-2
//public class Main {
//	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		int c = a * b;
//		System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);
//	}
//}
//exe1-3
//boolean result = true;
//char favoriteCharacter = '駆';
//double pi = 3.14;
//long number = 314159265853979L;
//String msg = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";

//2-1
//public class Main {
//	public static void main(String[] args) {
//		int a;
//		int b;
//		a = 20;
//		b = a + 5;
//		System.out.println(a);
//		System.out.println(b);
//
//	}
//}
//2-2
//public class Main {
//	public static void main(String[]args {
//		System.out.println("私の好きな記号は二重引用符(")です");
//	}
//}
//2-3
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("私の好きな記号は二重引用符(\")です");
//	}
//}

//2-4
//public class Main {
//	public static void main(String[] args) {
//		int a;
//		a = 100;
//		a++;
//		System.out.println(a);
//	}
//}
//
//public class Main {
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 10;
//		System.out.println(++a + 50);
//		System.out.println(b++ + 50);
//
//	}
//}

//2-5
//public class Main {
//	public static void main(String[] args) {
//		float f = 3;
//		double d = f;
//		System.out.println(f);
//		System.out.println(d);
//
//	}
//}

//2-6
//public class Main {
//	public static void main(String[] args) {
//		int i = 3.2;
//
//	}
//}

//2-7
//public class Main {
//	public static void main(String[] args) {
//		int age = (int) 3.2;
//		System.out.println(age);
//
//	}
//}

//2-8
//public class Main {
//	public static void main(String[] args) {
//		double d = 8.5 / 2;
//		long l = 5 + 2L;
//		System.out.println(d);
//		System.out.println(l);
//
//	}
//}

//2-9
//public class Main {
//	public static void main(String[] args) {
//		String msg = "私の年齢は" + 23;
//		System.out.println(msg);
//
//	}
//}

//2-10
//public class Main {
//	public static void main(String[] args) {
//		String name = "すがわら";
//		String message;
//		message = name + "さん、こんにちは";
//		System.out.println(message);
//
//	}
//}

//2-11
//public class Main {
//	public static void main(String[] args) {
//		String name = "すがわら";
//		System.out.print("私の名前は");
//		System.out.print(name);
//		System.out.print("です");
//
//	}
//}

//2-12
//public class Main {
//	public static void main(String[] args) {
//		int a = 5;
//		int b = 3;
//		int m = Math.max(a, b);
//		System.out.println("比較実験:" + a + "と" + b + "とで大きい方は・・・" + m);
//
//	}
//}

//2-13
//public class Main {
//	public static void main(String[] args) {
//		String age = "31";
//		int n = Integer.parseInt(age);
//		System.out.println("あなたは来年" + (n + 1) + "歳になりますね。");
//
//	}
//}

//2-14
//public class Main {
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(90);
//		System.out.println("あなたはたぶん、" + r + "歳ですね？");
//
//	}
//}

//2-15
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("あなたの名前を入力してください。");
//		String name = new java.util.Scanner(System.in).nextLine();
//		System.out.println("あなたの年齢を入力してください。");
//		int age = new java.util.Scanner(System.in).nextInt();
//		System.out.println("ようこそ" + age + "歳の" + name + "さん");
//
//	}
//}

//exe2-1
//public class Main {
//	public static void main(String[] args) {
//		int x = 5;
//		int y = 10;
//
//		String ans = "x+yは" + (x + y);
//		System.out.println(ans);
//	}
//}

//exe2-2
//2,4,5,7

//exe2-3
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("ようこそ占いの館へ");
//		System.out.println("あなたの名前を入力してください");
//		String name = new java.util.Scanner(System.in).nextLine();
//		System.out.println("あなたの年齢を入力してください");
//		String ageString = new java.util.Scanner(System.in).nextLine();
//		int age = Integer.parseInt(ageString);
//		int fortune = new java.util.Random().nextInt(4);
//		fortune++;
//		System.out.println("占いの結果が出ました！");
//		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
//		System.out.println("1:大吉2:中吉3:吉4:凶");
//
//	}
//}