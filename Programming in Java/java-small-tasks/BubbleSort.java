package pl.wsis.java;

public class BubbleSort {
	
	public int[] sortArr(int[] arr) {
		int n = arr.length;
		int tempElement = 0;
		
		int[] nowa = arr.clone();
		
		for (int i = 0; i < n; i++) {
			for (int k = 1; k < (n - i); k++) {
				if (nowa[k - 1] > nowa[k]) {
					tempElement = nowa[k - 1];
					nowa[k - 1] = nowa[k];
					nowa[k] = tempElement;
				}
			}
		}
		return nowa;
	}
	
	
	public void Solve() {
		int arr[] = {8,1,34,17,326,1109,4,163};
		System.out.println("Unsorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] sorted = sortArr (arr);

		System.out.println("Sorted array");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();

	}
	
	
}