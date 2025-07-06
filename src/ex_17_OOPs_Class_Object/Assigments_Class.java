package ex_17_OOPs_Class_Object;

import java.sql.SQLOutput;

public class Assigments_Class {
    public static void main(String[] args){
    Class1 c1= new Class1();
//    c1.test2();
    c1.test();
    Class2 c2 = new Class2();
//    c2.test();
    c2.test2();
    }
}
 class Class1{
    void test(){
        System.out.println("this is test");
    }
 }
 class Class2 {
    void test2(){
        System.out.println("this is test2");
    }
 }