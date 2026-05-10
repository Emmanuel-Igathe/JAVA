import java.util.Scanner;

public class ifStatement4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("You are an adult");
        }
        else if(age >= 65){
            System.out.println("You are elderly");
        }
        else if(age >= 18 && age <= 35 ){
            System.out.println("You are a youth");
        }
        else if(age >= 0 && age < 18 ){
            System.out.println("You are a child");
        }
        else{
            System.out.println("You are either a Zygote,Embryo or Featus");
        }

        scanner.close();
    }
}
