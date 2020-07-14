package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_String_when_given_tom_and_21_class_2() {
        //given
        Student student = new Student("Tom",21);
        List<Student> students = new ArrayList<>();
        students.add(student);
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass kClass = new KClass(2,"2班",students,teacher);
        student.setkClass(kClass);
        //when
        String introduce = student.introduce();

        //then
        assertEquals(introduce,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }

    @Test
    public void should_return_String_when_given_Jack_and_21_class_2() {
        //given
        Student student = new Student("Tom",21);
        List<Student> students = new ArrayList<>();
        students.add(student);
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass kClass = new KClass(2,"2班",students,teacher);
        student.setkClass(kClass);

        student.changeName("Jack");
        //when
        String introduce = student.introduce();

        //then
        assertEquals(introduce,"My name is Jack. I am 21 years old. I am a Student of Class 2.");
    }

    @Test
    public void should_return_a_message_when_given_Tom_and_21_class_2_and_checkd_jack() {
        //given
        Student student = new Student("Tom",21);
        List<Student> students = new ArrayList<>();
        students.add(student);
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass kClass = new KClass(2,"2班",students,teacher);
        student.setkClass(kClass);

        student.changeName("Jack");
        //when
        List<String> messages = teacher.getMessage();

        //then
        Assert.assertEquals(messages.size(),1);
        assertEquals(messages.get(0),"My name is Jack. I am 21 years old. I am a Student of Class 2.");
    }

    @Test
    public void should_return_a_message_when_given_Tom_and_22_class_2_and_checkd_jack() {
        //given
        Student student = new Student("Tom",22);
        Student student2 = new Student("wangna",23);
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass kClass = new KClass(2,"2班",students,teacher);
        student.setkClass(kClass);
        student2.setkClass(kClass);
        student.changeName("Jack");
        //when
        List<String> messages = student2.getMessage();

        //then
        Assert.assertEquals(messages.size(),1);
        assertEquals(messages.get(0),"My name is Jack. I am 22 years old. I am a Student of Class 2.");
    }
}
