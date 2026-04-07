import java.util.Scanner; //Import scanner for use in inputs

public class conditionalStatements {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //if statements are executed only when true

        String name;
        int age;
        double height;
        double weight;

        //Prompt user to enter full name
        System.out.print("Enter your full names: ");
        name = scanner.nextLine();

        //Prompt user to enter age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        //Prompt user to enter their height in cm
        System.out.print("Enter your height in cm: ");
        height = scanner.nextDouble();

        //Prompt user to enter their weight
        System.out.print("Enter your weight in kg: ");
        weight = scanner.nextDouble();

        //GROUP 1 FOR THE NAME
        if(name.isEmpty()){
            System.out.println("You have not entered your name: ");
        }
        else{
            System.out.println("Welcome " + name + " feel at home!");
        }

        //GROUP 2 FOR THE AGE
        if(age >= 65){
            System.out.println("You are retired from job ");
        }
        else if(age < 18){
            System.out.println("You are considered a child");
        }
        else if(age >= 35){
            System.out.println("You can vie for the presidential sit");
        }
        else if(age >= 18){
            System.out.println("You can vote!!");
        }

        //GROUP 3 FOR THE HEIGHT
        if(height > 200){
            System.out.println("You are a giant!!");
        }
        else if(height <= 147){
            System.out.println("You are a dwarf!");
        }
        else{
            System.out.println("You are average height");
        }

        //GROUP 4 FOR WEIGHT
        if(weight >= 150){
            System.out.println("You are obese");
        }
        else if(weight <= 20){
            System.out.println("You are underweight");
        }
        else{
            System.out.println("You have a healthy weight");
        }
        scanner.close();
    }
}
