public class ForLoopGauntlet {
	public static void main(String[] args) {
		loop1();
		loop2();
		loop3();
		loop4();
		loop5();
		loop6();
		loop7();
		loop8();
	}

	public static void loop1() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}

	public static void loop2() {
		for (int u = 100; u > -1; u--) {
			System.out.println(u);
		}
	}

	public static void loop3() {
		for (int z = 2; z < 101; z += 2) {
			System.out.println(z);
		}
	}

	public static void loop4() {
		for (int w = 1; w < 100; w += 2) {
			System.out.println(w);
		}
	}

	public static void loop5() {
		System.out.println(0);
		for (int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}

		}
	}

	public static void loop6() {
		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void loop7() {
		for (int i = 0; i < 16; i++) {
			int sum = 2003 + i;
			System.out.println("In " + sum + " I was " + i + " years old.");
		}
	}

	public static void loop8() {
		for (int z = 0; z < 4; z++) {
			for (int i = 0; i < 3; i++) {

			}
		}

	}
}
