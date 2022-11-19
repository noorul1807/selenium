package org.department;

import org.college.College;

public class Department extends College
{

	public   void departName() {
		System.out.println("Department :CSE");
		
	}

	public static void main(String[] args) {
		Department detail= new Department ();
		detail.collegeName();
		detail.collegecode();
		detail.collegeRank();
		detail.departName();

	}
}
