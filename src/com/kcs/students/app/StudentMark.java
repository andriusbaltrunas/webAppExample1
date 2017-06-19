package com.kcs.students.app;

import java.util.Date;

/**
 * Created by andriusbaltrunas on 6/19/2017.
 */
public class StudentMark {
    private int id;
    private int studentId;
    private String title;
    private int mark;
    private Date date;

    public StudentMark(int id, int studentId, String title, int mark, Date date) {
        this.id = id;
        this.studentId = studentId;
        this.title = title;
        this.mark = mark;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getTitle() {
        return title;
    }

    public int getMark() {
        return mark;
    }

    public Date getDate() {
        return date;
    }
}
