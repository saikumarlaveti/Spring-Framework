package com.autowiring;

public class Saikumar {
    Mobile mobile;

    public  Saikumar(Mobile mobile) {
        this.mobile = mobile;
    }

//    public Mobile getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(Mobile mobile) {
//        this.mobile = mobile;
//    }

    public void display(){
        mobile.modelName();
        mobile.ram();
    }
}
