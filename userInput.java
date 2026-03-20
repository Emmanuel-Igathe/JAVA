import java.util.Scanner;
// To use the input function in Java we need the Scanner so we import from utility

public class userInput {
    public static void main(String[] args){
// To accept user input we have to create a scanner object
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter your name: "); //Using println prints on the nextline
         String name = scanner.nextLine();


        System.out.print("Enter your age: "); // Using print() we place input on same line
        int age = scanner.nextInt();

        // For a double we use the scanner.nextDouble();
        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        // For a boolean use scanner.nextBoolean();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


         scanner.close(); //close your scanner to prevent unexpected issues
        // when you open something you will need to close it at the end

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your final gpa is " + gpa);

        if (isStudent){
            System.out.println("You are enrolled!");
        }
        else {
            System.out.println("You are not enrolled");
        }


    }
}
