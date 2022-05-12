package NumberConversion;
import java.util.ArrayList;

public class G_Bit_manipulation {

	public static void main(String[] args) {
		int n = 100;
		String str = Integer.toBinaryString(n);
		char ch[] = str.toCharArray();
		ArrayList<Character> ls = new ArrayList<Character>();
		for (char c : ch) {
			ls.add(c);
		}
		System.out.println(ls);
		//for finding the position of "1" in the binary representation.
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("The string length is: \n" + str.length());
		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) == '1') {
				list.add(i);
			}
			i++;

		}
		System.out.println(list);

	}

}
