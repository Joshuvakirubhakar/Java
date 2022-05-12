import java.util.Scanner;

public class permutations_of_a_String {
	static String g = "";

	static void permutation(String s, String a) {
		String ss = " ";
		if (s.length() == 0) {
			System.out.print(a + " ");

			g += ss + a;                        ///copying the permutation to the string

		} else {

			for (int i = 0; i < s.length(); i++) { // s = "abb" --> i =0(a), 1(b), 1(b)

				char ch = s.charAt(i); // to fix the first character
				String rest = s.substring(0, i) + s.substring(i + 1); // rest of characters
				permutation(rest, a + ch); // use recursion to set 1st letter as fixed
				// then other two to interchange
			}
		}
	}

	public static void main(String[] args) {
		String str = "ABB";
		System.out.println("Enter the String:");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		String st = str.trim().replaceAll("\\s", ""); // To remove the whitespace within the String.
		System.out.println(st);
		// sc.close();
		String ans = "";
		System.out.println("The Permutations are: \n");
		permutation(st, ans);
		System.out.println("\n The g is " + g);

	}

}
