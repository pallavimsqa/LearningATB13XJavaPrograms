package ex_31_Generics;

public class Lab237_Generics_Method_Fix {
    public static void main(String[] args) {
        display(3,4);
        display(3.14,4.45);
        display("pallavi","ms");

    }
// when generics returns something, add return type T, variable(c), retuen null
    static <T> T display(T a,T b, T c) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

// when its not returning anything
    static <T> void display(T a,T b) {
        System.out.println(a);
        System.out.println(b);
    }
}
