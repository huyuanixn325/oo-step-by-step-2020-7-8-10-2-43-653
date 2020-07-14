package com.thoughtworks.basic;

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

}
