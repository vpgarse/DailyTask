package wordFileDocs;

public class GetterANDsetter {
	//web page enter firstname, lastname, DOB details in registration form using setters and getters
	
	private String FirstName;
	private String LastName;
	private long DOB;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public long getDOB() {
		return DOB;
	}
	public void setDOB(long dOB) {
		this.DOB = dOB;
	}
	

//	GetterANDsetter()
//	{
//		
//	}
	GetterANDsetter(String FirstName,String LastName,long DOB)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.DOB=DOB;
	
	}

}
