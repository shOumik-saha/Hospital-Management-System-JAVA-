public class Staffs 
{
	String sname;
    String sid;
    String ssalary;
	String sgender;
    String sdesig;
	
	Staffs()
	{
		
	}
	  
	void setName(String sname) 
	{
		this.sname=sname;
	}
	void setid(String sid)
	{
		this.sid=sid;
	}
	void setSalary(String ssalary)
	{
		this.ssalary=ssalary;
	}
	void setGender(String sgender)
	{
		this.sgender=sgender;
	}
	void setDesignation(String sdesig)
	{
		this.sdesig=sdesig;
	}
	
	
	String getName() 
	{
		return this.sname;
    }
	
	String getid() 
	{
		return this.sid;
    }
	
	String getSalary() 
	{
		return this.ssalary;
    }
	
	String getGender() 
	{
		return this.sgender;
    }
	
	String getDesignation() 
	{
		return this.sdesig;
    }	
}