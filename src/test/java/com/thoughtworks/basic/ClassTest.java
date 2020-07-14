package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;
import sun.plugin2.message.Message;

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

    @Test
    public void should_return_message_when_given_studentList() {
        //given
        List<Student> students = new ArrayList<>();
        List<Student> studentsnew = new ArrayList<>();
        Student student1 = new Student("张山",23);
        Student student2 = new Student("李四",20);
        Student student3 = new Student("王五",18);
        Student student4 = new Student("王er五",18);
        Student student5 = new Student("郑五",18);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        studentsnew.add(student4);
        studentsnew.add(student5);
        Teacher teacher = new Teacher("Matt",30,"Teacher");
        KClass myclass = new KClass(2,"二年级二班",students,teacher);
        KClass kClass = new KClass(3,"三班",studentsnew,teacher);
        student1.setkClass(myclass);
        student2.setkClass(myclass);
        student3.setkClass(myclass);
        student1.changeClass(kClass);
        //when
        List<String> messages = teacher.getMessage();
        //then
        Assert.assertEquals(messages.size(),2);
        Assert.assertEquals(messages.get(0),"My name is 张山. I am 23 years old. I am a Student of Class 2.");
        Assert.assertEquals(messages.get(1),"My name is 张山. I am 23 years old. I am a Student of Class 3.now");
    }
}
