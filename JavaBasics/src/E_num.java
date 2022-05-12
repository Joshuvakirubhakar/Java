class size{
enum sizename{L,XL,XXL}
sizename name;
}
public class E_num {
public static void main(String[] args) {
	size s = new size();
	s.name = size.sizename.XL;
			
	System.out.println("The size is "  +s.name);
}
}



