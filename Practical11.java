// Write a database application that use any JDBC driver.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Practical11 {
    public static void main(String args[])
            throws SQLException {
        String url = "jdbc:mysql://localhost:3306/retail_db?zeroDateTimeBehavior=convertToNull";       
        String username = "root";
        String password = "mohit";

        try {   
            // Class.forName("com.mysql.cj.jdbc.Driver");  
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}