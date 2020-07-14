package com.thoughtworks.basic;

import java.util.List;

public class KClass {
    private int classNumber;
    private String className;
    private List<Student> students;
    private Teacher teacher;

    public KClass(int classNumber, String className, List<Student> students, Teacher teacher) {
        this.classNumber = classNumber;
        this.className = className;
        this.students = students;
        this.teacher = teacher;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        this.getStudents().add(student);
    }

    public void deleteStudent(Student student){
        for (Student student1:this.getStudents()){
            if (student.getAge()==student1.getAge()&&(student.getName().equals(student1.getName()))){
                this.getStudents().remove(student);
            }
        }
    }
}
