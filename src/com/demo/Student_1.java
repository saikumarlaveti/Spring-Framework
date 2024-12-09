package com.demo;

import java.util.Date;

public class Student_1 {

    int id;
    String name;
    Student_2 object;
    Date date;
    int hours;


   public Student_1(){

    }
    public Student_1(int id ,String name){
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        if (date != null) {
            this.hours = date.getHours();
        }
    }
  //  int hours = date.getHours();
    public Student_2 getObject() {
        return object;
    }

    public void setObject(Student_2 object) {
        this.object = object;
    }





    public void allStudentDeplay(){
        System.out.println("Id :" + id + " " + "Name :" + name );
        System.out.println("Id :" + object. id + " " + "Name :" + object.name );
       object.displayTime(hours);

    }

}
