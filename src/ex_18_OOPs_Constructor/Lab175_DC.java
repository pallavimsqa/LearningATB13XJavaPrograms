package ex_18_OOPs_Constructor;

public class Lab175_DC {

    public static void main(String[] args){
        car c1= new car();


        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        c1.name = "Honda";
        c1.year = 2017;
        c1.model = "abc12";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        baby1 b1 = new baby1();
        System.out.println(b1.name);
        b1.name = "Jiya";
        System.out.println(b1.name);

    }
}

class car{
     String name;
     int year;
     String model;
// default constructor
     car(){
         name =  "unknown car";
         year =  1991;
         model = "xxx";

     }
}

class baby1{
    String name;

    baby1(){
        name = "chinnu";
    }

}