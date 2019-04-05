import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db {

    // Setup
    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static final String DEFAULT_URL = "jdbc:mysql://"+ Secret.hostname +":"+Secret.port+"/"+Secret.dbName;

    Connection connection;

    // Create method.
    public void create() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement(""); // Insert create statement
            rs = ps.executeQuery();

            while (rs.next()) {
                String firstName = rs.getString("Fname");
                String address = rs.getString("Address");
                System.out.println(firstName + " , " + address);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // Read method.
    public User read(String attrbt, String table) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement("SELECT " + attrbt + " FROM " + table);
            rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
                return user;
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // Update method.
    public User update(String attrbt, String table) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement("SELECT " + attrbt + " FROM " + table); // Insert update statement
            rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
                return user;
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // Delete method.
    public void delete(String attrbt, String table) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement(""); // Insert delete statement
            rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    db() {
    }
}