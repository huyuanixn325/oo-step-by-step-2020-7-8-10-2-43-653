package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void should_return_String_when_given_tom_and_21() {
        //given
        Person person = new Person("tom",21);
        //when
        String introduce = person.introduce();

        //then
        assertEquals(introduce," My name is Tom. I am 21 years old.");
    }

}
