package com.kcs.students.app.service;

import com.kcs.students.app.Student;
import com.kcs.students.app.StudentAddress;
import com.kcs.students.app.StudentDetailInfo;
import com.kcs.students.app.StudentMark;
import com.kcs.students.app.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 6/16/2017.
 */
public class StudentAdministrationService {

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        Connection connection = JdbcUtils.getConnection();

        if(connection != null){
            try {
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM STUDENTS");
                while (resultSet.next()){
                    students.add(new Student(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname"),
                            resultSet.getString("phone"), resultSet.getString("email")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

    public StudentDetailInfo getStudentDetailInfo(int studentId){
        Student student = getStudent(studentId);
        List<StudentAddress> addresses = getStudentAddress(studentId);
        List<StudentMark> studentMarks = getStudentsMarks(studentId);
        StudentDetailInfo studentDetailInfo =
                new StudentDetailInfo(student, addresses, studentMarks);
        return studentDetailInfo;
    }

    public Student getStudent(int studentId){
        Student student = new Student();
        Connection connection = JdbcUtils.getConnection();

        if(connection != null){
            try {

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENTS WHERE ID="+studentId);
                resultSet.next();
                student = new Student(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname"), resultSet.getString("phone"),
                        resultSet.getString("email"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return student;
    }

    public List<StudentMark> getStudentsMarks(int studentId){
        List<StudentMark> studentMarks = new ArrayList<>();
        Connection connection = JdbcUtils.getConnection();
        if(connection != null){
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT_MARK WHERE STUDENT_ID="+studentId);
                while (resultSet.next()){
                    studentMarks.add(new StudentMark(resultSet.getInt("id"), resultSet.getInt("student_id"),
                            resultSet.getString("title"), resultSet.getInt("mark"), resultSet.getDate("time_stamp")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return studentMarks;
    }

    public  List<StudentAddress> getStudentAddress(int studentId){
        List<StudentAddress> addresses = new ArrayList<>();
        Connection connection = JdbcUtils.getConnection();
        if(connection != null){
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT_ADDRESS WHERE STUDENT_ID="+studentId);
                while (resultSet.next()){
                    addresses.add(new StudentAddress(resultSet.getInt("id"), resultSet.getInt("student_id"), resultSet.getString("country"),
                            resultSet.getString("city"), resultSet.getString("street"), resultSet.getString("post_code")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return addresses;
    }
}
