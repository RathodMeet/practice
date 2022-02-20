package com.practice.design.patterns.abstractfactory;

public class ShapeFactoryProducer {

    public static ShapeFactory getFactory(String type) {
        if ("Round".equals(type)) return new RoundShapeFactory();
        if ("Normal".equals(type)) return new NormalShapeFactory();
        else return null;
    }
}
