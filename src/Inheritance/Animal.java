package Inheritance;

public class Animal {
    int AnimalID;
    String Animal_name;


    void sound(){
        System.out.println(this.Animal_name+" is roaring id :" + AnimalID);
    }

    Animal(int AnimalID,String Animal_name){
        this.AnimalID = AnimalID;
        this.Animal_name = Animal_name;
    }


}
