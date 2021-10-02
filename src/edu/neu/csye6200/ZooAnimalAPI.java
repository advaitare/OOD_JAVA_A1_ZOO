package edu.neu.csye6200;

public class ZooAnimalAPI {
    public static void run1(){
        AnimalsAPI animal11 = new Dog(); // class Dog object created
        AnimalsAPI animal12 = new Cat(); // class Cat object created
        AnimalsAPI animal13 = new Lion(); // class Lion object created
    
        
        animal11.api1();
        animal12.api1();
        animal13.api1();
        
        System.out.println("----------------------------------------");
        
        String res11 = animal11.toString();
        String res12 = animal12.toString();
        String res13 = animal13.toString();
        System.out.println(res11);
        System.out.println(res12);
        System.out.println(res13);
    }
}
