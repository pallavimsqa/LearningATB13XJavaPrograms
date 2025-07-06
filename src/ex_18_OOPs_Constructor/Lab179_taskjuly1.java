package ex_18_OOPs_Constructor;


/* Program 1 : What is a default constructor? Give one example, Write a code for that.

Program 2: How do you create a parameterized constructor? Give one example, Write a code for that.*/

public class Lab179_taskjuly1 {

    public static void main(String[] args){

        taskConstructor tc1 =new taskConstructor();
        taskConstructor tc2 =new taskConstructor("TestAutomation", 13);
        System.out.println(tc1.batch);
        System.out.println(tc1.course);
        System.out.println(tc2.batch);
        System.out.println(tc2.course);


    }
}
 class taskConstructor{

    String course;
    int batch;

    taskConstructor(){

    }

     taskConstructor(String user_course, int user_batch){
        this. course = user_course;
        this.batch = user_batch;
     }

 }
