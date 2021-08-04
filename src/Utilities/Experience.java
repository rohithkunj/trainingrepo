package Utilities;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.*;
import connection.*;

public class Experience 
{
	     String organisationName;
		 String designation;
		 int exp;
		
public static void setExperienceDetails()
{
	System.out.println("Enter Experience details :");
	Scanner s=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	
	
	try
	{
		   CommonConnection.loadJdbcDriver();
		   CommonConnection.createConnection();
		   
		   PreparedStatement ps=CommonConnection.connection.prepareStatement("insert into experiencedetails values(?,?,?,?);");
		   try
		   {
			   
		   
		   System.out.println("Enter experience id :");
		   int experienceId=s.nextInt();
		   ps.setInt(1,experienceId);
		   }
		   catch(InputMismatchException o)
		   {
			  System.out.println(o); 
		   }
		   System.out.println("Enter Organisation Name :");
		   ps.setString(2,sc.nextLine());
		   
		   System.out.println("Enter Designation :");
		   ps.setString(3,sc.nextLine());
		   
		   System.out.println("Enter experience :");
		   ps.setString(4, sc.nextLine());
		   
		   int num=ps.executeUpdate();
		   
		   if(num==0)
		   {
			   System.out.println("Zero rows uptaded :");
		   }
		   else
		   {
			   System.out.println(num+" Experience details updated");
		   }
			  
		   
		   
	 CommonConnection.connection.close();   
		   
	}
	catch(ClassNotFoundException x)
	{
		System.out.println(x);
	}
	catch(SQLException q)
	{
		System.out.println(q);
	}
	finally
	{
		System.out.println("Connection closed");
	}

	

}
 public static void getExperienceDetails()
{
	try
	{
		CommonConnection.loadJdbcDriver();
		CommonConnection.createConnection();
	
		Statement st=CommonConnection.connection.createStatement();//prepareStatement("insert into studentdetails values(?,?,?,?,?,?);");
		ResultSet resultset =st.executeQuery("select * from experiencedetails;");
	
		
		
		
		
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



public static void main(String args[])
{
	getExperienceDetails();
}

}
