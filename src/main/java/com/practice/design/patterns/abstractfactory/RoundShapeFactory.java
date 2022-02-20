package com.practice.design.patterns.abstractfactory;

public class RoundShapeFactory implements ShapeFactory {
    public Shape createShape(String type) {
        if ("square".equals(type)) return new RoundedSquare();
        if ("triangle".equals(type)) return new RoundedTriangle();
        else return null;
    }
}
