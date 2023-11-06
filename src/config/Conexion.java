package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://ec2-18-205-44-21.compute-1.amazonaws.com:5432/d3873ku87gl6fs?currentSchema=PI2", "yeafisgfigvvac", "4e04fd077af6c99207fbfc9d616444298307a8b4c164a76d582bc27d910ea8cc");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("No se pudo establecer conexión con la BD. Error: " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}


