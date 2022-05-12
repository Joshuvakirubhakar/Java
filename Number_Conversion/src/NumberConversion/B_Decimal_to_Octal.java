package NumberConversion;

public class B_Decimal_to_Octal {

	public static void main(String[] args) {
		// Using Integer.toOctalString
		int n = 8;
		String str = Integer.toOctalString(n);
		System.out.println("TO OCTAL USING (Integer.toOctalString()): \n" + str);

		// Using conventional method
		int decimal = 8;
		int rem;
		String octal = "";

		char octalchars[] = { '0', '1', '2', '3', '4', '5', '6', '7' };

		while (decimal > 0) {
			rem = decimal % 8;
			octal = octalchars[rem] + octal;
			decimal = decimal / 8;
		}
		System.out.println("Decimal to Octal is: \n"+octal);
	}
	

}
