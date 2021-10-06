public class Laboratories 
{
	String fname;
    String fcost;

	Laboratories()
	{
		
	}
	  
	void setName(String fname) 
	{
		this.fname=fname;
	}
	void setCost(String fcost)
	{
		this.fcost=fcost;
	}
		
	String getName() 
	{
		return this.fname;
    }
	
	String getCost() 
	{
		return this.fcost;
    }
}