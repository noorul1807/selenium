package org.student;

import org.department.Department;

public class Student extends Department
{

	public void StudentName() {
		System.out.println("Student Name :Noorul");
		
	}

	public void StudentDept()
	{
		System.out.println("Student Dept: CSE ");
		
	}
	public void StudentID()
	{
		System.out.println("Student ID: 1806 ");
	}
	public static void main(String[] args) {
		Student detail= new Student();
		detail.StudentName();
		detail.StudentDept();
		detail.StudentID();
		detail.departName();


	}

}
