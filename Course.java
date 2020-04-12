package com.company;

import java.util.List;

public class Course {
    List <Student> courseStudents;

    public Course(List<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public List<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(List<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public void addCourseStudent(Student newStudent){
        this.courseStudents.add(newStudent);
    }

    public void removeCourseStudent(Student student){
        this.courseStudents.remove(student);
    }
}
