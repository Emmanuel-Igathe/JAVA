import java.sql.SQLOutput;

public class practice {
    public static void main(String[] args){
        double salary = 120000.34;
        boolean isMale = true;
        int cats = 34;
        char currency = '$';
        double annualEarnings = salary * 12;

        if (isMale == true){
            System.out.println("If you are a man,walk like man ,talk like a man");
            }
        else {
            System.out.println("Walk like a lady,speak like a lady");
        }

        System.out.println(annualEarnings);
        System.out.println("Your monthly earnings is " + salary);
        System.out.println("The symbol for the dollar is " + currency);
    }
}
