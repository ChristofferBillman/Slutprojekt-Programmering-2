import java.sql.*;

public class db {

    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static final String DEFAULT_URL = "jdbc:mysql://"+ Secret.hostname +":" + Secret.port + "/" + Secret.dbName;

    private static Connection connection;

    public db() {
        try {
            Class.forName(DEFAULT_DRIVER_CLASS);
            connection = DriverManager.getConnection(DEFAULT_URL, Secret.DEFAULT_USERNAME, Secret.DEFAULT_PASSWORD);
        } catch(Exception e ) {
            System.out.println(e);
        }
    }

    // Create method.
    public void insert(String values, String columns, String table) {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement("INSERT INTO " + table + " (" + columns + ") " + "VALUES (" + values + ")"); // Insert create statement
            ps.executeUpdate();

            System.out.println("Sucessfully inserted values" + values + "into columns" + columns + "in table" + table);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // Read method.
    public User read(String attrbt, String table) {
        User user = null;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement("SELECT " + attrbt + " FROM " + table);
            rs = ps.executeQuery();

            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return user;
    }

    // Update method.
    public User update(String attrbt, String table) {
        User user = null;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement("SELECT " + attrbt + " FROM " + table); // Insert update statement
            rs = ps.executeQuery();

            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return user;
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

}
