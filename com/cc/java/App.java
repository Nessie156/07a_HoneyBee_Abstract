package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

        // Nicht mehr möglich --> Abstraktion
        // HoneyBee bee = new HoneyBee();
        // pollObj(bee);

   
    }

   // 2. Variante - Polymorphie
    private static void pollObj(HoneyBee obj) {
        output(obj.doYourJob());
        output(obj.fly());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

