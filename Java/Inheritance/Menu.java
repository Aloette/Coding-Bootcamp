import java.util.*;

public class Menu {
	
	static Insurance insurance1 = new Life(4, 10, 15);
	static Insurance insurance2 = new Life(3, 4, 216);
	static Insurance insurance3 = new Life(6, 6, 412);
	static Insurance insurance4 = new Life(9, 14, 19);
	static Insurance insurance5 = new Life(1, 20, 20);
	static Insurance insurance6 = new Health(2, 7, 15);
	static Insurance insurance7 = new Health(5, 9, 80);
	static Insurance insurance8 = new Health(7, 7, 45);
	static Insurance insurance9 = new Health(8, 9, 80);
	static Insurance insurance10 = new Health(10, 7, 70);
	
	static Insurance[] insurances = {insurance1, insurance2, insurance3, insurance4, insurance5, insurance6, insurance7, insurance8, insurance9, insurance10};

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Maria Papadopoulou", 1988, "female");
		Customer customer2 = new Customer("Kakomoiris Kakomoiroglou", 1983, "male");
		Customer customer3 = new Customer("Albert Einstein", 1950, "male");
		Customer customer4 = new Customer("Alan Turing", 1940, "male");
		Customer customer5 = new Customer("Mata Hari", 1932, "female");
		Customer customer6 = new Customer("Margarita Margaro", 1962, "female");
		Customer customer7 = new Customer("Theodosis Theodosiou", 1992, "male");
		Customer customer8 = new Customer("Epameinondas Rowe", 1976, "male");
		Customer customer9 = new Customer("Pelopidas Ananas", 1987, "male");
		Customer customer10 = new Customer("Aloe Antoniou", 1989, "female");
		
		// Adding all customers in a Customers array
		Customer[] customers  = {customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10};
		
		Scanner keyboard = new Scanner(System.in);
		int x;
		
		do {
			System.out.println("***** Menu *****");
			System.out.println("1. Print all Insurances");
			System.out.println("2. Search insurances by customer code");
			System.out.println("3. Search insurances by insurance code");
			x = keyboard.nextInt();
			
			if (x==1) { 
				
					for (int i=0; i<insurances.length; i++) {
						 insurances[i].Printing(insurances[i]); 
					}
					
			}
			
			else if (x==2) {
				
				System.out.println("Give a customer's code: ");
				int k = keyboard.nextInt();
				for (int i=0; i<insurances.length; i++) {
					if (insurances[i].getCustomerCode()==k){
						insurances[i].Printing(insurances[i]);
					}
				}
				
			}
			
			else if (x==3) {
				
				System.out.println("Give an insurance code: ");
				int k = keyboard.nextInt();
				for (int i=0; i<insurances.length; i++) {
					if (insurances[i].getInsuranceCode()==k){
						insurances[i].Printing(insurances[i]);
					}
				}
			}
				
			
		}
		
		while (x!=0);
	
	}

}
