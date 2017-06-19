package com.kcs.students.app;

/**
 * Created by andriusbaltrunas on 6/19/2017.
 */
public class StudentAddress {
    private int id;
    private int studentId;
    private String country;
    private String city;
    private String street;
    private String postCode;

    public StudentAddress(int id, int studentId, String country, String city, String street, String postCode) {
        this.id = id;
        this.studentId = studentId;
        this.country = country;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostCode() {
        return postCode;
    }
}
