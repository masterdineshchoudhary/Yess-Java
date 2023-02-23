package array;

public class Employee {
	int emp_id;
	String emp_name;
	
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	public void showInfo() {
		System.out.println("Emp ID : " + emp_id + " Emp Name : "+emp_name);
	}
}
