import java.util.Scanner;

public class quicksortalgorithm {
	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int partition(int arr[], int low, int high) {

		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	static void quicksort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi - 1);
			quicksort(arr, pi + 1, high);
		}
	}

	static void printarray(int arr[], int n) {
		for (int j = 0; j < n; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i = 0;
		System.out.println("The array elements are: ");
		while (i < n) {
			a[i] = sc.nextInt();
			i++;
		}
		sc.close();
		quicksort(a, 0, n - 1);
		System.out.println("The sorted array is: ");
		printarray(a, n);
		System.out.println("------SUCCESS-------");

	}
}