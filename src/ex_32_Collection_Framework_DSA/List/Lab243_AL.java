package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL {

    public static void main(String[] args) {

        List l =new ArrayList(10);
        l.add("1");// 0
        l.add("2");// 1
        l.add("3"); // 2
        l.add("3");  //3
        l.add(4);  //4
        l.add(true);  //5
        l.add("3"); // 6
        l.add (1);// 7
        l.add(3);//8
        l.add(3);//9
        l.add(5); //10
        l.add("Pallavi"); //11
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));
        System.out.println(l.contains(3));
        System.out.println(l.indexOf(true)); // Returns the index of the first occurrence of the specified element in this list,
        System.out.println((l.lastIndexOf(3)));
        System.out.println("-----------------------------------------");

        for (int i = 0; i < l.size() ; i++) {
            System.out.println(l.get(i));

        }

        System.out.println("-----------------------------------");

        for (Object o : l){
            System.out.println(o);
        }

        System.out.println(l);
        l.set(10,"Jiya");
        System.out.println(l);
        l.remove(true);
        l.remove(0);
        l.remove(3);
        System.out.println(l);

        l.clear();
        System.out.println(l);
        System.out.println(l.isEmpty());


        System.out.println(l);


    }
}
