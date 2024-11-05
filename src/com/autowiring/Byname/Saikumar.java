package com.autowiring.Byname;

public class Saikumar {

  private   Mobile mobile;
    private Laptop laptop;

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Mobile getMobile() {
        return mobile ;
    }

    public void display(){
        mobile.modelName();
        mobile.ram();
        System.out.println("Mobile is checking");
        laptop.name();
    }
}
