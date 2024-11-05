package com.autowiring.ByType;

public class Saikumar {

    Mobile mobile;
    Laptop laptop;

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void display(){
        mobile.modelName();
        mobile.ram();
        System.out.println("Mobile is checking");
        laptop.name();
    }
}
