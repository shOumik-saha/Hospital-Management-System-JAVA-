public class Patient 
{
	String pname;
    String pid;
    String pdis;
	String pgender;
    String pstat;
    String page;

	Patient(){
		
	}
	  
	void setName(String pname) 
	{
		this.pname=pname;
	}
	void setid(String pid)
	{
		this.pid=pid;
	}
	void setDiseases(String pdis)
	{
		this.pdis=pdis;
	}
	void setGender(String pgender)
	{
		this.pgender=pgender;
	}
	void setStatus(String pstat)
	{
		this.pstat=pstat;
	}
	void setAge(String page)
	{
		this.page=page;
	}
	
	
	String getName() 
	{
		return this.pname;
    }
	
	String getid() 
	{
		return this.pid;
    }
	
	String getDiseases() 
	{
		return this.pdis;
    }
	
	String getGender() 
	{
		return this.pgender;
    }
	
	String getStatus() 
	{
		return this.pstat;
    }
	
	String getAge() 
	{
		return this.page;
    }
	
}