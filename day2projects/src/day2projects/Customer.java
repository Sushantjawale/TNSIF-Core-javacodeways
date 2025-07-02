package day2projects;

public class Customer {
	
	private String CustomerName;
	private int customerId;
	private String customerCity;
	
	public Customer()
	{
		System.out.println("Hello this is Default Constructor---------------!");
	}

	public Customer(String customerName, int customerId, String customerCity) {
		
		System.out.println("Hello is this Para Constructer");
		CustomerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	

	
	}
	
	
	
	

}
