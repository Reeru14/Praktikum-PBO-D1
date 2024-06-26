package Prak3;

import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private ArrayList<Student> studentsEnrolled;

    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<Student>();
    }

    public String getCourseCode(){
        return this.courseCode;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public Lecture getLecture(){
        return this.lecture;
    }

    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture){
        this.lecture = lecture;
    }

    public void addStudent(Student S){
        this.studentsEnrolled.add(S);
    }

    public void removeStudent(Student S){
        this.studentsEnrolled.remove(S);
    }

    public void viewEnrolledStudents(){
        System.out.println("Enrolled Students " + getCourseName() + " : ");
        for (Student s: this.studentsEnrolled){
            s.getDetails();
            System.out.println("");
        }
        System.out.println("");
    }
}
