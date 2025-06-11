package Interfaces_in_java;

public class Hp implements Laptop{
    @Override
    public void copy() {
        System.out.println( " this is lenovo copy method....");
    }

    @Override
    public void paste() {
        System.out.println(" this is lenovo paste method");
    }

    @Override
    public void cut() {
        System.out.println(" this is lenovo cut method");
    }

    @Override
    public void keyBoard() {
        System.out.println(" this is lenovo keyBoard method");
    }
}
