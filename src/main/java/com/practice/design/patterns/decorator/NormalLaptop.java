package com.practice.design.patterns.decorator;

public class NormalLaptop implements Laptop{

    @Override
    public String getSpecifications() {
        return "Laptop," + " cover,"+ " pen drive";
    }
}
