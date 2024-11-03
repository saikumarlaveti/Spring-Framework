package com.setterInjection;

public class Saikumar {
    Lokesh loke;

    public void setLoke(Lokesh loke){
        this.loke = loke;
    }

    public Lokesh getLoke(){
        return loke;
    }

    public void details(){
        loke.name();
        loke.age();
    }
}
