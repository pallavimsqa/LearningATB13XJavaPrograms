package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {

    public static void main(String[] args){
        Baby b1 = new Baby();
        b1.cry();
        b1.sleep();
        b1.eat();

    }



}

class Baby{

//    Attribute| instance Variable | member variable | data variable
    String name;


    Baby(){
        System.out.println("this is the deafault constructor");
        System.out.println("Can give any messages that wants to be excetue/print before the methods");

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }


    void m1(){
        System.out.println("m1");
    }

//    Behaviour

    void cry(){
        System.out.println("baby is crying");
    }

    void sleep(){
        System.out.println("Baby is sleeping");
    }

    void eat(){
        System.out.println("Baby is eating");
    }
}
