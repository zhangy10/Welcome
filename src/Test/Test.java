package Test;

import java.util.Comparator;

import Graph.Node;

public class Test {

	public static void main(String[] args) {
		// System.out.printf("###%%d.4f###%n", 3, Math.PI);

		// Scanner scanner = new Scanner(System.in);
		// int n = Integer.parseInt(scanner.next());
		// followed by next(), it should throw a nextline(), because this time
		// will be a ""
		// scanner.nextLine();
		// String s1 = scanner.nextLine();
		// String s2 = scanner.nextLine();
		//
		// System.out.println(s1 + "-----");
		// System.out.println(s2 + "-----");
		//
		// String a = "sdfsdf";
		// System.out.printf("%10s%n", a);

		// System.out.printf("%e", Math.pow(10, 20));
		// int a = Integer.MIN_VALUE;
		//
		// assert (a > 0): "you should keep on doing something...";

		// int a = 60; // 111100
		// int b = 11; // 001011
		// System.out.println(a | b); // 63 111111
		// System.out.println(a & b); // 8 001000
		// System.out.println(a ^ b); // 55 110111
		// System.out.println(a >> 2); // 15 001111 right smaller, means /4
		// System.out.println(a << 2); // 240 11110000 left larger, means *4
		// System.out.println(a << 4); // 960 1111000000

		// int result = function(5);
		// System.out.println(result);

		// double resultFormSuar = Suar(6, "71.2", 1.2);
		// System.exit(0);
		// System.out.println(resultFormSuar);
		// for (int i = 1; i < 10; i++) {
		// System.out.println(function(i));
		// }
		// int n = 10;
		// for (int i = 0; i < n + 2; i++) {
		// System.out.println(i % 10);
		// }

		// for (boolean isRed = false; isRed != true; isRed |= true) {
		// System.out.println("Hello");
		// }
		for (int i = 0; i < 2; i++) {
			System.out.println(i == 0 ? true : false);
		}

		Object o = new Object();

		System.gc();
	}

	class Compare implements Comparator<Object> {

		public Compare() {

		}

		public int toCompare(Compare from) {
			return -1;
		}

		@Override
		public int compare(Object lhs, Object rhs) {

			return 0;
		}
	}

	class Compare1 implements Comparable<Object> {

		@Override
		public int compareTo(Object another) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static int function(int n) {
		if (n == 1)
			return 1;
		return function(n - 1) * (2 * n - 1);
	}

	public enum TestE {

		ER(new Node(1)), UU(1), RR(ER, UU);

		private int title;
		private Node node;
		private TestE[] testEs;

		TestE() {

		}

		TestE(int title) {
			this.title = title;
		}
		
		TestE(Node node) {
			this.node = node;
		}
		
		TestE(TestE... testEs) {
			this.testEs = testEs;
		}

	}

}
