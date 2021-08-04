package StudentPackage;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import connection.*;
import Utilities.*;

public class Student 
{
		public static Connection con=CommonConnection.connection;
		public static PreparedStatement pst;
		public static ResultSet resultset;
	
	public static void setStudentDetails()
	{
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
	
	try
	{
		CommonConnection.loadJdbcDriver();
		CommonConnection.createConnection();
	
		pst=CommonConnection.connection.prepareStatement("insert into studentdetails values(?,?,?,?,?,?);");
		resultset =pst.executeQuery("select * from studentdetails;");
	
	try
	{	
	//student roll number	
	System.out.println("enter student id number :");
   
    pst.setInt(1,s.nextInt());
	}
	catch(InputMismatchException ef)
	{
		System.out.println("Enter valid input :"+ef);
	}
	//student name
    System.out.println("enter Student name :");
	
	pst.setString(2,sc.nextLine());
	
	
	//student college
	System.out.println("enter student College name :");
	
	pst.setString(3,sc.nextLine());
	
	//student date of birth
		System.out.println("enter student date of birth :");
	
		pst.setString(4,sc.nextLine());
	//education id
		System.out.println("enter education id :");
		pst.setInt(5,s.nextInt());
   //address id
		System.out.println("enter Address id");
		pst.setInt(6,s.nextInt());
	
		
          int n=pst.executeUpdate();
		
		if(n==0)
		{
			System.out.println("zero records updated");
		}
		else
		{
			System.out.println(n+" Records have been updated");
		}
	
	
    //CommonConnection.connection.close();
	//con.close();
	}
	
	 catch(ClassNotFoundException e)
		{
		 System.out.println(e);
		}
	 
	catch(SQLException h)
		{
		System.out.println(h);
		} 
	/*catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}*/
	 
	}
	
	public static void getStudentDetails()
	{
		try
		{
			CommonConnection.loadJdbcDriver();
			CommonConnection.createConnection();
		
			Statement st=CommonConnection.connection.createStatement();//prepareStatement("insert into studentdetails values(?,?,?,?,?,?);");
			resultset =st.executeQuery("select * from studentdetails;");
		
			
			
			
			
        ResultSetMetaData resultSetMetaData = resultset.getMetaData();

        int columnCount = resultSetMetaData.getColumnCount();

        // Print column info
        for (int i = 1; i <= columnCount; i++) 
        {
            System.out.print(resultSetMetaData.getColumnName(i) + "    ");
        }

        System.out.println();

        // Print row info
        while (resultset.next())
        {
            for (int i = 1; i <= columnCount; i++) 
            {
                System.out.print(resultset.getString(i) + "   ");
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
		
		//setStudentDetails();
		getStudentDetails();
		
	}
	
	} //end of student class 
	
	

	
	
	
	


