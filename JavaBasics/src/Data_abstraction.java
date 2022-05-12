//If derived classes don’t implement the abstract methods,
//	it would result in abstract classes that cannot be instantiated. 

abstract class sum {
	abstract int sumoftwo(int a, int b);

	public abstract int sumofthree(int a, int b, int c);

	public void display() {
		System.out.println("Method of class sum");
	}
}

public class Data_abstraction extends sum {

	@Override
	public int sumoftwo(int n1, int n2) {
		return n1;
	}

	@Override
	public int sumofthree(int n1, int n2, int n3) {
		return n1+n2;
	}
	
	public static void main(String args[] ) {
		Data_abstraction obj = new Data_abstraction();        //creating obj for demo class which uses abstract class "sum"
		System.out.println(obj.sumoftwo(11,9));
		System.out.println(obj.sumofthree(12, 10, 30));
		obj.display();
	}

}
