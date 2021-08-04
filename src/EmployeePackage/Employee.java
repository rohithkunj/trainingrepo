package EmployeePackage;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import connection.*;
import Utilities.Address;

public class Employee
{
	private int id;
	private String name;
	private double salary;
	private String department;
	private String doj;
	private String dob;
	private String role;
	
	public static void setEmployeeDetails()
	{

		 Scanner s=new Scanner(System.in);
		 Scanner sc=new Scanner(System.in);
		
		try
		{
			CommonConnection.loadJdbcDriver();
			CommonConnection.createConnection();
			//creating a preparedStatement
			PreparedStatement pst=CommonConnection.connection.prepareStatement("insert into employeedetails values(?,?,?,?,?,?,?,?,?,?);");
			
			
			//employee id
			try{
				 System.out.println("Enter employee id :");
				  int id=s.nextInt();
				  //index from 1
				  pst.setInt(1, id);
				 }
				 catch(InputMismatchException e)
				 {
					System.out.println("Enter valid input :"+e); 
				 }
			 
			//employee name
			System.out.println("Enter Employee Name :");    
			String name=sc.nextLine();
			pst.setString(2,name);
			
			//department 
			System.out.println("Enter department :");	
			    String department=sc.nextLine();
			     pst.setString(4,department);
			     
			     //role
			        System.out.println("Enter role :");
					String role=sc.nextLine();
					pst.setString(7,role);
			     
			   //employee salary
					try{
						System.out.println("Enter salary :");
						double salary=s.nextDouble();
						pst.setDouble(3,salary);
						}
						catch(InputMismatchException en)
						{
							System.out.println("Enter valid input :"+en);
						}
			     
			  //date of join
			     System.out.println("enter date of join :");
					String doj=sc.nextLine();  
					pst.setString(5,doj);
			//date of birth 

					System.out.println("enetr date of birth :");
					String dob=sc.nextLine();
			        pst.setString(6, dob);
			
			
				//address id
					System.out.println("Enter Address id");
					pst.setInt(8,s.nextInt());
					
			   //education id
					System.out.println("Enter education id :");
					pst.setInt(10,s.nextInt());
				
				// experience id
					System.out.println("Enter experience id :");
					pst.setInt(9, s.nextInt());
				
			int n=pst.executeUpdate();
			
			
			if(n==0)
			{
				System.out.println( "No record have been inserted");
			}
			else
			{
				System.out.println(n+" record have been inserted");
			}
			
			
			CommonConnection.connection.close();
					
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println(ce);
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
	
	}
	 public static void getEmployeeDetails()
	{
		try
		{
			CommonConnection.loadJdbcDriver();
			CommonConnection.createConnection();
		
			Statement st=CommonConnection.connection.createStatement();//prepareStatement("insert into studentdetails values(?,?,?,?,?,?);");
			ResultSet resultset =st.executeQuery("select * from employeedetails;");
		
			
			
			
			
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
       //int n= st.getUpdateCount();
      // System.out.println(n);
      
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
		//setEmployeeDetails();
		getEmployeeDetails();
	}
	
}
