package ex_18_OOPs_Constructor;

public class Lab177_PC_Real {
    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.address);
        p1.name = "Sanju";
        p1.phone = 1245668990;
        p1.address = "1234 1st street 2nd cross bangolore";
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.address);

        Person p2= new Person("Guru");
        System.out.println(p2.name);
        System.out.println(p2.phone);
        System.out.println(p2.address);

        Person p3 = new Person("Raju", 98765432);
        System.out.println(p3.name);
        System.out.println(p3.phone);
        System.out.println(p3.address);

        Person p4 = new Person("Raju", 98765432, "809 1st main mysore");
        System.out.println(p4.name);
        System.out.println(p4.phone);
        System.out.println(p4.address);




    }
}

class Person{

    String name;
    long phone;
    String address;

//    default Constructor
    Person(){

    }

//    single PC
    Person(String user_name){
        this.name = user_name;
    }

    Person(String user_name, long user_phone){
        this.name = user_name;
        this.phone = user_phone;

    }

    Person(String user_name, long user_phone, String user_address){
        this.name = user_name;
        this.phone = user_phone;
        this.address = user_address;
    }
}
