
public class StaticMethodDemo {

	public static void main(String[] args) {
		System.out.println("Inside Main function");
		StaticMethodDemo.method();
	}
	
	static void method()
	{
		System.out.println("Inside Static Method");
	}
	
	static {
		System.out.println("Inside Static Block");
		StaticMethodDemo.method();
	}

}
