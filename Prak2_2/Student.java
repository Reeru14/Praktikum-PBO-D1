package Prak3;

import java.util.ArrayList;

class Student{
    private String name;
    private int age;
    private String address;
    private int studentID;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<Course>();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }

    public int getStudentID(){
        return this.studentID;
    }
    
    public void getDetails(){
        System.out.println("Name\t\t: " + getName());
        System.out.println("Age\t\t: " + getAge());
        System.out.println("Address\t\t: " + getAddress());
        System.out.println("Student ID\t: " + getStudentID());
        System.out.println("");
    }

    public void enrollCourse(Course C){
        this.coursesEnrolled.add(C);
        C.addStudent(this);
    }
    
    public void viewEnrolledCourse(){
        System.out.println("Course Enrolled " + getName() + ": ");
        for (Course c: this.coursesEnrolled){
            System.out.println("- " + c.getCourseName());
        }System.out.println("");
    }
}