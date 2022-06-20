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

//3-1
//public class Main {
//	public static void main(String[] args) {
//		boolean tenki = true;
//		if (tenki == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩にいきます");
//		} else {
//			System.out.println("DVDを観ます");
//		}
//
//	}
//}

//3-2
//public class Main {
//	public static void main(String[] args) {
//		boolean doorClose = true; // ここでtrueかfalseを代入
//		while (doorClose == true) {
//			System.out.println("ノックする");
//			System.out.println("1分待つ");
//		}
//
//	}
//}

//3-3　非推奨
//public class Main {
//	public static void main(String[] args) {
//		boolean tenki = true;
//		if (tenki == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩にいきます");
//		} else
//			System.out.println("DVDを観ます");
//
//	}
//}

//3-4
//public class Main {
//	public static void main(String[] args) {
//
//		System.out.println("あなたの運勢を占います");
//
//		int fortune = new java.util.Random().nextInt(4) + 1;
//
//		if (fortune == 1) {
//			System.out.println("大吉");
//
//		} else if (fortune == 2) {
//			System.out.println("中吉");
//
//		} else if (fortune == 3) {
//			System.out.println("吉");
//
//		} else {
//			System.out.println("凶");
//		}
//	}
//}

//3-5
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = 1;
//		switch (fortune) {
//		case 1:
//			System.out.println("大吉");
//
//		case 2:
//			System.out.println("中吉");
//			break;
//		case 3:
//			System.out.println("吉");
//			break;
//		default:
//			System.out.println("凶");
//
//		}
//
//	}
//}

//3-6
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = new java.util.Random().nextInt(5) + 1;
//		switch (fortune) {
//		case 1:
//
//		case 2:
//			System.out.println("いいね！");
//			break;
//
//		case 3:
//			System.out.println("普通です");
//			break;
//		case 4:
//		case 5:
//			System.out.println("うーん・・・");
//
//		}
//
//	}
//}

//3-7
//public class Main {
//	public static void main(String[] args) {
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("こんにちは");
//
//		}
//
//	}
//}

//3-8
//public class Main {
//	public static void main(String[] args) {
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print("現在" + (i + 1) + "周目→");
//
//		}
//
//	}
//}

//3-9
//public class Main {
//	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(i * j);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
//
//	}
//}

//exe3-1
//weight == 60;
//(age1 + age2) * 2 > 60;
//age % 2 == 1;
//name.equals("湊");

//exe3-2
//c,d,e

//exe3-3
//public class Main {
//	public static void main(String[] args) {
//		int isHungry = 1;
//		String food = "ラーメン";
//		System.out.println("こんにちは");
//
//		if (isHungry == 0) {
//			System.out.println("お腹がいっぱいです");
//
//		} else {
//			System.out.println("はらぺこです");
//
//		}
//		if (isHungry == 1) {
//			System.out.println(food + "をいただきます");
//		}
//		System.out.println("ごちそうさまでした");
//	}
//}

//exe3-4
//public class Main {
//	public static void main(String[] args) {
//		boolean tenki = false;
//		if (tenki == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩に行きます");
//
//		} else {
//			System.out.println("DVDを観ます");
//			System.out.println("寝ます");
//		}
//	}
//}

//exe3-5
//public class Main {
//	public static void main(String[] args) {
//		System.out.print("[メニュー]　1:検索　2:登録　3:削除　4:変更>");
//		int selected = new java.util.Scanner(System.in).nextInt();
//
//		switch (selected) {
//		case 1:
//			System.out.println("検索します");
//			break;
//
//		case 2:
//			System.out.println("登録します");
//			break;
//
//		case 3:
//			System.out.println("削除します");
//			break;
//		case 4:
//			System.out.println("変更します");
//			break;
//
//		}
//
//	}
//}

//exe3-6
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("【数あてゲーム】");
//
//		int ans = new java.util.Random().nextInt(10);
//
//		for (int i = 0; i < 5; i++) {
//
//			System.out.println("0～9の数字を入力してください");
//
//			int num = new java.util.Scanner(System.in).nextInt();
//
//			if (num == ans) {
//				System.out.println("アタリ！");
//				break;
//
//			} else {
//				System.out.println("違います");
//			}
//
//		}
//		System.out.println("ゲームを終了します");
//	}
//}

