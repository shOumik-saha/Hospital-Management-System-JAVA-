import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class PatientOperations implements PatientInfo 
{
Patient p;
File file=new File("Patient Recordings.txt");
FileWriter writer=null;
FileReader read=null;
	public void insertPatient(Patient p) {
	this.p=p;
	Scanner input=new Scanner(System.in);
	try{
		System.out.println("Enter Name:");
		String n=input.next();
		p.setName(n);
		System.out.println("Enter  Id:");
		String id=input.next();
		p.setid(id);
		System.out.println("Enter Diseases:");
		String dis=input.next();
		p.setDiseases(dis);
		System.out.println("Enter Gender:");
		String gen=input.next();
		p.setGender(gen);
		
		System.out.println("Enter Admit Status:");
		String st=input.next();
		p.setStatus(st);
		System.out.println("Enter Age:");
		String ag=input.next();
		p.setAge(ag);
		
		
		System.out.println("Given Informations are:");
		System.out.println("===Name:"+p.getName());
		System.out.println("===id:"+p.getid());
		System.out.println("===Diseases:"+p.getDiseases());
		System.out.println("===Gender:"+p.getGender());
		System.out.println("===Admit Status:"+p.getStatus());
		System.out.println("===Age:"+p.getAge());
		System.out.println("Are all the informations correct?('y' for yes/'n' for no)");
		char ch=input.next().charAt(0);
		if(ch=='y') {
			
			writer=new FileWriter(file,true);
			writer.write("*************************");
			writer.write("Name :"+p.getid()+"\r"+"\n");
			writer.write("id :"+p.getName()+"\r"+"\n");	
			writer.write("Diseases :"+p.getDiseases()+"\r"+"\n");
			writer.write("Gender:"+p.getGender()+"\r"+"\n");
			writer.write("Admit Status: "+p.getStatus()+"\r"+"\n");
			writer.write("Age: "+p.getAge()+"\r"+"\n");
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
	public void showAllPatient(Patient p) {
		this.p=p;
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
	public void deletePatient(Patient p) 
	{
		this.p=p;
		Scanner input=new Scanner(System.in);
		boolean isFound=false;
		String temp=null;
		int count=0;
		int linestodelete=4;
		String inp="";
		System.out.println("Enter the Patient id to delete all the informations:");
		String pi=input.next();
		p.setid(pi);
		try {
			read=new FileReader(file);
			BufferedReader bfr2=new BufferedReader(read);
			while((temp=bfr2.readLine())!=null) {
				if(temp.contains(p.getid())) {
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
			System.out.println("Patient succesfully deleted!!!");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception Created!");
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
				read.close();
			}
			catch(Exception io) {
				System.out.println("Can not close the resource!!");
			}
		}
		
	}
}