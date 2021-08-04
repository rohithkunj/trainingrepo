package Utilities;
import connection.*;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Address
{
	 private static int AddressId;
	 private String houseno;
	 private String street;
	 private String localty;
	 private String city;
	 private String state;
	 private String country;
	 private int zip;
	 
	
	 public static void setAddress()
	 {
		 System.out.println("Enter Address Details :");
			Scanner st=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
		 
		try
		{
			CommonConnection.loadJdbcDriver();
			CommonConnection.createConnection();
			
		PreparedStatement pst=CommonConnection.connection.prepareStatement("insert into addressdetails values(?,?,?,?,?,?,?,?);");	
			
		try
		{
		System.out.println("Enter Address Id :");
		int addressId=s.nextInt();
		pst.setInt(1,addressId);
		}
		catch(InputMismatchException i)
		{
			System.out.println(i);
		}
		System.out.println("enter house no :");
		pst.setString(2,st.nextLine());
		
		System.out.println("enter street :");

		pst.setString(3,st.nextLine());
		
		System.out.println("enter localty :");
		
		pst.setString(4,st.nextLine());
		
		System.out.println("enter city :");
		
		pst.setString(5,st.nextLine());
		
		System.out.println("enter state :");
		
		pst.setString(6,st.nextLine());
		
		System.out.println("enter country :");
		
		pst.setString(7,st.nextLine());
		
		try
		{
		System.out.println("enter zip code :");
		int z=s.nextInt();
		pst.setInt(8,z);
       
		}
		catch(InputMismatchException nf)
		{
			System.out.println("Enter valid input"+nf);
		}
		
	    int n=pst.executeUpdate();
		
		
		if(n==0)
		{
			System.out.println( "zero records inserted into student's Address Details");
		}
		else
		{
			System.out.println(n+" Address records have been inserted");
		}
			
		CommonConnection.connection.close();
		}
		 
		catch (ClassNotFoundException cl)
		{
			System.out.println(cl);
		}
		 catch(SQLException sl)
		{
			 System.out.println(sl);
		}
		
	 }
	 
	 public static void getAddressDetails()
		{
			try
			{
				CommonConnection.loadJdbcDriver();
				CommonConnection.createConnection();
			
				Statement st=CommonConnection.connection.createStatement();//prepareStatement("insert into studentdetails values(?,?,?,?,?,?);");
				ResultSet resultset =st.executeQuery("select * from addressdetails;");
			
				
				
				
				
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
		 //setAddress();
		 getAddressDetails();
	 }
	
}