//4-1
//public class Main {
//	public static void main(String[] args) {
//		int sansu = 20;
//		int kokugo = 30;
//		int rika = 40;
//		int eigo = 50;
//		int syakai = 80;
//
//		int sum = sansu + kokugo + rika + eigo + syakai;
//
//		int avg = sum / 5;
//
//		System.out.println("合計点:" + sum);
//		System.out.println("平均点:" + avg);
//
//	}
//}

//4-2
//public class Main {
//	public static void main(String[] args) {
//		int[] scores;
//		scores = new int[5];
//
//	}
//}

//4-3
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = new int[5];
//
//	}
//}

//4-4
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = new int[5];
//		int num = scores.length;
//		System.out.println("要素の数:" + num);
//
//	}
//}

//4-5
//public class Main {
//	public static void main(String[] args) {
//		int[] scores;
//		scores = new int[5];
//		scores[1] = 30;
//		System.out.println(scores[1]);
//
//	}
//}

//4-6
//public class Main {
//	public static void main(String[] args) {
//		int x;
//		System.out.println(x);
//
//	}
//}

//4-7
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = new int[5];
//		System.out.println(scores[0]);
//
//	}
//}

//4-8
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = { 20, 30, 40, 50, 80 };
//		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
//		int avg = sum / scores.length;
//		System.out.println("合計点:" + sum);
//		System.out.println("平均点:" + avg);
//
//	}
//}

//4-9
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = { 20, 30, 40, 50, 80 };
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//
//	}
//}

//4-10
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = { 20, 30, 40, 50, 80 };
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//
//		int avg = sum / scores.length;
//		System.out.println("合計点:" + sum);
//		System.out.println("平均点:" + avg);
//
//	}
//}

//要素の数を増やして検証
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = { 20, 30, 40, 50, 80, 100, 100, 100, 100 };
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//
//		int avg = sum / scores.length;
//		System.out.println("合計点:" + sum);
//		System.out.println("平均点:" + avg);
//
//	}
//}

