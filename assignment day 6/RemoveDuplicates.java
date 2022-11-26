package week3.day1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] name = {"ram","ravi","ram","tamil"};

		    Set<String> myset  = new HashSet<String>();
		    Collections.addAll(myset,name);

		       System.out.println(myset);
		   
	
	}

}
