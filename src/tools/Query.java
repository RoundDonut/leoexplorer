package tools;

import general.*;
import java.math.BigDecimal;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Query {
	 /**
     * select all rows in the table
     */
    public static void selectAll()
    {
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
    
    public static void specificSelect(String filterColumn, String filterValue) 
    {
    	String sql = "SELECT id, name, grade, school, age FROM class WHERE " + filterColumn + " = " + filterValue;
    	try(Connection conn = Connect.connect();
    		Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
               
               // loop through the result set
    		while (rs.next()) 
    		{
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
    
    public static String columnList()
    {
		//ArrayList to store column names
		ArrayList<String> columnName = new ArrayList<String>();
		
    	try 
    	{
    		// Create a result set
    		Connection conn = Connect.connect();
    		Statement statement = conn.createStatement();		 
    		ResultSet results = statement.executeQuery("SELECT * FROM class");
    		 
    		 
    		// Get resultset metadata	 
    		ResultSetMetaData metadata = results.getMetaData();

    		int columnCount = metadata.getColumnCount();
    		
    		// Get the column names; column indices start from 1
    		for (int i = 1; i <= columnCount; i++) {
 
    		  columnName.add(metadata.getColumnName(i));
   
    		}
    	} 
    	catch (SQLException e) 
    	{
    		  System.out.println("Could not retrieve database metadata " + e.getMessage()); //eror message
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
		for (String s : columnName)
		{
		    sb.append(s);
		    sb.append("\n");
		}
		return sb.toString();
    }
}
