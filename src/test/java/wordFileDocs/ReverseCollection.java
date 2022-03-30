package wordFileDocs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program to reverse a collection

public class ReverseCollection {
	public static void main(String[] args) {
		
		List<String> List=new ArrayList<String>();
		
		List.add("Session");
		List.add("Program");
		List.add("Training");
		List.add("UPskilling");
		
		System.out.println("My Original List :" +List);
		
		Collections.reverse(List);
		
		System.out.println(List);
	}

}
