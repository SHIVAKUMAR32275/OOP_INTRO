package Inheritance;

public class Central {
    public static void main(String[] args) {

        System.out.println("-------***--------------output---------***-------------");

        System.out.println();
        System.out.println();

        Animal animal = new Animal(12,"tiger");
        Dog dog = new Dog("puppy","dog",101,"tiger");
        Cat cat = new Cat("kitty",102,"elephant","leo","german");

        animal.sound();
        dog.sound();
        cat.sound();


        System.out.println();
        System.out.println();
        System.out.println("-------***--------------output---------***-------------");
    }
}
