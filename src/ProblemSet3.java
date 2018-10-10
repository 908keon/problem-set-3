/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
			ProblemSet3 pset3 = new ProblemSet3();
			pset3.dateFashion(5,10);
			pset3.dateFashion(5,5);
			pset3.dateFashion(2, 8);
			
			pset3.fizzString("fig");
			pset3.fizzString("dib");
			pset3.fizzString("fib");
			pset3.fizzString("abc");
			
			pset3.squirrelPlay(70, false);
			pset3.squirrelPlay(95,  false);
			pset3.squirrelPlay(95, true);
			
			pset3.fizzStringAgain(2);
			pset3.fizzStringAgain(9);
			pset3.fizzStringAgain(10);
			pset3.fizzStringAgain(15);
			
			System.out.println("Make Bricks: ");
			pset3.makeBricks(3, 1, 8);
			pset3.makeBricks(3, 1, 9);
			pset3.makeBricks(3, 2, 10);
			
			System.out.println("Lucky Sum: ");
			pset3.luckySum(1, 2, 3);
			pset3.luckySum(1, 2, 13);
			pset3.luckySum(1, 13, 3);
			
			System.out.println("Lucky Sum: ");
			pset3.luckySum(1, 2, 3);
			pset3.luckySum(1, 2, 13);
			pset3.luckySum(1, 13, 3);
			
			System.out.println("Factorial For: ");
			pset3.factorialWithFor(3);
			pset3.factorialWithFor(4);
			pset3.factorialWithFor(5);
			
			System.out.println("Factorial While: ");
			pset3.factorialWithWhile(3);
			pset3.factorialWithWhile(4);
			pset3.factorialWithWhile(5);
		
	
	}
		
	public void dateFashion(int you, int date) {
		if (you >=8 && date > 2 || (date>=8 && you>2)) {
			System.out.print("YES");
		
	}
		else if (you<= 2 || date <=2);
			System.out.println("NO");
			
		if(you < 8 && date >2 || date < 8 && you > 2 );
			System.out.println("MAYBE");
		}
	public void fizzString(String str) {
		if (str.length() > 0 &&  str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
			System.out.println("FIZZBUZZ");
		}
		
		if (str.length() > 0 && str.charAt(0) =='f') {
			System.out.println("FIZZ");
		}
		
		if (str.length() > 0 && str.charAt(0) == 'b');
			System.out.println("BUZZ");
			
		}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if(isSummer && 60 <= temp  && temp <= 100) {
			System.out.println("Yes");
		}
		if(!isSummer && 60 <= temp && temp <= 90) {
			System.out.println("Yes");
		}
		if(!isSummer && temp < 60) {
			System.out.println("No");
		}
	}
	
	public void fizzStringAgain(int n) {
		String number;
		if ((n % 3) == 0 && (n % 5) == 0) {
			number = "FIZZBUZZ";
		} else if ((n % 5) == 0) {
			number = "BUZZ";
		} else if ((n % 3) == 0) {
			number = "FIZZ";
		} else {
			number = n + "";
		}
		System.out.println(number + "!");
	
	}
	
	public void makeBricks(int small, int big, int goal) {
		while (goal >= 5 && big >= 1) {
			goal = goal - 5;
			big--;
		}
		while (goal >= 1 && small >= 1) {
			goal = goal - 1;
			small--;
		}
		if (goal == 0) {
			System.out.println("YES.");
		} else {
			System.out.println("NO.");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		int sum = 0;
		if ((a == b) && (b == c) && (a == c)) {
			a = 0;
			b = 0;
			c = 0;
		} else if ((a == b) && (b == c))  {
			a = 0;
			b = 0;
		} else if (a == b) {
			a = 0;
		} else if (b == c) {
			b = 0;
		} else if (a == c) {
			c = 0;
		} else {
			sum = 0;
		}
		sum = a + b + c;
		System.out.println(sum + ".");
	}
	
	
	public void luckySum(int a, int b, int c) {
		if (a == 13) {
			a = 0;
			b = 0;
			c= 0;
		} else if (b == 13) {
			b = 0;
			c = 0;
		} else if (c == 13) {
			c = 0;
		}
		System.out.println(a + b + c + ".");
	}
	
	public void factorialWithFor(int n) {
		int total = 1;
		int rounds = n - 1;
		for (int i = 0; i <= rounds; i++) {
			total *= n;
			n = n-1;
		}
		System.out.println(total + ".");
	}
	
	public void factorialWithWhile(int n) {
		int total = 1;
		int rounds = n - 1;
		int i = 0;
		while (i <= rounds) {
			total *= n;
			n = n-1;
			i++;
		}
		System.out.println(total + ".");
	}
	
	public void isPrime(int n) {
		if (n == 1) {
			System.out.println("PRIME.");
		} else if (n % 2 == 0 && n != 2) {
			System.out.println("NOT PRIME.");
		} else if (n % 3 == 0 && n != 3) {
			System.out.println("NOT PRIME.");
		} else if (n % 5 == 0 && n != 5) {
			System.out.println("NOT PRIME.");
		} else if (n % 7 == 0 && n != 7) {
			System.out.println("NOT PRIME.");
		} else if (n % 11 == 0 && n != 11) {
			System.out.println("NOT PRIME.");
		} else if (n % 13 == 0  && n != 13) {
			System.out.println("NOT PRIME.");
		} else if (n % 17 == 0 && n != 17) {
			System.out.println("NOT PRIME.");
		} else if (n % 19 == 0 && n != 19) {
			System.out.println("NOT PRIME.");
		} else if (n % 23 == 0 && n != 23) {
			System.out.println("NOT PRIME.");
		} else {
			System.out.println("PRIME.");
		}
	}
}