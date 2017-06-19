package com.kcs.students.app.utils;

import com.sun.istack.internal.Nullable;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by andriusbaltrunas on 6/16/2017.
 */
public class JdbcUtils {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";
    private static final String NAME = "root";
    private static final String PASS = "MySQL";

    @Nullable
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, NAME, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
