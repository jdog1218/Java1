package edu.orangecoastcollege.cs170.jgordon41.ic27;

import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[]args) {
		ArrayList<Employee> allEmployees = new ArrayList<>();
		allEmployees.add(new Doctor("Mrs. ", "Joel", 25, "2017", 12000));
		
		for(Employee e:allEmployees){
			System.out.println(e);
		}
		
	}

}
