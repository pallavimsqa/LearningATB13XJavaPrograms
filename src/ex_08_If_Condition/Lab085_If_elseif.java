package ex_08_If_Condition;
import java.util.Scanner ;


public class Lab085_If_elseif {

    public static void main(String[] args)
    {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter side1 length");
        int a = scanner.nextInt();

        System.out.println("Enter side2 length");
        int b = scanner.nextInt();

        System.out.println("Enter side3 length");
        int c = scanner.nextInt();

        System.out.println( a);
        System.out.println(b);
        System.out.println(c);

        if(a==b && a==c) {
            System.out.println("Triangle is equilateral");
        }

            else if(a==b || b==c || a==c)
        {
            System.out.println("Triangle is Isosceles");
        }
            else

            System.out.println("Triangle is Scalene");


        }
    }


