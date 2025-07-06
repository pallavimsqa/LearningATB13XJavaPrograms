package ex_18_OOPs_Constructor;

public class Lab176_parameterised_Cons {
    public static void main(String[] args){
        BabyA b1 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b1.Adhar_num);
        System.out.println(b1.day);
        System.out.println(b1.month);
        System.out.println(b1.year);
        b1.name = "Mia";
        System.out.println(b1.name);

        BabyA b2 =new BabyA("Surya", "273615245968",29,04,2020);

        System.out.println(b2.name);
        System.out.println(b2.Adhar_num);
        System.out.println(b2.day);
        System.out.println(b2.month);
        System.out.println(b2.year);
        b2.Adhar_num = "0000";
        System.out.println(b2.Adhar_num);

    }

}

class BabyA{

    String name;
    String Adhar_num;
    int day;
    int month;
    int year;

//    Default constructor
    BabyA(){
        name = "Meera";
        Adhar_num = "983412895683";
        day = 14;
        month = 02;
        year = 2018;

    }

//    parameterisied constructor
    BabyA(String user_name, String user_Adhar_num, int user_day, int user_month, int user_year){
        this.name = user_name;
        this.Adhar_num = user_Adhar_num;
        this.day = user_day;
        this.month = user_month;
        this.year = user_year;
    }

}
