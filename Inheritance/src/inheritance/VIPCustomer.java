package inheritance;

public class VIPCustomer extends Customer {

	/*
	 * private int customerID; private String customerName; private String
	 * customerGrade; int bonusPoint; double bonusRatio;
	 */

	double salesRatio;
	private int agentID;

	public VIPCustomer() {

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

	}

}
