package com.thoughtworks.basic;

public class Teacher extends Person{
    private String job;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a "+job+".";
    }
}
