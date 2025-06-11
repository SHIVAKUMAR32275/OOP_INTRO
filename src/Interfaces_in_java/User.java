package Interfaces_in_java;

public class User {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        // laptop implementation
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.cut();
        lenovo.keyBoard();
        lenovo.paste();
        lenovo.camera();
        Laptop.price();


        System.out.println();
        System.out.println();


        // dell implementation
        Dell dell = new Dell();
        dell.copy();
        dell.cut();
        dell.paste();
        dell.paste();
        dell.camera();
        Laptop.price();




    }
}
