package Inheritance;

public class Cat extends Dog{
    String name;


    Cat(String name,int AnimalID,String Animal_name,String Dog_name,String Dog_breed){
        super(Dog_name,Dog_breed,AnimalID,Animal_name);
        this.name = name;
    }



    void sound(){
        System.out.println(name+"---->"+AnimalID+"---->"+Animal_name+"----->"+Dog_name+"----->"+Dog_breed);
    }
}
