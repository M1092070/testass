package assignment2;

public class Customer1 {
	
	private int id;
	private int age;
	private double purchesamount;
	private String name;
	public Customer1(int id, int age, double purchesamount, String name) {
		super();
		this.id = id;
		this.age = age;
		this.purchesamount = purchesamount;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPurchesamount() {
		return purchesamount;
	}
	public void setPurchesamount(double purchesamount) {
		this.purchesamount = purchesamount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer1 [id=" + id + ", age=" + age + ", purchesamount=" + purchesamount + ", name=" + name + "]";
	}
	
	
	
	

}
