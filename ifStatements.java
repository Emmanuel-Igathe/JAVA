import java.util.Scanner; //Import scanner from utilities

public class ifStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // if statements perform a block of code if the condition is true

        String name;
        int age;
        boolean isStudent;

        //Prompt user to enter his/her name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        //Prompt user to enter his/her age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        //Prompt user to enter if student
        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1 FOR NAME
        if(name.isEmpty()){
            System.out.print("You did not enter your name!!");
        }
        else{
            System.out.println("Hello " + name + " welcome and feel at home!!");
        }

        //GROUP 2 FOR HANDLING AGE
        if(age >= 65){
            System.out.println("You are very old and tired");
        }

        else if(age >= 18){
            System.out.println("You are an adult");
        }

        else if(age < 0){
            System.out.println("You havent been born");
        }

        else if(age == 0){
            System.out.println("Welcome to the world lil infant");
        }

        else{
            System.out.println("You are a child!!");
        }

        //GROUP 3 FOR BOOLEAN
        if(isStudent){
            System.out.println("You are a student!!");
        }
        else{
            System.out.println("You are not a student!!");
        }

        scanner.close();

    }
}
