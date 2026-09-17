import java.util.Scanner;

public class GPA {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        int age = 0;
        double gpa = 0;
        String name = "";

        // Outputs
        System.out.println("What's your name?");
        name = scan.nextLine();

        System.out.println("How old are you?");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age < 0 || age > 19){
                System.out.println("That is not a valid input.");
                System.exit(0);
            }
        } else {
            System.out.println("That is not a valid input.");
            System.exit(0);
        }

        System.out.println("What's your GPA?");
        if (scan.hasNextDouble()) {
            gpa = scan.nextDouble();
            if (gpa < 0 || gpa > 5){
                System.out.println("That is not a valid input.");
                System.exit(0);
            }
        } else {
            System.out.println("That is not a valid input.");
            System.exit(0);
        }

        // Output message
        System.out.println("Hello, " + name + ". You are " + age + " years old and have a GPA of " + gpa + ".");
    }
}
