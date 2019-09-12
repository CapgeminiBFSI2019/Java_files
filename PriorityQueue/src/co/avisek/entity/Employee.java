package co.avisek.entity;

public class Employee implements Comparable<Employee> {
	
	private String empName;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Employee [empName=%s, salary=%s]", empName, salary);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null) {
				return false;
			}
		} else if (!empName.equals(other.empName)) {
			return false;
		}
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.getSalary(), o.getSalary());
	}
	
	

}
