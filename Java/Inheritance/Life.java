
public class Life extends Insurance {

	private int amount;
	
	Life(int customerCode, int duration, int amount){
		
		super(customerCode, duration);
		this.amount=amount;
		
	}
	
	public void setAmount(int amount){
		this.amount=amount;
	}
	public int getAmount(){
		return this.amount;
	}
	public String toString(){
		return(this.amount + " " + this.insuranceCode + " " + this.customerCode + " " + this.duration);
	}
	
	public int insurance_cost(){
		return 100+5*duration;
	}
		
}
