package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerKim = new Customer();

		customerKim.setCustomerName("kimjihwan");
		customerKim.setCustomerID(10000);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		VIPCustomer customerLee = new VIPCustomer();
		
		customerLee.setCustomerName("BruceLee");
		customerLee.setCustomerID(1001);
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo());
	}

}
