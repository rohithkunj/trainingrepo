package MainApplication;
import StudentPackage.Student;

import java.util.Scanner;
import Utilities.Address;
import Utilities.Education;
import Utilities.Experience;

import EmployeePackage.Employee;

public class Main
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("WELCOME TO UNIVERSITY APPLICATION ");
		System.out.println();
		System.out.println("Enter your choice :");
		System.out.println("1-to ENTER OR VIEW student details :"+"\n"+
		                    "2-to ENTER OR VIEW employee details :"+"\n"+
				             "3-to CLOSE whole Application");
		
		
		int main=s.nextInt();
		switch(main)
		{
		
		case 1:
			
			  System.out.println("You choosed student :");
			 
                   int c;
					
					do{
						System.out.println("Enter Your choice for student :");
						
						System.out.println("1-To ENTER Student Whole details :"+"\n"+
								            "2-To ENTER Education details of the student"+"\n"+
						                    "3-To ENTER Address details of the Student"+"\n"+
								            "4-To VIEW Students details"+"\n"+
						                    "5-To Exit application");
						                     c=s.nextInt();
						                     
						              switch(c)
						              {
						              case 4:
						            	  int v;
						            	  do{
											System.out.println("Enter your choice :");
											System.out.println();
											System.out.println("1-To VIEW Whole details of the students"+"\n"+
											                   "2-To VIEW Education details of students"+"\n"+
													           "3-To VIEW Adrress details of students"+"\n"+
											                   "4-To EXIT Application");
											 v=s.nextInt();
											switch(v)
											{
											case 1:
												System.out.println("Students whole details :");
												System.out.println();
												Student.getStudentDetails();
												Education.getEducationDetails();
												Address.getAddressDetails();
											break;
											case 2:
												System.out.println("Students education details :");
												System.out.println();
												Education.getEducationDetails();
												break;
											case 3:
												System.out.println("Students Address Details :");
												System.out.println();
												Address.getAddressDetails();
												break;
											case 4:
												System.out.println("Application closed");
												System.exit(v);
											
											}
						            	  }
						            	  while(v!=4);
						              
						              case 5:
						            	  System.out.println("Application CLOSED");
						            	  System.exit(c);
						            	  
						            	  
						              }
						    
						             

						   System.out.println("Enter number of students :");
							int no=s.nextInt();
							for(int i=1;i<=no;i++)
							{   
					
					switch(c)
					{
					case 1:
						System.out.println("Enter student "+i+" details :");
						System.out.println();
						Student.setStudentDetails();
						Education.setEducationDetails();
						Address.setAddress();
						break;
					case 2:
						System.out.println("Enter student "+i+" Education details :");
						System.out.println();
						Education.setEducationDetails();
						break;
					case 3:
						System.out.println("Enter student "+i+" Address details :");
						System.out.println();
						Address.setAddress();
						break;
					
					}
					}
				}
					while(c!=4);
			
			
			// end of student menu 
	   break;
	   
	   //Employee menu starts
		case 2:
			 System.out.println("You choosed Employee :");
			 
             int em;
				
				do{
					System.out.println("Enter Your choice for Employee :");
					
					System.out.println("1-To ENTER EMPLOYEE Whole details :"+"\n"+
							            "2-To ENTER Education details of the EMPLOYEE"+"\n"+
					                    "3-To ENTER Address details of the EMPLOYEE"+"\n"+
							            "4-To ENTER Experience details "+"\n"+
							            "5-To VIEW EMPLOYEE details"+"\n"+
					                    "6-To Exit application");
					                     em=s.nextInt();
					                     
					              switch(em)//employee switch
					              {
					              case 5:
					            	  int v2;
					            	  do{
					            		System.out.println("You choosed view To VIEW employee details :");
										System.out.println("Enter your choice :");
										System.out.println();
										System.out.println("1-To VIEW Whole details of the EMPLOYEES"+"\n"+
										                   "2-To VIEW Education details of EMPLOYEES"+"\n"+
												           "3-To VIEW Adrress details of EMPLOYEES"+"\n"+
										                   "4-TO VIEW Experience details of EMPLOYEES"+"\n"+
										                   "5-To EXIT Application");
										 v2=s.nextInt();
										switch(v2) //view switch
										{
										case 1:
											System.out.println("EMPLOYEES whole details :");
											System.out.println();
											Employee. getEmployeeDetails();
											Education.getEducationDetails();
											Address.getAddressDetails();
											Experience.getExperienceDetails();
										break;
										case 2:
											System.out.println("EMPLOYEE education details :");
											System.out.println();
											Education.getEducationDetails();
											break;
										case 3:
											System.out.println("EMPLOYEE Address Details :");
											System.out.println();
											Address.getAddressDetails();
											break;
										case 4:
											System.out.println("EMPLOYEE experience details :");
											System.out.println();
											Experience.getExperienceDetails();
											break;
										case 5:
											System.out.println("Application closed");
											System.exit(v2);
										default :
											System.out.println("Invalid choice");
											break;
										} //end of view switch
					            	  }
					            	  while(v2!=5);
					              
					              case 6:
					            	  System.out.println("Application CLOSED");
					            	  System.exit(em);
					              }
					    
					             

					   System.out.println("Enter number of EMPLOYEE :");
						int no=s.nextInt();
						for(int i=1;i<=no;i++)
						{   
				
				switch(em) //enter switch
				{
				case 1:
					System.out.println("Enter EMPLOYEE "+i+" whole details :");
					System.out.println();
					Employee.setEmployeeDetails();
					Education.setEducationDetails();
					Address.setAddress();
					break;
				case 2:
					System.out.println("Enter EMPLOYEE "+i+" Education details :");
					System.out.println();
					Education.setEducationDetails();
					break;
				case 3:
					System.out.println("Enter EMPLOYEE "+i+" Address details :");
					System.out.println();
					Address.setAddress();
					break;
				case 4:
					System.out.println("Enter EMPLOYEE "+i+" experience details :");
					System.out.println();
					Experience.setExperienceDetails();
					break;
				default :
					System.out.println("Invalid choice");
					break;
				
				} //end of enter switch
				}
			}
				while(em!=4);
			
		case  3:
			System.out.println("---WHOLE application close---");
			System.exit(main);
	   default:
		   System.out.println("Entered invalid choice :");
		break;
		}
		

	}

}
