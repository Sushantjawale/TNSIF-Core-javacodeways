package day5projects;

//parent class
public class Citizen {
	
	private String Name;
	private String adharNo;
	private String address;
	private Long phone;
	
	//non parameter construct
	
	public Citizen() {
		System.out.println("Citizen object created");
	}
	
	//parameter construct
	
	public Citizen(String Name, String adharNo, String address, Long phone) {
		this.Name = Name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}
	
	//getter and setter

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Citizen [Name=" + Name + ", adharNo=" + adharNo + ", address=" + address + ", phone=" + phone + "]";
	}
	
	//to string
	
	
	
	

}
