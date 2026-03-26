// A REGISTRATION FORM FOR A CLUB

import java.util.Scanner;
public class clubRegistration {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter their full names
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        //prompt user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Prompt user to enter their county
        System.out.print("Enter your county of residence: ");
        String county = scanner.nextLine();

        //Prompt to enter gender
        System.out.print("Enter gender (male/female)");
        String gender = scanner.nextLine();

        //Prompt to enter course of study
        System.out.println("Enter course of study: ");
        String course = scanner.nextLine();

                scanner.close();
    }
}
