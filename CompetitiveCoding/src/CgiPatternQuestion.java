
//Input : n = 4
//Output :
//1*2*3*4*17*18*19*20
//--5*6*7*14*15*16
//----8*9*12*13
//------10*11//

/*import java.util.Scanner;

public class CgiPatternQuestion {

	public static void main(String[] args) {
		int i, j = 0, r, k, m = 1;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		sc.close();
		for (i = 1; i <= r; i++) {
			//for (j = 2; j <= m; j++) {
				//System.out.print("-");
			//}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			m++;
			System.out.println("\n");
		}

	}

}*/
//import java.util.Scanner;

public class CgiPatternQuestion {
	static void printdashes(int k) {
		int i;
		for (i = 1; i <= k; i++)
			System.out.print("-");
	}
	static void pattern(int n) {
		
		int i, j, dash_counter = 0;
		int value = 1;		
		int k,decrementor = 0;		
		int support = n - 1;
		int temp = ((n * n) + 1);
		int temp1 = (n * 2) - 1;
		int tracker = 0;
		for (i = 1; i <= n; i++) {
			printdashes(dash_counter);			
			for (j = 1; j <= (2 * n) - dash_counter; j++) {				
				if (j % 2 == 0)
					System.out.print("*");
				else {
					System.out.print(value);
					value++;
				}}			
			for (k = 1; k <= (temp1 - decrementor); k++) {				
				if (k % 2 == 0)
					System.out.print("*");
				else {
					if (k == 1)
						tracker = temp;
					System.out.print(temp);
					temp++;	}
			}
			decrementor += 2;
			temp = tracker - support;
			support--;			
			dash_counter += 2;
			System.out.print("\n");	}
	}
	public static void main(String arg[]) {
		int n = 3;
		pattern(n);
	}

}
