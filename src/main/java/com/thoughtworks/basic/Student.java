package com.thoughtworks.basic;

public class Student extends Person{
    private int classNumber;
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student of Class "+this.classNumber+".";
    }
}
