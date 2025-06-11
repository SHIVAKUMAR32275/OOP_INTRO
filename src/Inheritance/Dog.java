package Inheritance;

public class Dog extends Animal{
    String Dog_name;
    String Dog_breed;

    void sound(){
        System.out.println(this.Dog_breed +"---------->"+this.Dog_name+"------->"+this.AnimalID+"---------->"+this.Animal_name);
    }

    // default constructor
//    Dog()
//    {
//        this.breed = " germen";
//        this.name = "puppy";
//    }

    Dog( String name,String breed,int AnimalID,String Animal_name){
        super(AnimalID,Animal_name);
        this.Dog_name = name;
        this.Dog_breed = breed;
    }
}
