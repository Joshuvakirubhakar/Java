

//Print all duplicate characters



public class U_Duplicate_characters {

	public static void main(String[] args) {
		String str = "1233435";
		str = str.replaceAll("\\s", "").toLowerCase();
		char a[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (a[i] == a[j] && a[i] !=a[i+1]) {
					System.out.print(a[j] + " ");
					break;
				}
			}
		}
	}

}
