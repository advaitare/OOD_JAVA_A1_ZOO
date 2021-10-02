package edu.neu.csye6200;

public class ZooAnimalisticAnimalAPI{
    public static void run3() {
        AnimalisticAnimalsAPI animal31 = new Zebra(); // class Zebra object created
        AnimalisticAnimalsAPI animal32 = new Elephant(); // class Elephant object created
        AnimalisticAnimalsAPI animal33 = new Deer(); // class Deer object created
        
        animal31.api3();
        animal32.api3();
        animal33.api3();
        
        System.out.println("----------------------------------------");
        
        String res31 = animal31.toString();
        String res32 = animal32.toString();
        String res33 = animal33.toString();
        System.out.println(res31);
        System.out.println(res32);
        System.out.println(res33);
    }
}
