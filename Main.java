import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        int age = 22;
        int year = 2026;
        double price = 100.40;
        double temperature = 12.8;
        char grade = 'A';
        char currency = '$';  // enclose in single quotes
        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;
        String name = "Emmanuel Igathe";
        String food = "Chicken";
        String email = "emmanueligathe4@gmail.com";
        String car = "Mazda CX-5";
        String color = "Red gem";

        System.out.println("Hello " + name + ",Welcome to the Technical University of Kenya");
        System.out.println("Your favourite food is " + food);
        System.out.println("Your official email address is " + email);
        System.out.println("You drive a " + car + " which you bought in the year " + year);
        System.out.println("Your age is " + age);
        System.out.println("We are in the year " + year);
        System.out.println("The price of food is " + price);
        System.out.println("The temperatures have dropped by " + temperature);
        System.out.println("Your car of choice is the " + year + " " + color + " " + car);
        System.out.println(grade);
        System.out.println(currency);
        if(isStudent){
            System.out.println("Get in class and read");
        }
        else {
            System.out.println("Enda Mjengo bro");
        }
        if(forSale){
            System.out.println("What is the price? ");
        }
        else {
            System.out.println("Museums dont sell!!");
        }
    }
}
