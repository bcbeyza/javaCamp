package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1=new Customer(1,"Engin","Demirog");
		
		Logger[]loggers= {new FileLogger(), new DatabaseLogger(), new SmsLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		customerManager.add(customer1);
		customerManager.delete(customer1);
		

	}

}
