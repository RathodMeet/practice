package com.practice.design.patterns.decorator;

public class GamingLaptop implements Laptop {

    private Laptop laptop;

    public GamingLaptop(final Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String getSpecifications() {
        return laptop.getSpecifications() + ", Mouse" + ", head phones" + ", joystick";
    }
}
