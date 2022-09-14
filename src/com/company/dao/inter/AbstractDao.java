package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public class AbstractDao {
    public Connection connect() throws Exception {
        String name = "root";
        String password = "nicat12345";
        String dbUrl = "jdbc:mysql://localhost:3306/resume";

        Connection c = DriverManager.getConnection(dbUrl, name, password);

        return c;
    }
}
