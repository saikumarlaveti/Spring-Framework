package com.autowiring.NoAutowiring;

public class Saikumar {
    Mobile mobile;

//    public  Saikumar(Mobile mobile) {
//        this.mobile = mobile;
//    }



    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void display(){
        mobile.modelName();
        mobile.ram();
    }
}
