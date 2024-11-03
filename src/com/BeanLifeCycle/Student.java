package com.BeanLifeCycle;

public class Student {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void init(){
        System.out.println("Object is created");
    }
    public void destory(){
        System.out.println("Object is destroyed");
    }
}
