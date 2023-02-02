package encapsulation;

class Encap {
	private String name;
	private int id;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}

class Encapsulation {
	public static void main(String[] args) {
		Encap ecEncap = new Encap();
		ecEncap.setName("Dinesh");
		System.out.println(ecEncap.getName());
		ecEncap.setId(8);
		System.out.println(ecEncap.getId());
	}
}
