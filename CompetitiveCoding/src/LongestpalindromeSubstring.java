//import java.util.Scanner;

//Finding longest palindrome using Dynamic programming
public class LongestpalindromeSubstring {

	static void printsubstring(String s, int start, int max) {
		System.out.println("The longet substring is: " + s.substring(start, max));

	}

	static int longestpalindrome(String str) {
		int m = 1;
		int n = str.length();
		boolean table[][] = new boolean[n][n];
		// for every single element is a palindrome
		for (int i = 0; i < n; i++) {
			table[i][i] = true;
		}
		int start = 0;
		// for checking palindrome with two letters
		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				table[i][i + 1] = true;
				start = i;
				m = 2;
			}
		}
		for (int k = 3; k <= n; k++) {				//This loop is for how much element
			for (int i = 0; i <= n - k; i++) {      // This loop is for iteration for eg: n=6, k=3, i=0,1,2,3
				int j = i + k - 1;
				if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
					table[i][j] = true;
					if (k > m) {
						start = i;
						m = k;
					}
				}
			}
		}
		printsubstring(str,start, start+m);

		return m;

	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		String s ="Abradadcabd";//sc.nextLine();//
		//sc.close();
		System.out.println("original string: "+s);
		System.out.println("Maximum length : "+longestpalindrome(s));
		System.out.println("_________SUCCESS__________");
		System.out.println();

	}
}
