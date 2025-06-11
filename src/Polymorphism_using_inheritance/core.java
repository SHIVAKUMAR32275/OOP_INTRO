package Polymorphism_using_inheritance;

public class core {
    public static void main(String[] args) {

        System.out.println();

        // Method over-riding implementation using inheritance ( run-time implementation )

        Animal animal1 = new Dog();
        animal1.speak();
        animal1.eat();

        System.out.println();


        // Method over-loading implementation using inheritance( compile-time Polymorphism )

        method_overloading m = new method_overloading();
        System.out.println("test case 1 : "+m.add(2,3));
        System.out.println("test case 2 : "+m.add(2,3,23));
        System.out.println("test case 3 : "+m.add(2,3.0));
        System.out.println("test case 4 : "+m.add(2.09876,3.0));


    }
}
