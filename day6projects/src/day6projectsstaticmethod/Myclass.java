package day6projectsstaticmethod;

public class Myclass {
	
	private int section;        //non-ststic or instance varible
	
	
	private static int SrNo;   //static or class varible
	
	//static block
	static {
		System.out.println("-----within static block---");
	    SrNo = 1000;
	}

	//default Constructor
	public Myclass() {
		System.out.println("-----within default constructor----");
		SrNo++;
		section++;
	}

	//use to string
	@Override
	public String toString() {
		return "Myclass [serial No"+SrNo+",section=" + section + "]";
	}
	
	//static method
	
	static void display() {
		System.out.println("serial No:"+ SrNo);
	}
	
}
