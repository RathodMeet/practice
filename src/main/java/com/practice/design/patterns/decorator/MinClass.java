package com.practice.design.patterns.decorator;

public class MinClass {
    public static void main(String[] args) {

        Laptop normalLaptop = new NormalLaptop();
        System.out.println("Normal laptop specification: " + normalLaptop.getSpecifications());

        Laptop gamingLaptop = new GamingLaptop(normalLaptop);
        System.out.println("Gaming laptop specification: " + gamingLaptop.getSpecifications());
    }
}
