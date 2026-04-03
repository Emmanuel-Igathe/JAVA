import java.util.Scanner; //import scanner from utility for user input

public class shoppingCart {
    public static void main(String[] args){

        // shopping cart Program
        Scanner scanner = new Scanner(System.in); //opens the input code
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        //prompt user to enter the item name they want to buy
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();  //allow for input

        //Prompt user to enter the price for each item
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        //Prompt user to enter quantity of item they wish to buy
        System.out.print("How many items would you like to buy?: ");
        quantity = scanner.nextInt();

        //To get the total amount of money used
        total = price * quantity;

        //Out puts to the user inputs
        System.out.println(item);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        scanner.close(); //closes the input code
    }
}
