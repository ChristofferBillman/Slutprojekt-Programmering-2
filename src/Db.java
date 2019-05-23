import java.sql.*;

public class Db {

    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static final String DEFAULT_URL = "jdbc:mysql://"+ Secret.hostname +":" + Secret.port + "/" + Secret.dbName;

    private static Connection connection;

    /**
     * Constructor for db class.
     */
    public Db() {
        try {
            Class.forName(DEFAULT_DRIVER_CLASS);
            connection = DriverManager.getConnection(DEFAULT_URL, Secret.DEFAULT_USERNAME, Secret.DEFAULT_PASSWORD);
        } catch(Exception e ) {
            System.out.println(e);
        }
    }

    /**
     *
     * @param values String with values to insert into db. must follow form: ('value1, value2, value3...')
     * @param columns String with colums which to insert values into db. must follow form: ('column1, column2, column3...')
     * @param table String of which table to insert values into.
     */
    // Create method.
    public void insert(String values, String columns, String table) {
        try {
            PreparedStatement ps;
            ResultSet rs;
            ps = connection.prepareStatement("INSERT INTO " + table + " (" + columns + ") " + "VALUES (" + values + ")"); // Insert create statement
            ps.executeUpdate();

            System.out.println("Sucessfully inserted values " + values + " into columns " + columns + " in table " + table);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     *
     * @param attrbt String of columns to read from.
     * @param table String with table to read from.
     * @return Returns requested rows.
     */
    // Read method.
    public String read(String attrbt, String table) {
        User user = null;
        ResultSet rs = null;
        String username = "empty";

        try {
            PreparedStatement ps;
            ps = connection.prepareStatement("SELECT " + attrbt + " FROM " + table);
            rs = ps.executeQuery();

            while (rs.next()) {
                username = rs.getString("username");
                //user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
                //System.out.println(rs.getString("username");
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return username;
    }

    /**
     *
     * @param attrbt
     * @param table
     * @return
     */
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

    /**
     *
     * @param attrbt
     * @param table
     */

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
