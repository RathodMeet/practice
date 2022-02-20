package com.practice.design.patterns.adapter;

public class MobileToLaptopAdapter implements Laptop {

    private final Mobile mobile;

    public MobileToLaptopAdapter(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public void openWebCam() {
        mobile.openFrontCam();
    }
}
