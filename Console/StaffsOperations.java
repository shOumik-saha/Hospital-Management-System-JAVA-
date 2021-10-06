import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class StaffsOperations implements StaffsInfo 
{
Staffs s;
File file=new File("Staffs Recordings.txt");
FileWriter writer=null;
FileReader read=null;
	public void insertStaffs(Staffs s) {
	this.s=s;
	Scanner input=new Scanner(System.in);
	try{
		System.out.println("Enter Name:");
		String n=input.next();
		s.setName(n);
		System.out.println("Enter  Id:");
		String id=input.next();
		s.setid(id);
		System.out.println("Enter Salary:");
		String sal=input.next();
		s.setSalary(sal);
		System.out.println("Enter Gender:");
		String gen=input.next();
		s.setGender(gen);
		System.out.println("Enter Designation:");
		String des=input.next();
		s.setDesignation(des);
		
		
		System.out.println("Given Informations are:");
		System.out.println("===Name:"+s.getName());
		System.out.println("===id:"+s.getid());
		System.out.println("===Salary:"+s.getSalary());
		System.out.println("===Gender:"+s.getGender());
		System.out.println("===Designation:"+s.getDesignation());
		System.out.println("Are all the informations correct?(Y/N)('y' for yes/'n' for no)");
		char ch=input.next().charAt(0);
		if(ch=='y') 
		{
			
			writer=new FileWriter(file,true);
			writer.write("*************************");
			writer.write("Name :"+s.getid()+"\r"+"\n");
			writer.write("id :"+s.getName()+"\r"+"\n");	
			writer.write("Diseases :"+s.getSalary()+"\r"+"\n");
			writer.write("Gender:"+s.getGender()+"\r"+"\n");
			writer.write("Age: "+s.getDesignation()+"\r"+"\n");
			writer.write("*************************");
			writer.write("\n");
			System.out.println("########The informations have been succesfully recorded########");
			writer.flush();
			writer.close();
		}
		else 
		{
			System.out.println("=========[]Please,Give the Informations Again[]========");
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
		
		catch(Exception e) {
			
		}

}
	}
	public void showAllStaffs(Staffs s) {
		this.s=s;
		try {
			read=new FileReader(file);
			BufferedReader buff=new BufferedReader(read);
			String x="",temp;
			while((temp=buff.readLine())!=null) {
				x=x+temp+"\n"+"\r";
			}
			System.out.println(x);
			read.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteStaffs(Staffs s) 
	{
		this.s=s;
		Scanner input=new Scanner(System.in);
		boolean isFound=false;
		String temp=null;
		int count=0;
		int linestodelete=4;
		String inp="";
		System.out.println("Enter the Staffs id to delete all the informations:");
		String si=input.next();
		s.setid(si);
		try {
			read=new FileReader(file);
			BufferedReader bfr2=new BufferedReader(read);
			while((temp=bfr2.readLine())!=null) {
				if(temp.contains(s.getid())) {
					isFound=true;
					temp=null;
					count++;
					continue;
				}
				else if(isFound && count<linestodelete) {
					count++;
					temp=null;
				}
				else if(isFound && count==linestodelete) {
					temp=null;
					isFound=false;
				}
				else {
					inp+=temp +'\n'; 
				}
				
			}
			writer=new FileWriter(file);
			writer.write(inp);
			System.out.println("Staffs succesfully deleted!!!");
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