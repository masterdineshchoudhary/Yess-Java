package association;

// Aggregation - Loose Coupling - Weak association
// Contained object holds the reference of the Container
// In composition objects are strongly associated where is an agg ibj are weakly ass
// in composition , co object store directly
// in aggregation , holds ref of contained obj

public class Aggregation {
	public static void main(String[] args) {
		Address ad = new Address(101, "Pune", "Maharashtra", "India");
		Employee employee = new Employee(1, "Ramesh", ad);
		System.out.print(employee.empId + " - " + employee.empName);
		System.out.println(employee.toString());
		
	}
}
