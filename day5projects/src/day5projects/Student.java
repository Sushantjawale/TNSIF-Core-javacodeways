package day5projects;

//child class

public class Student extends Citizen{
	
	//data member
	
	private int rollno;
	private String collegeName;
	
	//non data parameters
	
	public Student() {
		super();
	}
	
	//parameters
	
	public Student(String Name, String adharNo, String address, Long phone, int rollno, String collegeName) {
		super(Name, adharNo, address, phone);
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	
	//getter setter

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	//to get
	
	
	
	
	
	
	
	
	

}
