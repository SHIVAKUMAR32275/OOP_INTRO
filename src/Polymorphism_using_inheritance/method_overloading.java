package Polymorphism_using_inheritance;

public class method_overloading {

    int add(int a ,int b){
        return a + b;
    }

    int add( int a,int b,int c){
        return a + b + c;
    }

    double add( double a,double b){
        return a + b;
    }

    double add( int a,double b){
        return a + b;
    }
}
