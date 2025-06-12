import java.util.Scanner;

	public class TotalAndAverageCalculator {
	    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        double average = 0.0;
        int count = 0;

        try  {
            System.out.print("Enter how many numbers you want to input: ");
            count = Integer.parseInt(scanner.nextLine());

            if (count <= 0) {
                throw new ArithmeticException("Count must be greater than zero.");
            }

            for (int i = 1; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                int number = Integer.parseInt(scanner.nextLine());
                	total += number;
            }

            average = (double) total / count;

            System.out.println("Total: " + total);
            System.out.println("Average: " + average);

        } catch (NumberFormatException e) {
            	System.out.println("Invalid input! Please enter a valid number.");
        }    catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }  catch (Exception e)   {
           	 System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
          
        }
    }
}
