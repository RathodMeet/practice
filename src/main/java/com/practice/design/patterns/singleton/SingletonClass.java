package com.practice.design.patterns.singleton;

public class SingletonClass {
    private String name;
    private String role;

    private volatile SingletonClass singletonInstance;

    private SingletonClass() {
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public SingletonClass getSingletonInstance() {
        if (singletonInstance != null)
            return singletonInstance;
        else
            return new SingletonClass();
    }

    public SingletonClass getAdvanceSingletonInstance() {

        if (singletonInstance == null) {
            synchronized (SingletonClass.class) {
                if (singletonInstance == null)
                    singletonInstance = new SingletonClass();
            }
        }

        return singletonInstance;
    }
}