package evaluation;

import java.util.LinkedList;
import java.util.List;

public class reverse(){

	public void strReverse(String s){
		List<String> lis=s.toList();

		int count=s.length()-1;
		for(int i=count;i<=0;i--){
			System.Out.Println(lis[i]);

		}
	}
	public static void main(String args[]){

		String s="Aapna Infotech Pvt.Ltd" ;
		strReverse(s);

	}
}	 




