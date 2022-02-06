package streams;

public class Student {
	private int id;
	private String name;
	private String branch;
	private double fee;
	public Student(int id, String name, String branch, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.fee = fee;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", fee=" + fee + "]";
	}
	

}
