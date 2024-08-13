package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionLearn {
	//under DataBase we have table
	// Connection object
	static Connection con = null;
	// Statement object
	private static Statement stmt;
	// Constant for Database URL -> and jdbc:mysql://localhost:3306/database 
	public static String DB_URL = "jdbc:mysql://localhost:3306/emp"; 
	//Database Username
	public static String DB_USER = "root";
	// Database Password
	public static String DB_PASSWORD = "root";
	public static ResultSet res;

	
	public static void main(String[]args) throws SQLException {
		try{
			// Database connection
			String dbClass = "com.mysql.cj.jdbc.Driver";
			Class.forName(dbClass);
			// Get connection to DB
			 con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// Statement object to send the SQL statement to the Database
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			}
			catch (Exception e)
			{
			e.printStackTrace();
			}
			
	
	try{
		String query = "select * from EMPINFO where name='Rajat'";
		// Get the contents of userinfo table from DB
		
		res = stmt.executeQuery(query);
		// Print the result untill all the records are printed
		// res.next() returns true if there is any next record else returns false
		res.first();
		System.out.println(res.getString("city"));
//		while (res.next())
//		{
//			
//		System.out.print(res.getString(1));
//		System.out.print(" " + res.getString(2));
//		System.out.print(" " + res.getString(3));
//		System.out.print(" " + res.getString(4));
//		System.out.println(" " + res.getString(5));
//		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	//column count
	ResultSetMetaData resultsetmetadata=res.getMetaData();
	System.out.println(resultsetmetadata.getColumnCount());
	
	con.close();
		}
	
		
	

}
