package ex_18_OOPs_Constructor;

public class Lab174_Example2 {
    public static void main(String[] args){

        webAutomation w = new webAutomation();


    }
}

class webAutomation {
//    Default constructor
    webAutomation(){
        System.out.println("this is the default consturctor");
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("Y0u can do anything which you want to do, when Object is created.");


//        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
