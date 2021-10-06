import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class MedicinesOperations implements MedicinesInfo 
{
Medicines m;
File file=new File("Medicines Recordings.txt");
FileWriter writer=null;
FileReader read=null;
	public void insertMedicines(Medicines m) {
	this.m=m;
	Scanner input=new Scanner(System.in);
	try{
		System.out.println("Enter Name:");
		String n=input.next();
		m.setName(n);
		System.out.println("Enter Company Name:");
		String comp=input.next();
		m.setComp(comp);
		System.out.println("Enter Expiry Date:");
		String date=input.next();
		m.setDate(date);
		System.out.println("Enter Cost:");
		String cost=input.next();
		m.setCost(cost);
		System.out.println("Enter No. of Unit:");
		String unit=input.next();
		m.setUnit(unit);
		
		
		System.out.println("Given Informations are:");
		System.out.println("===Name:"+m.getName());
		System.out.println("===Company Name:"+m.getComp());
		System.out.println("===Exp Date:"+m.getDate());
		System.out.println("===Cost:"+m.getCost());
		System.out.println("===No. of Unit:"+m.getUnit());
		System.out.println("Are all the informations correct?('y' for yes/'n' for no)");
		char ch=input.next().charAt(0);
		if(ch=='y') 
		{
			
			writer=new FileWriter(file,true);
			writer.write("*************************");
			writer.write("Name :"+m.getName()+"\r"+"\n");
			writer.write("Company Name :"+m.getComp()+"\r"+"\n");	
			writer.write("Exp Date :"+m.getDate()+"\r"+"\n");
			writer.write("Cost:"+m.getCost()+"\r"+"\n");
			writer.write("No. of Unit: "+m.getUnit()+"\r"+"\n");
			writer.write("*************************");
			writer.write("\n");
			System.out.println("########The informations have been succesfully recorded########");
			writer.flush();
			writer.close();
		}
		else 
		{
			System.out.println("=========[]Please Give the Informations Again[]========");
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
	public void showAllMedicines(Medicines m) 
	{
		this.m=m;
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
	public void deleteMedicines(Medicines m) 
	{
		this.m=m;
		Scanner input=new Scanner(System.in);
		boolean isFound=false;
		String temp=null;
		int count=0;
		int linestodelete=4;
		String inp="";
		System.out.println("Enter the Medicine Name to delete all the informations:");
		String mn=input.next();
		m.setName(mn);
		try {
			read=new FileReader(file);
			BufferedReader bfr2=new BufferedReader(read);
			while((temp=bfr2.readLine())!=null) {
				if(temp.contains(m.getName())) {
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
			System.out.println("Medicines succesfully deleted!!!");
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