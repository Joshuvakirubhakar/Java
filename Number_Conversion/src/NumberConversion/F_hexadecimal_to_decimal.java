package NumberConversion;
//Whenever to convert something to decimal --> use Integer.parseInt(int, 16)
public class F_hexadecimal_to_decimal {

	public static void main(String[] args) {
		String str = "ab ";
		//Using Integer.parseInt()
		int decimal = Integer.parseInt(str, 16);
		System.out.println("Conversion using (Integer.parseint): \n"+decimal);
		
		//Using Conventional Method
		
		String hexa = "0123456789ABCDEF";    //String for reference
		str = str.toUpperCase();
		int i = 0, val = 0;
		while(i<str.length()) {
			char c = str.charAt(i);
			int digit = hexa.indexOf(c);
			val = 16*val+ digit;          
			i++;
			
		}
		System.out.println("Hexa to Decimal using conventional method is: \n"+val);
		

	}

}
