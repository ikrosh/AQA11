package org.lesson7;

public class Main {

    public static void main(String[] args) {
        Animal wolf = new Wolf("Reom");
        wolf.greets();
        System.out.println(wolf.getName());

        System.out.println("!!!!!!!!!");

        Wolf wolf1 = new Wolf("Renk");
        wolf1.hunting();
        wolf1.greets();
    }
}
