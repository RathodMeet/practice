package com.practice.design.patterns.abstractfactory;

public class NormalShapeFactory implements ShapeFactory {
    public Shape createShape(String type) {
        if ("square".equals(type)) return new Square();
        if ("triangle".equals(type)) return new Triangle();
        else return null;
    }
}
