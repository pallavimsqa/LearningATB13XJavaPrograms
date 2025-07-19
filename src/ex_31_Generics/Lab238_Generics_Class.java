package ex_31_Generics;

public class Lab238_Generics_Class {
    public static void main(String[] args) {
        GenericClass g = new GenericClass(10);
        GenericClass g1 = new GenericClass(1.23);
        GenericClass g2 = new GenericClass("Pallavi");
        GenericClass g3 = new GenericClass(true);

        System.out.println(g.getData());

    }

}

class GenericClass<T>{

    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
