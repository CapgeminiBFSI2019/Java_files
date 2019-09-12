package co.avisek.entity;

public class Person implements Comparable<Person> {

	private String fname;
	private String lname;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return String.format("Person [fname=%s, lname=%s]", fname, lname);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
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
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (fname == null) {
			if (other.fname != null) {
				return false;
			}
		} else if (!fname.equals(other.fname)) {
			return false;
		}
		if (lname == null) {
			if (other.lname != null) {
				return false;
			}
		} else if (!lname.equals(other.lname)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Person o) {
		int ret=this.fname.compareTo(o.fname);
		if(ret==0) {
			ret=this.lname.compareTo(o.lname);
		}
		return ret;
	}
	
	
	
	
}
