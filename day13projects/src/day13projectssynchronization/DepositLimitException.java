package day13projectssynchronization;

public class DepositLimitException extends Exception {
	
	DepositLimitException(){
		
		super("Daily Limit of Deposit is exceed. . .");
	}

	public DepositLimitException(String message) {
		
		super(message);
	}
}
