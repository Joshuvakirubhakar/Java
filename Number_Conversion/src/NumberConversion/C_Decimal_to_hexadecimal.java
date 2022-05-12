package NumberConversion;

public class C_Decimal_to_hexadecimal {

	public static void main(String[] args) {
		int decimal = 100;
		// Using integer.toHexString() function
		String str = Integer.toHexString(decimal);
		System.out.println("Decimal to hexa using (Integer.toHexSting) is : \n"+str);
		
		//Using Conventional logic --> mpdulo divide by 16--->use hexadecimal character array upto 15
		//check for the element in array and append it in an empty string
		
		//****FOR GETTING THE LAST ELEMENT DIVIDE IT BY "16" NOT BY "10"
		
		int rem;				//-->for answer of modulo division
		String hex = "";        //---> empty string to append the characters (for final answer)
		//start char array from 0
		
		char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimal > 0) {
			//System.out.println("decimal :" +decimal);
			rem = decimal%16;
			//System.out.println("reminder is : " +rem);
			hex = ch[rem]+hex;
			//System.out.println("The string is :"+hex);
			decimal = decimal/16;
			//System.out.println("Now decimal is : "+decimal);
		}
		System.out.println("Decimal to Hexa using Conventional method is: \n"+hex);

	}

}
