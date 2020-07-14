package com.thoughtworks.basic;

import org.junit.Assert;
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
        Student student1 = new Student("张山",23);
        Student student2 = new Student("李四",20);
        Student student3 = new Student("王五",18);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass myclass = new KClass(2,"二年级二班",students,teacher);
        student1.setkClass(myclass);
        student2.setkClass(myclass);
        student3.setkClass(myclass);
        //when
       List<Student> studentsResult = myclass.getStudents();
        //then
        Assert.assertEquals(studentsResult.size(),3);
    }
}
