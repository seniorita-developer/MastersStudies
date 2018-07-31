package pl.wsis.java;

public class MultiTable {
	public void Solve() {
		int i;
		int n;
		
		for (i=1; i<=10; i++) {
			for (n=1; n<=10; n++) {
				System.out.printf("%-4s", (i*n));
			}
			System.out.println();
		}
		
	}

}