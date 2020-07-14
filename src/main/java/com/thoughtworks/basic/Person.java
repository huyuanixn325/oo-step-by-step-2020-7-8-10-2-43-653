package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> messages;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.messages = new ArrayList<>();
    }


    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessage() {
        return messages;
    }

    public void setMessage(List<String> message) {
        this.messages = message;
    }

    public void addMessage(String message){
        this.messages.add(message);
    }
}
