package day2projects;

public class EncapsulationDemo {
	
	private int SerailNUm;
	private int Age;
	private String Name;
	
	
	public int getSerailNUm() {
		return SerailNUm;
	}
	public void setSerailNUm(int serailNUm) {
		SerailNUm = serailNUm;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "EncapsulationDemo [SerailNUm=" + SerailNUm + ", Age=" + Age + ", Name=" + Name + "]";
	}
	
	
	
	
}
