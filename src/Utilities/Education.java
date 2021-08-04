package Utilities;
import connection.*;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Education
{  
	private int roll;
	private String courseTitle;
	private String university;
	private String place;
	private  int yearOfpassing;
	private double marksSecured;
	private double marksInMaths;
	private double marksInChemistry;
	private double marksInPhysics;
	
   public static void setEducationDetails()
   {
	   
	   try
	   {
		   System.out.println("Please enter Education details");
		    Scanner s=new Scanner(System.in);
			Scanner sc=new Scanner(System.in);
		
			CommonConnection.loadJdbcDriver();
			CommonConnection.createConnection();
		   
		   PreparedStatement ps=CommonConnection.connection.prepareStatement("insert into educationdetails values(?,?,?,?,?,?);");
		   
		   try
		   {
		  System.out.println("Education id :");
		  int educationId=s.nextInt();
		  ps.setInt(1,educationId);
		   }
		   catch(InputMismatchException e)
		   {
			   System.out.println(e);
		   }
		 
		 System.out.println("enter course :");
		ps.setString(2,sc.nextLine());
		
		
		System.out.println("enter university :");
		
		ps.setString(3,sc.nextLine());
		
		System.out.println("enter place :");
		
		ps.setString(4,sc.nextLine());
		
		try{
		System.out.println("enter year of passing :");
		
		ps.setInt(5,s.nextInt());
		
		}
		catch(InputMismatchException ip)
		{
			System.out.println("Enter valid input "+ip);
		}
			
		try{
		System.out.println("enter marks percentage scored :");
		
		ps.setDouble(6,s.nextDouble());
		
		}
		
		catch(InputMismatchException in)
		{
			System.out.println("Enter valid input "+in);
		}
		
		int n=ps.executeUpdate();
		
		if(n==0)
		{
			System.out.println("zero records updated into students education details");
		}
		else
		{
			System.out.println(n+" record have been updated into students eductaion details");
		} 
		   
		CommonConnection.connection.close();  
		   
	   }
	   catch(ClassNotFoundException cn)
	   {
		   System.out.println(cn);  
	   }
	   catch(SQLException sq)
	   {
		   System.out.println(sq);
	   }
	
   }
   

	
   public static void main(String args[])
   {
	   setEducationDetails();
	   getEducationDetails();
   }

 public static void getEducationDetails() {
	{
		try
		{
			CommonConnection.loadJdbcDriver();
			CommonConnection.createConnection();
		
			Statement st=CommonConnection.connection.createStatement();//prepareStatement("insert into studentdetails values(?,?,?,?,?,?);");
			ResultSet resultset =st.executeQuery("select * from educationdetails;");
		
			
			
			
			
       ResultSetMetaData resultSetMetaData = resultset.getMetaData();

       int columnCount = resultSetMetaData.getColumnCount();

       // Print column info
       for (int i = 1; i <= columnCount; i++) 
       {
           System.out.print(resultSetMetaData.getColumnName(i) + " ");
       }

       System.out.println();

       // Print row info
       while (resultset.next())
       {
           for (int i = 1; i <= columnCount; i++) 
           {
               System.out.print(resultset.getString(i) + " ");
           }

           System.out.println();
 
       }
     
     
      CommonConnection.connection.close();
      
		}
		catch(SQLException s)
		{
			System.out.println(s);
		} 
		catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
	}  //end of resultset method
	
}

}
