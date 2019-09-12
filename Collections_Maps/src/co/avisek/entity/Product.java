package co.avisek.entity;

public class Product implements Comparable<Product> {//this for treeSet

	private int id;
	private String name;
	private double salary;
	
	public Product() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary)) {
			return false;
		}
		return true;
	}

	public Product(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, salary=%s]", id, name, salary);
	}

	@Override
	public int compareTo(Product p) {//for treeSet //depends upon the business model
	    int ret =this.id-p.id;
	    if(ret==0) {
	    	ret =this.name.compareTo(p.name);
	    	if(ret==0) {
	    		ret=Double.compare(this.salary, p.salary);
	    	}
	    }
		return ret;
	}
	
	
	
}
