package com.thoughtworks.basic;

public class Student extends Person{
    private KClass kClass;
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, KClass kClass) {
        super(name, age);
        this.kClass = kClass;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student of Class "+this.kClass.getClassNumber()+".";
    }

    public KClass getkClass() {
        return kClass;
    }

    public void setkClass(KClass kClass) {
        this.kClass = kClass;
    }
}
