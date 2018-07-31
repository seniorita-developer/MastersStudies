package pl.wsis.java;

public class FizzBuzz {
	public String FizzBuzzStr (int i) {
		if(i%3==0 && i%5==0) {
			return "FizzBuzz";
		}if (i%5==0) {
			return "Buzz";
		}if (i%3==0) {
			return "Fizz";
		}else {
			return Integer.toString(i);
		}
	}
	
	public void Solve() {
		for(int i=1; i<=100; i++) {
			System.out.println(FizzBuzzStr(i));
		}
	}
}
