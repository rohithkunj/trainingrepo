package EmployeePackage;
import java.util.*;
import Utilities.*;
public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private String department;
	private String doj;
	private String dob;
	private String role;
	
	Address empAddress=new Address();
    Experience empExperience=new Experience();
	Education empEducation=new Education();
	
public Education getEmpEducation() 
{
		return empEducation;
	}
	public void setEmpEducation(Education empEducation) 
	{
		this.empEducation = empEducation;
	}
public Experience getEmpExperience() 
{
		return empExperience;
	}
	public void setEmpExperience(Experience empExperience)
	{
		this.empExperience = empExperience;
	}
public Address getEmpAddress() 
{
		return empAddress;
}
public void setEmpAddress(Address empAddress) 
	{
		this.empAddress = empAddress;
	}
public int getId()
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public double getSalary() 
{
	return salary;
}
public void setSalary(double salary)
{
	this.salary = salary;
}
public String getDepartment() 
{
	return department;
}
public void setDepartment(String department) 
{
	this.department = department;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) 
{
	this.doj = doj;
}
public String getDob()
{
	return dob;
}
public void setDob(String dob) 
{
	this.dob = dob;
}
public String getRole()
{
	return role;
}
public void setRole(String role)
{
	this.role = role;
}

public void setEmployeeDetails()
{

	 Scanner s=new Scanner(System.in);
	 Scanner sc=new Scanner(System.in);
	 try {
	 System.out.println("Enter employee id :");
	  int id=s.nextInt();
	System.out.println("Enter Employee Name :");    
	String name=sc.nextLine();
	System.out.println("Enter salary :");
	double salary=s.nextDouble();
	System.out.println("Eneter department :");	
	    String department=sc.nextLine();
	    System.out.println("enter date of join :");
		String doj=sc.nextLine();
		System.out.println("enetr date of birth :");
		String dob=sc.nextLine();
		System.out.println("Enter role :");
		String role=sc.nextLine();
		
	   setId(id);
	   setName(name);
	   setSalary(salary);
	   setDepartment(department);
	   setDoj(doj);
	   setDob(dob);
	   setRole(role);
	   
	  System.out.println("Enter Employee Education details :");
	  empEducation.setEducation();
	  
	  System.out.println("Enter Employee Address details :");
	  empAddress.setAddress();
	 
	  System.out.println("Enter Employee Experience details :");
	  empExperience.setExperience();
	 }
		catch( Exception e) {
			System.out.println(e);
		}
	  
}

 public void getEmlpoyeeDetails()
 { 
	 
	 System.out.println("employee ID :"+this.id);
	 System.out.println("employee NAME :"+this.name);
	 System.out.println("employee SALARY :"+this.salary);
	 System.out.println("Employee DEPARTMENT :"+this.department);
	 System.out.println("employee DOj :"+this.doj);
	 System.out.println("employee DOB :"+this.dob);
	 System.out.println("employee ROLE :"+this.role);
	 
	 System.out.println("Employee Education details :");
	 empEducation.getEducation();
	 
     System.out.println("Employee Address Details :");
     empAddress.getAddress();
     
     System.out.println();
     
     System.out.println("Employee experience Details :");
     empExperience.getExperience();
     
	 
 }
 
}
