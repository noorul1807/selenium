package week3.day1;

import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class UniqueNumber {

	public UniqueNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String s1=sc.nextLine();
	 try{
	HashSet<Object> h=new HashSet<Object>();
	for(int i=0;i<s1.length();i++)
	{
	h.add(s1.charAt(i));
	}
	java.util.Iterator<Object> itr=h.iterator();
	  while(itr.hasNext()){
	   System.out.println(itr.next());
	    }
	    }
	    catch(Exception e)
	    {
	    System.out.println("error");
	    }
	}
	}


