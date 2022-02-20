package com.practice.design.patterns.abstractfactory;

public class MinClass {
    public static void main(String[] args) {

        var factory = ShapeFactoryProducer.getFactory("Round");
        Shape shape = factory.createShape("square");
        shape.draw();
    }
}
