package connection;



import java.sql.*;


public class CommonConnection 
{
	    public static Connection connection;
	    
	    // load Driver
		public static void loadJdbcDriver() throws ClassNotFoundException 
		{
	        
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	    }

	    //creating connection
	   public static void createConnection() throws SQLException 
	    {
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
	    }

	 
	
}
