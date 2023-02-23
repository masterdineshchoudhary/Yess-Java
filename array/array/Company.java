package array;

public class Company {
	public static void main(String[] args) {
		Employee arr1[] = new Employee[5];
		arr1[0] = new Employee(101,"rahul");
		arr1[1] = new Employee(102,"dinesh");
		arr1[2] = new Employee(103,"rohit");
		arr1[3] = new Employee(104,"priti");
		arr1[4] = new Employee(105,"neha");
		
		System.out.println("Employee 1 info ");
		arr1[0].showInfo();
		System.out.println("Employee 2 info ");
		arr1[1].showInfo();
		System.out.println("Employee 3 info ");
		arr1[2].showInfo();
		System.out.println("Employee 4 info ");
		arr1[3].showInfo();
		System.out.println("Employee 5 info ");
		arr1[4].showInfo();
		
	}
}
