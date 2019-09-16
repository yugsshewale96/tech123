import java.util.Scanner;

class Myarithexception extends Exception {
	public Myarithexception(String mess) {
		super(mess);
	}

}

class Calculator {
	public void caldouble(int a) throws Myarithexception {
		if (a <= 0) {
			throw new Myarithexception("Zero or Negative not allowed");
		} else {
			double b;
			b = Double.valueOf(a);
			System.out.println(b);
		}
	}

}

public class MyCalcApp {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Calculator c = new Calculator();
		try {
			c.caldouble(num);
		} catch (Myarithexception e) {
			System.out.println(e);
		}
		
	}

}