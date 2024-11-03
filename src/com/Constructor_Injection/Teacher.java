package com.Constructor_Injection;

public class Teacher {
    public Student student;

    public  Teacher(Student student){
        this.student = student;
    }
    public void speck(){
    student.name();
    student.RollNo();
}
}