import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int a = 0;
		char[] ch = str.toCharArray();
		System.out.print("[");
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == 32) {
				ch[i] = ch[i + 1];
				continue;
			}
			
			System.out.print(ch[i]+",");
			a++;

		}
		System.out.println("]");
		System.out.println("\nThe length of String array is: " +a);

	}

}
