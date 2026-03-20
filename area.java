import java.util.Scanner;
// To use input we need to import Scanner from utility
public class area {
    public static void main(String[] args){

        /*Area of a rectangle
        Start by declaring the variables
         */
        double length = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        //The first Scanner is class and second is object

        //ask user to enter the length
        System.out.print("Enter the length of Rectangle: ");
        length = scanner.nextDouble(); // Since we already declared we dont need to declare again here

        //ask user to enter the width
        System.out.print("Enter the width of rectangle: ");
        width = scanner.nextDouble();

        area = length * width;// Calculate area of rectangle formula

        System.out.println("The area of the Rectangle is " + area); //Output the area

        scanner.close();

    }
}
