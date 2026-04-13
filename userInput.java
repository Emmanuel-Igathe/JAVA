import java.util.Scanner;
public class userInput
{
    public static void main(String[]args)
    {
        String name;
        int age;
        Scanner input=new Scanner(System.in);
        System.out.print("Key in your name: ");
        name=input.nextLine();
        System.out.print("Key in your age: ");
        age = input.nextInt();
        System.out.println("\n--User Details----");
        System.out.println("Name is:" + name);
        System.out.println("Age is:" + age);
        input.close();
    }
}