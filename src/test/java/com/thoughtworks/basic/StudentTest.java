package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_String_when_given_tom_and_21_class_2() {
        //given
        Student student = new Student("Tom",21,2);
        //when
        String introduce = student.introduce();

        //then
        assertEquals(introduce,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }

}
