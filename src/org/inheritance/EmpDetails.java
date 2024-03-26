package org.inheritance;

public class EmpDetails {
	private void emplocation() {
		System.out.println("odc");
	}
		

	private void empmark() {
		System.out.println("50%");
		
	}		
	public static void main(String[] args) {
		EmpDetails ed = new EmpDetails();
		ed.emplocation();
		ed.empmark();
		
		Inheritance I = new Inheritance();
		I.empname();
		I.empid();
	}
}
