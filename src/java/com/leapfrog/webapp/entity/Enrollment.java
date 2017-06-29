/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webapp.entity;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Enrollment {

    private int id;
    private Course course;
    private Student student;
    private Date enrollDate;

    private boolean status;

    public Enrollment() {
    }

    public Enrollment(int id, Course course, Student student, boolean status) {
        this.id = id;
        this.course = course;
        this.student = student;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getAddedDate() {
        return enrollDate;
    }

    public void setAddedDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
