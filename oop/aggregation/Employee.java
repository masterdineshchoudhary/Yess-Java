package aggregation;

public class Employee {
	int empId;
	String empName;
	
	// creating HAS-A relationship with Address class
	Address address;
	
	public Employee(int id, String name, Address add) {
		this.empId = id;
		this.empName = name;
		this.address = add;
	}

	@Override
	public String toString() {
		return address.streetNo + " - " + address.city + " - " + address.state + " - " + address.country;
	}
}
