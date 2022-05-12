package NumberConversion;

public class A_Decimal_to_Binary {

	public static void main(String[] args) {
		int n = 19;
		String str = Integer.toBinaryString(n);
		System.out.println("Binary value using (Integer.toBinaryStringis) : \n" + str);

		/*
		 * Logic for decimal to binary--> Do modulo and divide it by 2--> Store modulo
		 * answer in array--> reverse print the array
		 */
		int ch[] = new int[50];
		int index = 0;
		while (n > 0) {
			ch[index++] = n % 2;
			n = n / 2;

		}
		System.out.println("Binary value using Custom logic is :");
		for(int j = index-1; j>=0 ; j--) {
			System.out.print(+ch[j]);
		}

	}

}
