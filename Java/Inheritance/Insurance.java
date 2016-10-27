
public class Insurance {
	
	protected int customerCode;
	protected static int insuranceCode;
	protected int duration;

	Insurance(int customerCode, int duration) {
	
	insuranceCode+=1;
	this.customerCode=customerCode;
	this.duration=duration;
	
}

public void setCustomerCode(int customerCode){
	this.customerCode=customerCode;
}
public int getCustomerCode(){
	return this.customerCode;
}
public int getInsuranceCode(){
	return this.insuranceCode;
}
public void setDuration(int duration){
	this.duration=duration;
}
public int getDuration(){
	return this.duration;
}

public String toString(){
	return(this.insuranceCode + " " + this.customerCode + " " + this.duration);
}

public int insurance_cost(){
	return 100;
}

// method for printing all stored insurances
public void Printing(Insurance asfaleia){
	
	System.out.println(asfaleia.toString());
	
}

// method for printing a particular insurance (argument : insurance code)
// public void Printing2(int Insurance_code){
	
//	System.out.println();

	
}
