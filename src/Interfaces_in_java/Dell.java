package Interfaces_in_java;

public class Dell implements Laptop{
    @Override
    public void copy() {
        System.out.println( " this is Dell copy method....");
    }

    @Override
    public void paste() {
        System.out.println(" this is Dell paste method");
    }

    @Override
    public void cut() {
        System.out.println(" this is Dell cut method");
    }

    @Override
    public void keyBoard() {
        System.out.println(" this is Dell keyBoard method");
    }
}
