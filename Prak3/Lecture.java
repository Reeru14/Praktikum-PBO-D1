package Prak3;

import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private ArrayList<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<Course>();
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

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
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

    public int getEmployeeID(){
        return this.employeeID;
    }

    public void getDetails(){
        System.out.println("Name\t\t: " + getName());
        System.out.println("Age\t\t: " + getAge());
        System.out.println("Address\t\t: " + getAddress());
        System.out.println("Employee ID\t: " + getEmployeeID());
    }

    public void teachCourse(Course C){
        this.coursesTaught.add(C);
        C.setLecture(this);
    }

    public void viewTaughtCourses(){
        System.out.println(getName() + ", Taught Courses : ");
        for (Course c: this.coursesTaught){
            System.out.println("- " + c.getCourseName());
        }
        System.out.println("");
    }
}
