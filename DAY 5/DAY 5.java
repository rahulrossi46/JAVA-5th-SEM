package Program;
import java.utilo.Scanner;
public class Sample {
	public static void main(Stirng[] args) {
	  Scanner in  = new Scanner (System.in);
	try {
	     System.out.println("Enter the number:");
	     int number = in.nextInt();
	    int total = 10 / number;
	    System.out.println("Total:"+total);
	}
	catch(Exception e) {
		System.out.println(e);
	}
        }
} 