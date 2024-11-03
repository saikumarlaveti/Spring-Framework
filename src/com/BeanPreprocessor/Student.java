package com.BeanPreprocessor;

public class Student {

    private int id;
    private String name;

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
    public void sai_initMethod(){
        System.out.println("Values are inserted");
    }
    public void    sai_destoyed(){
        System.out.println("Values are deleted");

    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
