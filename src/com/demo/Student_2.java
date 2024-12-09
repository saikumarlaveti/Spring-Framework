package com.demo;

public class Student_2 {
    int id ;
    String name;
    Student_2(){

    }
    Student_2(int id,String name){
        this.id = id;
        this.name  = name;
    }

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
    public void display(){
        System.out.println("Id " + id + " " + "Name " + name );
    }

    public void displayTime(int hours){
        if(hours>12){
            System.out.println("Good After Noon");
        } else if (hours>=6) {
            System.out.println("Good Morning");
        }
        else {
            System.out.println("Good Night");
        }
    }
}
