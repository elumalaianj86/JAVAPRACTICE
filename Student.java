package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
System.out.println("M S Elumalai");
	}
	public void studentDept() {
System.out.println("plastic engineering");
	}
	public	 void studentId() {
System.out.println("3890");
	}
public static void main(String[] args) {
	Student std = new Student();
	std.collegeName();
	std.collegeCode();
	std.collegeRank();
	std.deptName();
	std.studentName();
	std.studentDept();
	std.studentId();
}
}
