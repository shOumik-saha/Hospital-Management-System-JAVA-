import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FacilitiesOperations implements FacilitiesInfo 
{
Facilities f;
File file=new File("Facilities Recordings.txt");
FileWriter writer=null;
FileReader read=null;
	public void insertFacilities(Facilities f) {
	this.f=f;
	Scanner input=new Scanner(System.in);
	try{
		System.out.println("Enter Facilities Name people can have:");
		String n=input.next();
		f.setName(n);
				
		System.out.println("Given Informations are:");
		System.out.println("===Name:"+f.getName());
		System.out.println("Are all the informations correct?('y' for yes/'n' for no)");
		char ch=input.next().charAt(0);
		if(ch=='y') 
		{
			
			writer=new FileWriter(file,true);
			writer.write("*************************");
			writer.write("Facilities Facility Name:"+f.getName()+"\r"+"\n");
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
	public void showAllFacilities(Facilities f) 
	{
		this.f=f;
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
}