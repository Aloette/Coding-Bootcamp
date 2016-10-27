public class Customer {
	
	static int customerCode;
	String name;
	int yearOfBirth;
	String sex;
	
	Customer(String name, int yearOfBirth, String sex) {
		
		customerCode+=1;
		this.name=name;
		this.yearOfBirth=yearOfBirth;
		this.sex=sex;
		
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth=yearOfBirth;
	}
	public int getYearOfBirth() {
		return this.yearOfBirth;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public String getSex() {
		return this.sex;
	}
	
	public String toString(){
		return(this.customerCode + " " + this.name + " " + this.yearOfBirth + " " + this.sex);
	}
}
