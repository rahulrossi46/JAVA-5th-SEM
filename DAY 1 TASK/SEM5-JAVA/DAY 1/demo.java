import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = s.nextInt();

        System.out.println("Enter your weight:");
        int weight = s.nextInt();

        if (age > 18) {
            if (weight > 50) {
                System.out.println("You are eligible for blood donation.");
            } else {
                System.out.println("You are not eligible for blood donation due to insufficient weight.");
            }
        } else {
            System.out.println("You are not eligible for blood donation due to insufficient weight and age.");
        }

        s.close();
    }
}