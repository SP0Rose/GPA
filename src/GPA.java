import java.util.Scanner;

public class GPA {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        int age;
        double gpa;
        String name;

        // Outputs
        System.out.println("What's your name?");
        name = scan.nextLine();

        System.out.println("How old are you?");
        age = scan.nextInt();
        if (age < 0 || age > 18){
            System.out.println("That is not a valid input.");
            System.exit(0);
        }

        System.out.println("What's your GPA?");
        gpa = scan.nextDouble();
        if (gpa < 0 || gpa > 4){
            System.out.println("That is not a valid input.");
            System.exit(0);
        }

        System.out.println("Hello, " + name + ". You are " + age + " years old and have a GPA of " + gpa + ".");
    }
}
