public class Medicines 
{
	String mname;
    String mcomp;
    String mdate;
	String mcost;
    String munit;

	Medicines()
	{
		
	}
	  
	void setName(String mname) 
	{
		this.mname=mname;
	}
	void setComp(String mcomp)
	{
		this.mcomp=mcomp;
	}
	void setDate(String mdate)
	{
		this.mdate=mdate;
	}
	void setCost(String mcost)
	{
		this.mcost=mcost;
	}
	void setUnit(String munit)
	{
		this.munit=munit;
	}
	
	
	String getName() 
	{
		return this.mname;
    }
	
	String getComp() 
	{
		return this.mcomp;
    }
	
	String getDate() 
	{
		return this.mdate;
    }
	
	String getCost() 
	{
		return this.mcost;
    }
	
	String getUnit() 
	{
		return this.munit;
    }	
}