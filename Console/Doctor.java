public class Doctor 
{
   String dname;
   String did;
   String dqua;
   String dspec;
   String dtime;
   String droom;

   void setName(String dname) 
  {
	this.dname=dname;
  }
   void setId(String did) 
  {
	this.did=did;
  }
  void setQualification(String dqua) 
  {
	this.dqua=dqua;
  }
  void setSpecial(String dspec) 
  {
	this.dspec=dspec;
  }
  void setWorkTime(String dtime) 
  {
	this.dtime=dtime;
  }
  void setRoomNo(String droom) 
  {
	this.droom=droom;
  }
  
  String getName() 
  {
	return this.dname;
  }
  String getId() 
  {
	return this.did;
  }
  String getQualification() 
  {
	return this.dqua;
  }
  String getSpecial() 
  {
	return this.dspec;
  }
  String getWorkTime() 
  {
	return this.dtime;
  }
  String getRoomNo() 
  {
	return this.droom;
  }
  
}
