package com.autowiring.Constructor;

public class Saikumar {

  private Mobile mobile;

    public Saikumar(Mobile mobile){
        this.mobile = mobile;
    }

    public void display(){
        mobile.modelName();
        mobile.ram();
        System.out.println("Mobile is checking");

    }
}
