package wordFileDocs;

public class ExecuteGetANDset {

	public static void main(String[] args) {
		GetterANDsetter gs=new GetterANDsetter("Vaibhav","Garse",0512);
		
	System.out.println("Old FirstName :"+gs.getLastName());
	System.out.println("Old LastName :" +gs.getFirstName());
	System.out.println("Old DOB :"+gs.getDOB());
	gs.setFirstName("Rahul");
	gs.setLastName("Bajaj");
	gs.setDOB(2112);

	System.out.println("New FirstName :"+gs.getLastName());
	System.out.println("New LastName :" +gs.getFirstName());
	System.out.println("New DOB :"+gs.getDOB());
	}

}
