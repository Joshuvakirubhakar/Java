package NumberConversion;

public class D_Binary_to_Decimal {

	public static void main(String[] args) {
		int num = 101001;
		int number = num;
		
		//Using----> Integer.parseInt(String,radix)----> For String I/p
		//If I/p is given in "int"--> Convert it into String using "String.valueOf(int)"
		String str = String.valueOf(num);
		int decimal1 = Integer.parseInt(str, 2);
		System.out.println("Decimal Conversion using Integer.parseInt(String, radix): \n"+decimal1);
		
		//Using Conventional method--> Modulo divison of number by 10--->
		//binary =  binary + temp * Math.pow(2,n)
		int decimal = 0;
		int n = 0;
		while(num>0) {
			int temp = num%10;
			decimal += temp*Math.pow(2, n);
			num = num/10;
			n++;
		}
		System.out.println("Decimal number of "+number+" is: \n"+decimal);

	}

}
