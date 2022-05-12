package NumberConversion;

public class E_Octal_to_decimal {

	public static void main(String[] args) {
		String str = "121";
		//Using Integer.parseInt(String, int);
		int decimal = Integer.parseInt(str, 8);
		System.out.println("Octal to decimal is :" + decimal);
		
		//Using conventional method
		int octal = 121;
		int decimal1 = 0 ;
		int n =0;
		while(octal>0) {
			int temp = octal%10;
			decimal1 += temp*Math.pow(8, n);
			octal = octal/10;
			n++;
		}
		System.out.println("Octal to decimal using conventional method: "+decimal1);
	}

}
