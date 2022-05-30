
public class print_all_a {
/*
	private static int acounter(String st, int end) {
		int a = 0;
		for (int i = 0; i < end; i++) {
			if (st.charAt(i) == 'a') {
				a++;
			}
		}
		return a;
	}

	public static void printa(String st, int N) {
		int repeated = N / st.length(); // Use long data type in real program
		int rest = N % st.length();
		if (!st.contains("a")) {
			System.out.println("No 'a' found in the given string : " + st);
		}
//		if (st.length() > N) {
//			System.out.println(acounter(st, rest));
//		} else {
//			System.out.print("No of 'a' in the string is: ");
//			System.out.print(repeated * acounter(st, st.length()) + acounter(st, rest));
//		}
		// using ternary operator instead of if-else loop
		int as = (st.length() > N) ? acounter(st, rest) : repeated * acounter(st, st.length()) + acounter(st, rest);
		System.out.println("No of 'a' in the string: " + as);

	}  */

	 //another method
	public static void repeatedString(String s, int n) {
		int size = s.length(), repeated = n / size;
		int left = n - (size * repeated);
		int extra = 0;

		int count = 0;
		for (int i = 0; i < size; i++) {
			if (s.charAt(i) == 'a') {
				++count;
			}
		}

		for (int i = 0; i < left; i++) {
			if (s.charAt(i) == 'a') {
				++extra;
			}
		}

		repeated = (repeated * count) + extra;

		System.out.println("No of repeated 'a' in string is :" + repeated);
	}

	public static void main(String[] args) {

		String st = "aba";
		int N = 10;
		//printa(st, N);
		repeatedString(st, N);
	}

}
