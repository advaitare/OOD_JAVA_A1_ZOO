package edu.neu.csye6200;

public class ZooAbstractAnimalAPI {
    public static void run2(){
        AbstractAnimalsAPI animal21 = new Tiger(); // class Tiger object created
        AbstractAnimalsAPI animal22 = new Monkey(); // class Monkey object created
        AbstractAnimalsAPI animal23 = new Leopard(); // class Leopard object created
        animal21.api2();
        animal22.api2();
        animal23.api2();
        
        System.out.println("----------------------------------------");
        
        String res21 = animal21.toString();
        String res22 = animal22.toString();
        String res23 = animal23.toString();
        System.out.println(res21);
        System.out.println(res22);
        System.out.println(res23);
        }
}
