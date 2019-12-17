package tools;

import general.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
	 /**
     * select all rows in the table
     */
    public static void selectAll(){
        String sql = "SELECT id, name, grade, school, age FROM class";
        
        try (Connection conn = Connect.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("name") + "\t" +
                                   rs.getInt("age") + "\t" +
                                   rs.getString("school") + "\t" +
                                   rs.getInt("grade"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
