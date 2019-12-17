package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class Connect {
 
	    /**
	     * Connect to the test.db database
	     * @return the Connection object
	     */
	    public static Connection connect() {
	        // SQLite connection string
	        String url = "jdbc:sqlite:ExampleTest.db";
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        return conn;
	    }	    
}
