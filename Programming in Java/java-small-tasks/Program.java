package pl.wsis.java;

import java.util.Scanner;

public class Program {
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);  
	    
		while(true) {
		System.out.println("Please enter number of task (1, 2, 3 or 4) or enter 0 to quit: ");  
		int numTask=sc.nextInt();  
		switch (numTask) {
		
			case 1: FizzBuzz zad1 = new FizzBuzz();
			zad1.Solve();
			break;
			
			case 2: MultiTable zad2 = new MultiTable();
			zad2.Solve();
			break;
			
			case 3: EncryptedString zad3 = new EncryptedString();
			zad3.Solve();
			break;
			
			case 4: BubbleSort zad4 = new BubbleSort();
			zad4.Solve();
			break;
			
			case 0: return;
			
			default: System.out.println("Please enter 7, 8, 9 or 10 or 0 for quit");
			break;
		}

	}

		
	}
	
}

