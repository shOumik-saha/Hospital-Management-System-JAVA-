import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class LaboratoriesOperations implements LaboratoriesInfo 
{
Laboratories l;
File file=new File("Laboratories Recordings.txt");
FileWriter writer=null;
FileReader read=null;
	public void insertLaboratories(Laboratories l) {
	this.l=l;
	Scanner input=new Scanner(System.in);
	try{
		System.out.println("Enter Laboratory Facility Name:");
		String n=input.next();
		l.setName(n);
		System.out.println("Enter Cost:");
		String comp=input.next();
		l.setCost(comp);
				
		System.out.println("Given Informations are:");
		System.out.println("===Name:"+l.getName());
		System.out.println("===Company Name:"+l.getCost());
		System.out.println("Are all the informations correct?('y' for yes/'n' for no)");
		char ch=input.next().charAt(0);
		if(ch=='y') 
		{
			
			writer=new FileWriter(file,true);
			writer.write("*************************");
			writer.write("Laboratory Facility Name:"+l.getName()+"\r"+"\n");
			writer.write("Cost:"+l.getCost()+"\r"+"\n");	
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
	public void showAllLaboratories(Laboratories l) 
	{
		this.l=l;
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