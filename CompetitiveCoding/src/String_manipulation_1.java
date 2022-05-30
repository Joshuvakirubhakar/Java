public class String_manipulation_1 {
	public static void main(String[] args) {
		String str = "String% 55#^*%";
		String ss= str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("String without special characters:  "+ss);
		int n = str.length();
		System.out.println("Len before :  " + n);
		str = str.replaceAll("\\s", "");
		System.out.println("Len After :   " + str.length());
		String s = "";
		String sy = "";
		int on = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 45 & str.charAt(i) <= 57 || str.charAt(i) >= 65 && str.charAt(i) <= 90
					|| str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				s += str.charAt(i);
				if(str.charAt(i) >= 45 & str.charAt(i) <= 57) {
					on +=Integer.parseInt(String.valueOf(str.charAt(i)));
				}
			}else {
			sy += str.charAt(i);}
		}
		System.out.println("Letter and numbers: "+s);
		System.out.println("The sum of numbers in string: " + on);
		System.out.println("The special characters are: "+sy);
	}

}
