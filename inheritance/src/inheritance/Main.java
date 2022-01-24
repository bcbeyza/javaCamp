package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer individualCustomer1=new IndividualCustomer();
		individualCustomer1.customerNumber="12345";
		
		CorporateCustomer corporateCustomer1=new CorporateCustomer();
		corporateCustomer1.customerNumber="67890";
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(individualCustomer1);
		customerManager.add(corporateCustomer1);
		
		Customer[]customers= {corporateCustomer1,individualCustomer1};
		customerManager.addMultiple(customers);
		
		

	}

}
