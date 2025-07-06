package ex_17_OOPs_Class_Object;

import javax.swing.*;

public class Lab167_OOPs {
    public static void main(String[] args){

        Student s1 = new Student();
        Student s2;
        new Student();
        s1.sleep();
//        s2.sleep(); // not created an oblject


    }

}

class Student   {

    String name;

    // Default constructor , same name as class name
    Student(){
        System.out.println("Default constructor");
      }

      void sleep(){
        System.out.println("Sleep");

      }

}

class A{}
class B{}




