
public class Health extends Insurance {
	
	private int medicalExpense;
	
	Health(int customerCode, int duration, int medicalExpense) {
	
	super(customerCode, duration);
	this.medicalExpense=medicalExpense;
	
	}
	
	public void setMedicalExpense(int medicalExpense){
		this.medicalExpense=medicalExpense;
	}
	public int getMedicalExpense(){
		return this.medicalExpense;
	}
	public String toString(){
		return(this.medicalExpense + " " + this.insuranceCode + " " + this.customerCode + " " + this.duration);
	}
	
	public int cost_calculation(){
		return 100+7*duration; // prepei na elegkso kai an einai antras
	}

}
