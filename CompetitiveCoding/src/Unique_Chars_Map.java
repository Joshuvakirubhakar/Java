
import java.util.*;

public class Unique_Chars_Map {
	static void count_characters(String input_str) {
		HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
		char[] str_array = input_str.toLowerCase().toCharArray();
		for (char c : str_array) {
			if (my_map.containsKey(c)) {
				my_map.put(c, my_map.get(c) + 1);
			} else {
				my_map.put(c, 1);
			}
		}
//		int a = 2;
		for (Map.Entry<Character, Integer> entry : my_map.entrySet()) {

			if ((int) entry.getValue() >= 2) {
				continue;

			}
			System.out.print(entry.getKey());

		}
	}

	public static void main(String[] args) {
		String my_str = "Joe Erien ";
		System.out.println("The unique characters in the string using map is ");
		count_characters(my_str);
	}
}
