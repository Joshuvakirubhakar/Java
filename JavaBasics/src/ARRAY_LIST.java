// Java program to demonstrate the
// working of ArrayList in Java

import java.util.*;

class ARRAY_LIST {
	public static void main(String[] args) {
		// Size of the
		// ArrayList
		int n = 5;

		// Declaring the ArrayList with
		// initial size n
		 ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		ArrayList<String> str = new ArrayList<String>(n);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {

			str.add(sc.nextLine());
		}
		sc.close();

		System.out.println("ARRAY LIST ELEMENTS ARE--->"+str + " ");
		String str1 = String.join("", str);
		System.out.println("The String is ---->"+str1);
		
		char[] a = new char[str1.length()];
		for(int i =0; i<str1.length();i++) {
			a[i] = str1.charAt(i);
		}
		for(char c: a) {
			System.out.println(c);
			
		}
		System.out.println("Elements in 0th position-->"+a[0]);
		
		

		
		 // Appending new elements at // the end of the list 
		 for (int i = 1; i <= n;i++) 
			 arrli.add(i);
		  
		  //Printing elements 
		  System.out.println(arrli);
		
		  // Remove element at index 3 
		  arrli.remove(3);
		  
		  // Displaying the ArrayList // after deletion 
		  System.out.println(arrli);
		  
		  // Printing elements one by one 
		  for (int i = 0; i < arrli.size(); i++)
		  System.out.print(arrli.get(i) + " ");
		 
	}
}
