
public class EPAM_string_count{

	public static void main(String[] args) {
		String str = "@he944llo 8esu%";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		char c[] = str.toCharArray();
		System.out.println(str);
		int count = 0, num =0;
		for (int i = 0; i < str.length(); i++) {
			if(c[i] >=45 && c[i]<=57) {
				//num = num + Integer.parseInt(String.valueOf(str.charAt(i)));	
				num += Integer.parseInt(String.valueOf(c[i]));
			}
			else {
				count++;
			}
	}
		System.out.println("Num is: "+num+"\n"+ "count is:"+count);
		int a = Math.abs(num/count);
		System.out.println("The Output is: "+a);
	

	}}
