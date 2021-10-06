import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class DoctorOperations implements DoctorInfo 
{
Doctor d;
File file=new File("Doctor Recordings.txt");
FileWriter writer=null;
FileReader read=null;

public void insertDoctor(Doctor d) 
{ 
	this.d=d;
	try {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter name:");
	String n=input.next();
	d.setName(n);
	System.out.println("Enter Id:");
	String id=input.next();
	d.setId(id);
	System.out.println("Enter Specialization:");
	String spec=input.next();
	d.setQualification(spec);
	System.out.println("Enter Work Time:");
	String time=input.next();
	d.setSpecial(time);
	System.out.println("Enter Qualifications:");
	String qua=input.next();
	d.setWorkTime(qua);
	System.out.println("Enter Room No.:");
	String room=input.next();
	d.setRoomNo(room);
	
	System.out.println(" Your Given Informations are:");
	System.out.println("===Name:"+d.getName());
	System.out.println("===ID  :"+d.getId());
	System.out.println("===Qualification:"+d.getQualification());
	System.out.println("===Specialization:"+d.getSpecial());
	System.out.println("===Work Time:"+d.getWorkTime());
	System.out.println("===Room No:"+d.getRoomNo());
	
	System.out.println("Are the the informations correct?('y' for yes/'n' for no)");
	char c=input.next().charAt(0);
	if(c=='y') {

		writer=new FileWriter(file,true);
		writer.write("*************************");
		writer.write("\n");
		writer.write("Name: "+d.getName()+"\r"+"\n");
		writer.write("ID: "+d.getId()+"\r"+"\n");
		writer.write("Qualification: "+d.getQualification()+"\r"+"\n");
		writer.write("Specialization: "+d.getSpecial()+"\r"+"\n");
		writer.write("Work Time: "+d.getWorkTime()+"\r"+"\n");
		writer.write("Room No: "+d.getRoomNo()+"\r"+"\n");
		writer.write("*************************");
		writer.write("\n");
		
		System.out.println(",<<<<<<<<<<All the informations have been Recorded Succesfully>>>>>>>>>>>>>");
		writer.flush();
	}
	else {
		System.out.println("==========[]Please Enter the Informations again[]============>");
	}
	

}
catch(Exception e) 
{
	System.out.println(e);
	System.out.println("Exception Created!");
}
	finally 
	{
		try 
		{
			writer.close();
		}

		catch(Exception e) 
		{
			
		}
		
	}
	
}
public void showAllDoctor(Doctor d) 
{
	this.d=d;
	try {
		read=new FileReader(file);
		BufferedReader buff=new BufferedReader(read);
		String x="";
		String temp;
		while((temp=buff.readLine())!=null) 
		{
			x=x+temp+"\n"+"\r";
		}
		System.out.println(x);
		read.close();
	}
	catch(Exception e) 
	{
		System.out.println(e);
		System.out.println("Exception Created!");
		e.printStackTrace();
	}
	
}
public void deleteDoctor(Doctor d) 
{
	this.d=d;
	Scanner input=new Scanner(System.in);
	boolean isFound=false;
	String temp=null;
	int count=0;
	int linestodelete=4;
	String inp="";
	System.out.println("Enter the Doctor's ID to delete:!!");
	String id=input.next();
	d.setId(id);
	try 
	{
		read=new FileReader(file);
		BufferedReader bfr2=new BufferedReader(read);
		while((temp=bfr2.readLine())!=null) 
		{
			if(temp.contains(d.getId())) 
			{
				isFound=true;
				temp=null;
				count++;
				continue;
			}
			else if(isFound && count<linestodelete) 
			{
				count++;
				temp=null;
			}
			else if(isFound && count==linestodelete) 
			{
				temp=null;
				isFound=false;
			}
			else 
			{
				inp += temp +'\n'; 
			}	
		}
		writer=new FileWriter(file);
		writer.write(inp);
		System.out.println("Doctors identity Succesfully Deleted");
	}
	catch(Exception e) 
	{
		System.out.println(e);
		System.out.println("Exception Created!");
		e.printStackTrace();
	}
	finally 
	{
		try 
		{
			writer.close();
			read.close();
		}
		catch(Exception io) 
		{
			System.out.println("Can not close the resource!!");
		}
	}
}
}