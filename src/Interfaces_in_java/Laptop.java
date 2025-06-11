package Interfaces_in_java;

public interface Laptop {

    public void copy();

    public void paste();

    public void cut();

    public void keyBoard();

    // non-static method
    default void camera(){
        //price();
        // we can implement static methods in non-static method
        System.out.println(" this is default camera implementation interface");
    }

    // static method
    static void price(){
        //camera();
        // but we cannot implement non-static methods in static methods
        System.out.println(" this is static implementation in interface");
    }
}
