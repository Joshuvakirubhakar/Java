import java.util.Scanner;

public class Rotation {

	public static String LR(String s, int L) {
		int a = s.length();
		String s1 = "";
		if (L > a) {
			int b = L % a;
			s1 = s.substring(b) + s.substring(0, b);
			return s1;
		} else {
			s1 = s.substring(L) + s.substring(0, L);
			return s1;
		}

	}

	public static String RR(String s, int R) {
		int a = s.length(), c;
		String s1 = "";
		if (R > a) {
			int b = R % a;
			c = a - b;
			s1 = s.substring(c) + s.substring(0, c);
			return s1;
		} else {
			int b = a - R;
			s1 = s.substring(b) + s.substring(0, b);
			return s1;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String g = "abcde";
		int L = sc.nextInt();
		int LLL = sc.nextInt();
		int R = sc.nextInt();
		int RRR = sc.nextInt();
		System.out.println("Left rotation for  "+L+": \n"+Rotation.LR(g, L));
		System.out.println("Left rotation for "+LLL+": \n"+Rotation.LR(g, LLL));
		System.out.println("Right rotation for "+R+": \n"+Rotation.RR(g, R));
		System.out.println("Right rotation for "+RRR+": \n"+Rotation.RR(g, RRR));
		sc.close();

	}

}
