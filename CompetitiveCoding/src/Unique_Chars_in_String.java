
public class Unique_Chars_in_String {

	public static void main(String[] args) {

		String st = "Joshuvva";
		st = st.toLowerCase();
		char a[] = new char[st.length()];
		for (int i = 0; i < st.length(); i++) {
			a[i] = st.charAt(i);
		}
		for (int i = 0; i < a.length; i++) {
			boolean b = false;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					b = true;
					break;
				}

			}
			if (!b) {
				System.out.print(a[i] + " ");
				st += a[i] + " ";
			}

		}
		System.out.println();

		String st1 = "";
		int arr[] = { 1, 2, 3, 4, 5, 3, 4, 67, 6 };
		for (int i = 0; i < arr.length; i++) {
			boolean b = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					b = true;
					break;
				}

			}
			if (!b) {
				System.out.print(arr[i] + " ");
				st1 += arr[i] + " ";
			}

		}
		System.out.println();
		System.out.println(st1);
	}
}
