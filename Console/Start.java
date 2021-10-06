import java.util.Scanner;
import java.util.Calendar;

public class Start 
{

	public static void main(String[] args)  
	{
		String months[] = 
		{

            "Jan",

            "Feb",

            "Mar",

            "Apr",

            "May",

            "Jun",

            "Jul",

            "Aug",

            "Sep",

            "Oct",

            "Nov",

            "Dec"
        };

        Calendar calendar = Calendar.getInstance();

        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

        System.out.println("\n--------------------------------------------------------------------------------");

        System.out.println("            *** Welcome to Online Medical Management System Project***            ");

        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

         Scanner ip = new Scanner(System.in);
         String username;
         String password;
         int x;
    System.out.println("HOW YOU WANT TO LOG IN?");
    System.out.println("||||IF as a DOCTOR,press 1 |||||");
    System.out.println("||||IF as a PATIENT,press 2|||||");
    System.out.println("||||IF as a Visitor,press 3|||||");
    x = ip.nextInt();
    if(x== 1)
    {
    System.out.println("<========Log In As A DOCTOR========>");
    System.out.print("username: ");
    username = ip.next();

    System.out.print("password: ");
    password = ip.next();
        System.out.println("<logged in as a DOCTOR>");
    }
    else if(x== 2)
    {
    System.out.println("<========Log In As A PATIENT=======>");
    System.out.print("username: ");
    username = ip.next();

 

    System.out.print("password: ");
    password = ip.next();
            System.out.println("<logged in as a PATIENT>");
    }
	else if(x== 3)
    {
    System.out.println("<========Log In As A Visitor=======>");
    System.out.print("username: ");
    username = ip.next();

 

    System.out.print("password: ");
    password = ip.next();
            System.out.println("<logged in as a Visitor>");
    }
		else
		{
					  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<INVALID>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
		Scanner input=new Scanner(System.in);
		Doctor d=new Doctor();
        Patient p=new Patient();
        Medicines m=new Medicines();
        Laboratories l=new Laboratories();
		Facilities f= new Facilities();
        Staffs s=new Staffs();
		DoctorOperations O1 = new DoctorOperations();
		PatientOperations O2 = new PatientOperations();
		MedicinesOperations O3 = new MedicinesOperations();
		LaboratoriesOperations O4 =new LaboratoriesOperations();
		FacilitiesOperations O5 = new FacilitiesOperations();
		StaffsOperations O6 = new StaffsOperations();
        int choice;
     do 
	 {

            System.out.println("\n                                  <*_*> MAIN MENU <*_*>");

            System.out.println("-----------------------------------------------------------------------------------");

            System.out.println("1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");

            System.out.println("-----------------------------------------------------------------------------------");
        	choice=input.nextInt();
        	switch(choice) 
			{
        	case 1:
			{
				System.out.println("====================================================================================================");
				
                System.out.println(">>>>>>>>>>DOCTORS SECTION<<<<<<<<<<");
        		System.out.println("1=>Insert A Doctor entry<=");
        		System.out.println("2=>Show all Doctor entries<=");
        		System.out.println("3=>Delete A Doctor entry<=");
        		System.out.println("=>Enter your Choice:");
        		int c=input.nextInt();
        		if(c==1) 
				{
        			System.out.println("\t\t\t =>Fill all Informations perfectly<=");
        		      O1.insertDoctor(d);
        		}
        		else if(c==2) 
				{
        			System.out.println("\t\t\t =>List of Doctors<=");
        			  O1.showAllDoctor(d);
        		}
        		else if(c==3) 
				{
        			System.out.println("\t\t\t =>Enter Id to remove an entry<=");
        			O1.deleteDoctor(d);
        		}
        		else 
				{
        			System.out.println("\t\t\t\t ###Wrong Choice###");
        		}
        		break;
        	}
        	case 2:
			{
				System.out.println("==========================================================================================================");
        		System.out.println(">>>>>>>>>>PATIENTS SECTION<<<<<<<<<<");

        		System.out.println("1=>Insert A Doctor entry<=");
        		System.out.println("2=>Show all Doctor entries<=");
        		System.out.println("3=>Delete A Doctor entry<=");
        		System.out.println("=>Enter your choice:");
        		int y=input.nextInt();
        		if(y==1) 
				{
        			System.out.println("\t\t\t =>Fill all Informations perfectly<=");
        		      O2.insertPatient(p);
        		}
        		else if(y==2) 
				{
        			System.out.println("\t\t\t =>List of PATIENTS<=");
        			O2.showAllPatient(p);
        		}
        		else if(y==3) 
				{
        			System.out.println("\t\t\t =>Enter Id to remove an entry<=");
        			O2.deletePatient(p);
        		}
        		else 
				{
        			System.out.println("\t\t\t\t ###Wrong Input###");
        		}
        		 break;
        	}
			case 3:
			{
				System.out.println("==========================================================================================================");
        		System.out.println(">>>>>>>>>>MEDICINES SECTION<<<<<<<<<<");

        		System.out.println("1=>Insert A Medicine entry<=");
        		System.out.println("2=>Show all meiine entries<=");
        		System.out.println("3=>Delete A Doctor entry<=");
        		System.out.println("=>Enter your choice:");
        		int y=input.nextInt();
        		if(y==1) 
				{
        			System.out.println("\t\t\t =>Fill all Informations perfectly<=");
        		      O3.insertMedicines(m);
        		}
        		else if(y==2) 
				{
        			System.out.println("\t\t\t =>List of Medicines<=");
        			O3.showAllMedicines(m);
        		}
        		else if(y==3) 
				{
        			System.out.println("\t\t\t =>Enter Name to remove an entry<=");
        			O3.deleteMedicines(m);
        		}
        		else 
				{
        			System.out.println("\t\t\t\t ###Wrong Input###");
        		}
        		 break;
        	}
			case 4:
			{
				System.out.println("==========================================================================================================");
        		System.out.println(">>>>>>>>>>LABORATORIES SECTION<<<<<<<<<<");

        		System.out.println("1=>Insert A Lab facility entry<=");
        		System.out.println("2=>Show all Lab entries<=");
        		System.out.println("=>Enter your choice:");
        		int y=input.nextInt();
        		if(y==1) 
				{
        			System.out.println("\t\t\t =>Fill all Informations perfectly<=");
        		      O4.insertLaboratories(l);
        		}
        		else if(y==2) 
				{
        			System.out.println("\t\t\t =>List of Lab Facilities<=");
        			O4.showAllLaboratories(l);
        		}
        		else 
				{
        			System.out.println("\t\t\t\t ###Wrong Input###");
        		}
        		 break;
        	}
			case 5:
			{
				System.out.println("==========================================================================================================");
        		System.out.println(">>>>>>>>>>FACILITIES SECTION<<<<<<<<<<");

        		System.out.println("1=>Insert A Ordinal facility entry<=");
        		System.out.println("2=>Show all Facilitiy entries<=");
        		System.out.println("=>Enter your choice:");
        		int y=input.nextInt();
        		if(y==1) 
				{
        			System.out.println("\t\t\t =>Fill all Informations perfectly<=");
        		      O5.insertFacilities(f);
        		}
        		else if(y==2) 
				{
        			System.out.println("\t\t\t =>List of Facilities<=");
        			O5.showAllFacilities(f);
        		}
        		else 
				{
        			System.out.println("\t\t\t\t ###Wrong Input###");
        		}
        		 break;
        	}
			case 6:
			{
				System.out.println("==========================================================================================================");
        		System.out.println(">>>>>>>>>>STAFFS SECTION<<<<<<<<<<");

        		System.out.println("1=>Insert A Staff entry<=");
        		System.out.println("2=>Show all Staff entries<=");
        		System.out.println("3=>Delete A Staff entry<=");
        		System.out.println("=>Enter your choice:");
        		int y=input.nextInt();
        		if(y==1) 
				{
        			System.out.println("\t\t\t =>Fill all Informations perfectly<=");
        		      O6.insertStaffs(s);
        		}
        		else if(y==2) 
				{
        			System.out.println("\t\t\t =>List of Staffs<=");
        			O6.showAllStaffs(s);
        		}
        		else if(y==3) 
				{
        			System.out.println("\t\t\t =>Enter Id to remove an entry<=");
        			O6.deleteStaffs(s);
        		}
        		else 
				{
        			System.out.println("\t\t\t\t ###Wrong Input###");
        		}
        		 break;
        	}
		default:
		{
        		System.out.println("###Wrong choice###");
        		break;
        }
	 
	    }
	}
	while(choice!=7);
	{
        	System.out.println("\t\t\t\t\t\t\t (o_o) Thank You (o_o)");
    }

    }
}