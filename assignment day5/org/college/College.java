package org.college;

public class College {

	public void collegeName(){
		System.out.println("college name: rgcet");
	}

	public void collegecode()
	{
		System.out.println("college code:112");
	}
	public void collegeRank()
	{
		System.out.println("college rank:2");
	}
	public static void main(String[] args) {
		College detail= new College();
		detail.collegeName();
		detail.collegecode();
		detail.collegeRank();
		

	}

}
