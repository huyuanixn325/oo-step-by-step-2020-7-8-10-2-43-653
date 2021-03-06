package com.thoughtworks.basic;

public class Student extends Person{
    private KClass kClass;
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, KClass kClass) {
        super(name, age);
        this.kClass = kClass;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student of Class "+this.kClass.getClassNumber()+".";
    }

    public KClass getkClass() {
        return kClass;
    }

    public void setkClass(KClass kClass) {
        this.kClass = kClass;
    }

    public void changeName(String newName){
        super.setName(newName);
        sendMessageToTehcherAndOtherStudents(this.introduce());
    }

    public void changeClass(KClass kClass){
        sendMessageToTehcherAndOtherStudents(this.introduce());
        this.kClass.deleteStudent(new Student(this.getName(),this.getAge()));
        kClass.addStudent(this);
        this.setkClass(kClass);
        sendMessageToTehcherAndOtherStudents(this.introduce()+"now");
    }

    public void sendMessageToTehcherAndOtherStudents(String message){
        if (this.kClass.getTeacher()!=null){
            this.kClass.getTeacher().addMessage(message);
        }
        if (this.kClass.getStudents().size()>1){
            for (Student student:this.kClass.getStudents()){
                if (student.getName()==this.getName()&&student.getAge()==this.getAge()){
                    continue;
                }else {
                    student.addMessage(message);
                }
            }
        }
    }

}
