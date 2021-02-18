package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Employee id is 1234");
	}

	private void empName() {
		System.out.println("Employee name is kumar");
	}

	private void empDob() {
		System.out.println("22.03.1995");
	}

	private void empPhone() {
		System.out.println("9745683234");
	}

	private void empMail() {
		System.out.println("kumar95@gmail.com");
	}

	private void empAddress() {
		System.out.println("32/17 c.v.r street chennai");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empMail();
		e.empAddress();
	}

}
