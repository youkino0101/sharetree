package Doan;

public class Student {
	private int id;
	private String name;
	private int age;
	private String address;
	private String email;
	
	public Student(int id, String name, int age, String address, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printInfo() {
		System.out.printf("|%1$-5s|%2$-10s|%3$-10s|%4$-10s|%5$-15s|\n", id, name, age, address, email); 
	}
}
