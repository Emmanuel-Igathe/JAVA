import java.util.Scanner;  //import java class Scanner from util

public class userInput3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Prompt a user to enter their name
        System.out.print("Enter your Full names: ");
        String name = scanner.nextLine();

        //Prompt user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //prompt user to enter their height
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        scanner.nextLine();

        //prompt user to enter their home residence
        System.out.print("Enter location of your home premises: ");
        String home = scanner.nextLine();

        //Prompt to enter if male or female
        System.out.print("Are you male?(true/false)");
        boolean isMale = scanner.nextBoolean();

        if(isMale){
            System.out.println("You are either a boy or a man!!");
        }
        else{
            System.out.println("You are either a girl or a woman");
        }

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You are " + height + " cm tall");
        System.out.println("You place of residence is in " + home);


        scanner.close();
    }
}
