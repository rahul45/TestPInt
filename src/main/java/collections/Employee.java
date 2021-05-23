package collections;

public class Employee implements Comparable<Employee> {
	private String firstName;
	private int id;
	private long salary;
	private String lastName;
	int age;
	public Employee(int id, String fName, String lName, int age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
	  @Override
	    public int compareTo(Employee o) {
	        return this.id - o.id;
	    }
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", id=" + id + ", salary=" + salary + ", lastName=" + lastName
				+ ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	  
}
