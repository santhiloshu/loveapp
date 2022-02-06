package streams;

public class Employee {
	private int empid;
	private String name;
	private int deptid;
	private String status="active";
	private double salary;
	public Employee(int empid, String name, int deptid, String status, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.deptid = deptid;
		this.status = status;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", deptid=" + deptid + ", status=" + status + ", salary="
				+ salary + "]";
	}
	
	

}
