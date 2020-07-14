package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClassTest {
    @Test
    public void should_return_1_when_given_class() {
        //given
        List<Student> students = new ArrayList<>();
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass myclass = new KClass(2,"二年级二班",students,teacher);
        //when
        Teacher teacherResult = myclass.getTeacher();
        //then
        assertEquals(teacherResult.getJob(),teacher.getJob());
        assertEquals(teacherResult.getAge(),teacher.getAge());
        assertEquals(teacherResult.getName(),teacher.getName());
    }
    @Test
    public void should_return_3_when_given_studentList() {
        //given
        List<Student> students = new ArrayList<>();
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass myclass = new KClass(2,"二年级二班",students,teacher);
        //when
        Teacher teacherResult = myclass.getTeacher();
        //then
        assertEquals(teacherResult.getJob(),teacher.getJob());
        assertEquals(teacherResult.getAge(),teacher.getAge());
        assertEquals(teacherResult.getName(),teacher.getName());
    }
}
