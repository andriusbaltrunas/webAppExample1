package com.kcs.students.app;

/**
 * Created by andriusbaltrunas on 6/16/2017.
 */
public class Student {
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Student(int id, String name, String surname, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
    public Student(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
