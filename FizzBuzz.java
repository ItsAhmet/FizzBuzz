import java.util.Scanner;

public class FizzBuzz {
public static void main(String Args[]) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a number you would like to count to -->\n");
	
	int x = 1;
	int y = scan.nextInt();
	
	
	while (x <= y) {
		
	    if (x % 3 == 0 && x % 5 == 0) {
	    	
	        System.out.println("FizzBuzz");
	        
	    } else if (x % 3 == 0) {
	    	
	        System.out.println("Fizz");
	        
	    } else if (x % 5 == 0) {
	    	
	        System.out.println("Buzz");
	        
	    } else System.out.println(x);
	    
	    
	    x++;
	}
	  }
	
	

}
