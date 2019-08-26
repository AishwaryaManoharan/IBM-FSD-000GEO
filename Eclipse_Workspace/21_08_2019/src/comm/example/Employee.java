package comm.example;

//import java.util.Date;

public class Employee implements Comparable{
	
	private int id=0;
	private String name;
	private String department;
	//private Date dateOfJoining;
	public int age;
	private int salary;
	
	public Employee()
	{
		
	}
	
	
	public Employee(int id, String name, String department,  int age, int salary) {
		super();
		this.id = id+1;
		this.name = name;
		this.department = department;
		//this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	
	public int compareTo(Employee e)
	{
		if (salary==e.salary)
			return 0;
		else if(salary>e.salary)
			return 1;
		else
			return -1;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
//	public Date getDateOfJoining() {
//		return dateOfJoining;
//	}
//	public void setDateOfJoining(Date dateOfJoining) {
//		this.dateOfJoining = dateOfJoining;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ",  age=" + age + ", salary=" + salary + "]";
	}
	
}
