import java.util.Scanner; // To use the input() function we have to import the scanner class

public class input2 {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // use this for strings

        // Prompt user to enter their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        //Prompt user to enter their height
        System.out.println("Please enter your height in cm: ");
        double height = scanner.nextDouble();

        //Prompt user to say if male or female
        System.out.println("Are you male ? (true/false)");
        boolean isMale = scanner.nextBoolean();





        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You are " + height + " tall");
        // conditional statement for the boolean
        if(isMale) {
            System.out.println("Lets go bowling");
        }
        else {
            System.out.println("Lets make some dolls");
        }



        scanner.close();
    }
}
