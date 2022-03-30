package wordFileDocs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class EmployeeDetails {  

	public static ArrayList<String> file=new ArrayList<String>();
	public static ArrayList<String> file1=new ArrayList<String>();
	int emp_id;
	String Dname;

	public int getEmp_id() {  
		return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
		this.emp_id = emp_id;  
	}  

	public void setName(String name) {  
		this.Dname = name;  
	}  

	public String toString() {  
		return "Employee [emp_id = " + emp_id + ", name = " + Dname + "]";  
	}  

}  
public class Employee{  

	public static void main(String args[]) {  

		EmployeeDetails emp = new EmployeeDetails();  
		emp.setEmp_id(101);  
		emp.setName("Automation Tester");  

		// System.out.println(emp);  
		String Details = emp.toString();

		if (Details.contains("Manual"))
		{
			
			emp.file1.add(Details);
		}
		else if (emp.toString().contains("Automation"))
		{
			
			emp.file1.add(Details);

		}



	}  
}  