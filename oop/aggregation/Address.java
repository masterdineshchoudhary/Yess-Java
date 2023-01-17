package aggregation;

public class Address {
	int streetNo;
	String city, state, country;
	
	public Address(int street, String c, String st, String co) {
		this.streetNo = street;
		this.city = c;
		this.state = st;
		this.country = co;
	}
}
