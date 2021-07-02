import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // primitve  data types - not changeable
        int hello_world = 5;
        double num2 = 5.0;
        boolean b = true;
        char c = 'h';

        //non-primitive data type
        String str = "9";
        
        // never assign any int variable to string
        int tim = hello_world;


        // another way to define a variable
        // int x;
        // x = 6;

        // basic operations (/ * + -)
        // if one of the value of any variable is double declared 
        // thn every value will become double 
        // operators that are operators variables tht youre adding, subtracting whatever
        // is double, then that means you're going to get a double value back and if all
        // of them are integers that means we will get integer value
        // integer cant hold point value but double can
        //  and we can't change double to integer
        int x = 5;
        int y = 7;
        double z = 57;
        double answer = z / y;

        // exponents always have to be in double
        double d = Math.pow(x,y);

        // typecasting: we can directly change the value of interger to double simply
        // put bracket() into the line before the variable and define the type you need
        // to convert
        int x1 = 5;
        int y1 = 7;
        int z1 = 57;
        double answer2 = z1 / (double)y1;

        // Input and Scanners
        //int xr = 56 % 5;
        // Scanner sc = new Scanner(System.in);
        // String scanned = sc.next();

        // //convert string to int
        // int xc = Integer.parseInt(scanned);

        // conditions and boolean compare operators
        // > (greater than sign) 
        // < (less than sign)
        // == (Equal to: we use this sign to compare the values) 
        // >= (greater than equal to)
        // <= (less than equal to)
        // != (not equal to)
        int xh = 6;
        int yh = 7;
        int zh = 10;

        boolean compare = xh != yh;



        System.out.println(compare);

    }
}
