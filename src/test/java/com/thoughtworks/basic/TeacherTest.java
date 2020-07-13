package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void should_return_String_when_given_tom_and_21_and_is_a_Teacher() {
        //given
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        //when
        String introduce = teacher.introduce();

        //then
        assertEquals(introduce,"My name is Matt. I am 30 years old. I am a Teacher.");
    }

}
