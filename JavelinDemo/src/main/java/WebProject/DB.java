package WebProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB{
   public static void main(String args[]) {
      Connection c = null;
      Statement stmt = null;
      try {
         
    	  
    	  
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "Monster1");
         stmt = c.createStatement();
         
         String sql = "CREATE TABLE Persons (\r\n"
         		+ "    PersonID int,\r\n"
         		+ "    LastName varchar(255),\r\n"
         		+ "    FirstName varchar(255),\r\n"
         		+ "    Address varchar(255),\r\n"
         		+ "    City varchar(255)\r\n"
         		+ ")";
            
              
         stmt.executeUpdate(sql);
         
         
         
         stmt.close();
         c.close();
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      
      System.out.println("Opened database successfully");
      
      
   }
}