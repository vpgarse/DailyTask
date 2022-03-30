package wordFileDocs;

import java.util.Arrays;

public class SeparateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="VaIbhav";
		String[] r=s.split("(?=\\p{Upper}) ");
		System.out.println(Arrays.toString(r));

	}

}