//4-11
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = { 20, 30, 40, 50, 80 };
//		int count = 0;
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i] >= 50) {
//				count++;
//			}
//		}
//
//		System.out.println("50点以上の科目の数は:" + count);
//	}
//}

//4-12
//public class Main {
//	public static void main(String[] args) {
//		int[] seq = new int[10];
//
//		// 塩基配列をランダムに生成
//		for (int i = 0; i < seq.length; i++) {
//			seq[i] = new java.util.Random().nextInt(4);
//		}
//
//		// 生成した塩基配列の記号を表示
//		for (int i = 0; i < seq.length; i++) {
////			switch (seq[i]) {
////			case 0:
////				System.out.print("A");
////
////				break;
////			case 1:
////				System.out.print("T");
////
////				break;
////			case 2:
////				System.out.print("G");
////
////				break;
////			case 3:
////				System.out.print("C");
////
////				break;
////				
////		
////
////			}
//
//			char[] base = { 'A', 'T', 'G', 'C' };
//			System.out.print(base[seq[i]] + " ");
//		}
//
//	}
//}

//4-13
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = { 20, 30, 40, 50, 80 };
//
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//
//	}
//}

//4-14
//public class Main {
//	public static void main(String[] args) {
//		int[] scores = { 20, 30, 40, 50, 80 };
//
//		for (int value : scores) {
//			System.out.println(value);
//		}
//
//	}
//}

//4-15
//public class Main {
//	public static void main(String[] args) {
//		int[] arrayA = { 1, 2, 3 };
//		int[] arrayB;
//		arrayB = arrayA;
//		arrayB[0] = 100;
//		System.out.println(arrayA[0]);
//
//	}
//}

//4-16
//public class Main {
//	public static void main(String[] args) {
//		boolean judge = true;
//		if (judge == true) {
//			int[] array = { 1, 2, 3 };
//		}
//	}
//}

//4-17
//public class Main {
//	public static void main(String[] args) {
//		int[] array = { 1, 2, 3 };
//		array = null;
//		array[0] = 10;
//
//	}
//}

//4-18
//public class Main {
//	public static void main(String[] args) {
//		int[][] scores = new int[2][3];
//		scores[0][0] = 40;
//		scores[0][1] = 50;
//		scores[0][2] = 60;
//		scores[1][0] = 80;
//		scores[1][1] = 60;
//		scores[1][2] = 70;
//		System.out.println(scores[1][1]);
//
//	}
//}

//4-19
//public class Main {
//	public static void main(String[] args) {
//		int[][] scores = { { 40, 50, 60 }, { 80, 60, 70 } };
//
//		System.out.println(scores.length);
//		System.out.println(scores[0].length);
//
//	}
//}

//exe4-1
//public class Main {
//	public static void main(String[] args) {
//		int[] points = new int[4];
//		double[] weights = new double[5];
//		boolean[] answers = new boolean[3];
//		String[] names = new String[3];
//
//	}
//}

//exe4-2
//public class Main {
//	public static void main(String[] args) {
//		int[] moneyList = { 121902, 8302, 55100 };
//		for (int i = 0; i < 3; i++) {
//			System.out.println(moneyList[i]);
//		}
//
//		for (int m : moneyList) {
//			System.out.println(m);
//		}
//
//	}
//}

//exe4-3
//public class Main {
//	public static void main(String[] args) {
//		int[] counts = null;
//		float[] heights = { 171.3F, 175.0F };
//		System.out.println(counts[1]);
//		System.out.println(heights[2]);
//	}
//}

//java.lang.NullPointerException
//java.lang.ArrayIndexOutOfBoundsException

//exe4-4
//public class Main {
//	public static void main(String[] args) {
//		int[] numbers = { 3, 4, 9 };
//		System.out.println("1桁の数字を入力してください");
//		int input = new java.util.Scanner(System.in).nextInt();
//
//		for (int n : numbers) {
//			if (n == input) {
//				System.out.println("アタリ！");
//			}
//		}
//
//	}
//}

//5-1

//public class Main {
//	public static void hello() {
//		System.out.println("湊さん、こんにちは");
//	}
//}

//5-2
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します");
//		hello();
//		System.out.println("メソッドの呼び出しが終わりました");
//
//	}
//
//	public static void hello() {
//		System.out.println("湊さん、こんにちは");
//	}
//
//}

//5-3
//public class Main {
//	public static void methodA() {
//		System.out.println("methodA");
//		methodB();
//	}
//
//	public static void methodB() {
//		System.out.println("methodB");
//	}
//
//	public static void main(String[] args) {
//		methodA();
//
//	}
//
//}

//5-4
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します");
//		hello("湊");
//		hello("朝香");
//		hello("菅原");
//		System.out.println("メソッドの呼び出しが終わりました");
//
//	}
//
//	public static void hello(String name) {
//		System.out.println(name + "さん、こんにちは");
//	}
//}

//5-5
//public class Main {
//	public static void main(String[] args) {
//		add(100, 20);
//		add(200, 50);
//
//	}
//
//	// 複数の値を受け取るaddメソッド
//	public static void add(int x, int y) {
//		int ans = x + y;
//		System.out.println(x + "+" + y + "=" + ans);
//	}
//}

//5-6　エラーになる

//public class Main {
//	public static void main(String[] args) {
//		int x = 100;
//		int y = 10;
//		add();
//
//	}
//
//	public static void add() {
//		int ans = x + y;
//		System.out.println(x + "+" + y + "=" + ans);
//	}
//}
//Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//	x を変数に解決できません
//	y を変数に解決できません
//	x を変数に解決できません
//	y を変数に解決できません

//5-7
//public class Main {
//	public static int add(int x, int y) {
//		int ans = x + y;
//		return ans;
//
//	}
//
//	public static void main(String[] args) {
//		int ans = add(100, 10);
//		System.out.println("100+10=" + ans);
//	}
//}

//5-8
//public class Main {
//	public static int add(int x, int y) {
//		int ans = x + y;
//		return ans;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(add(add(10, 20), add(30, 40)));
//	}
//
//}

//5-9 return分の後に処理は書けない　エラー
//public static int sample() {
//	
//	return 1;
//	int x =10;
//	
//}
//5-10
//public class Main {
//	// 1つ目のaddメソッド
//	public static int add(int x, int y) {
//		return x + y;
//	}
//
//	// 2つ目のaddメソッド
//	public static double add(double x, double y) {
//		return x + y;
//	}
//
//	// 3つ目のaddメソッド
//	public static String add(String x, String y) {
//		return x + y;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(add(10, 20));
//
//		System.out.println(add(3.5, 2.7));
//
//		System.out.println(add("hello", "World"));
//	}
//
//}
//5-11
//public class Main {
//	public static int add(int x, int y) {
//		return x + y;
//
//	}
//
//	public static int add(int x, int y, int z) {
//		return x + y + z;
//
//	}
//
//	public static void main(String[] args) {
//		System.out.println("10+20=" + add(10, 20));
//		System.out.println("10+20+30=" + add(10, 20, 30));
//	}
//}

//5-12
//public class Main {
//	// int型配列を受け取り、全ての要素を表示するメソッド
//	public static void printArray(int[] array) {
//		for (int element : array) {
//			System.out.println(element);
//		}
//	}
//
//	public static void main(String[] args) {
//		int[] array = { 1, 2, 3 };
//		printArray(array);
//	}
//}

//5-13
//public class Main {
//	// int型配列を受け取り、
//	// 配列内の要素全てに1を加えるメソッド
//	public static void incArray(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			array[i]++;
//		}
//	}
//
//	public static void main(String[] args) {
//		int[] array = { 1, 2, 3 };
//		incArray(array);
//		for (int i : array) {
//			System.out.println(i);
//		}
//	}
//}

//5-14
//public class Main {
//	public static int[] makeArray(int size) {
//		int[] newArray = new int[size];
//		for (int i = 0; i < newArray.length; i++) {
//			newArray[i] = i;
//
//		}
//
//		return newArray;
//	}
//
//	public static void main(String[] args) {
//		int[] array = makeArray(3);
//		for (int i : array) {
//			System.out.println(i);
//		}
//	}
//}

//exe5-1
//public class Main {
//	public static void introduceOneself() {
//		String name = "央基";
//		int age = 0;
//		float height = 80.5F;
//		char zodiac = '丑';
//
//		System.out.println("私の名前は" + name + "です。");
//		System.out.println("年齢は" + age + "歳です。");
//		System.out.println("身長は" + height + "㎝です。");
//		System.out.println("干支は" + zodiac + "です。");
//
//	}
//
//	public static void main(String[] args) {
//		introduceOneself();
//
//	}
//}

//exe5-2
//public class Main {
//	public static void email() {
//		String title = "メールのタイトル";
//		String address = "メールの宛先アドレス";
//		String text = "メールの本文";
//
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}
//
//	public static void main(String[] args) {
//		email();
//	}
//}

//exe5-3
//public class Main {
//	public static void email() {
//		String address = "メールの宛先アドレス";
//		String text = "メールの本文";
//
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名：無題");
//		System.out.println("本文：" + text);
//	}
//
//	public static void main(String[] args) {
//		email();
//	}
//}

//exe5-4
//public class Main {
//	public static double calcTriangleArea(double bottom, double height) {
//
//		double area = bottom * height / 2;
//
//		return area;
//
//	}
//
//	public static double calcCircleArea(double radius) {
//		double area = radius * radius * 3;
//
//		return area;
//
//	}
//
//	public static void main(String[] args) {
//
//		double triangleArea = calcTriangleArea(10.0, 5.0);
//		System.out.println("三角形の面積は" + triangleArea + "㎠");
//
//		double circleArea = calcCircleArea(5.0);
//		System.out.println("円の面積は" + circleArea + "㎠");
//
//	}
//}