package wordFileDocs;

public class Factorial {

	//Given the Factorial Number output, Write a program (logic) to find the Input. 
	
	
	    public static void main(String args[]) {
	        int n = 6;

	        int fact = factorial(n);
	        int number = number(fact);

	        System.out.println("Factorial :"+fact + "  Input :" + number);
	    }

	    public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }
	        return fact;
	    }

	    public static int number(int factorial) {
	        int i = 0;
	        do {
	            i++;
	            factorial = factorial / i;
	        } while (factorial > 1);
	            return i;
	    }
}