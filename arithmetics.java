public class arithmetics {
    public static void main(String[] args) {
        /*Java arithmetics operators
        int x = 10;
        int y = 2;
        int z;
        int g;
        int k;
        int d;
        int p;

        z = x + y; // addition
        g = x - y; //subtraction
        k = x * y; //multiply
        d = x / y; //Division
        p = x % y; //Modulus(reminder)

        //Augmented Assignment Operators
        // x = x + y;
        // x = x - y;
        // x = x * y;
        // x = x / y

        // augmented form
        // x += y;
        // x -= y;
       // x *= y;
        // x /= y;
        x %= y;



       // System.out.println(x);




/*
        System.out.println(z);
        System.out.println(g);
        System.out.println(k);
        System.out.println(d);
        System.out.println(p);
*/

        // Increment and decrement operators
        int x = 1;
        x = x + 1; // we are incrementing by 1
        // The simplest way
        x ++;
        x ++;
        x ++;
        x ++;
        System.out.println(x);

        //To decrement
        int y = 10;
        y = y - 1;
        y --; //simplest way
        System.out.println(y);

        // ORDER OF OPERATIONS [P-E-M-D-A-S] from left to right
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);

    }
}
