package DataStore;

/**
* Data Store for Account 1 which consists of the all the variables required for Account1.
* @author Anand N
* @Date 05/01/2016
*/
public class DS1 extends DataStore{
	
	static final int penaltyAmount = 20;
	
//	public boolean isValidPin;
	public String temp_p;
	public String pin;
	public float temp_a;
	public float temp_d;
	public String uid;   
	public String temp_y;
	public float temp_w;
	public float balance;
	
//	public boolean isValidPin() {
//		return isValidPin;
//	}
//	public void setValidPin(boolean isValidPin) {
//		this.isValidPin = isValidPin;
//	}
	public String getTemp_p() {
		return temp_p;
	}
	public void setTemp_p(String temp_p) {
		this.temp_p = temp_p;
	}
	public String getPin() {
		this.pin = getTemp_p();
		return this.pin;
	}
	public void setPin() {
		this.pin = getTemp_p();
	}
	public float getTemp_a() {
		return temp_a;
	}
	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}
	public float getTemp_d() {
		return temp_d;
	}
	public void setTemp_d(float temp_d) {
		this.temp_d = temp_d;
	}
	public String getUid() {
		this.uid = getTemp_y();
		return this.uid;
	}
	public void setUid() {
		this.uid = getTemp_y();
	}
	public String getTemp_y() {
		return temp_y;
	}
	public void setTemp_y(String temp_y) {
		this.temp_y = temp_y;
	}
	public float getTemp_w() {
		return temp_w;
	}
	public void setTemp_w(float temp_w) {
		this.temp_w = temp_w;
	}
	public float getBalance() {
		this.balance = getTemp_a();
		return this.balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void applyPenalty(){
		this.balance = this.temp_a - penaltyAmount;
		this.temp_a = balance;
	}
	public void withdraw(){
		this.balance = this.temp_a - this.temp_w;
		this.temp_a = this.balance;
	}
	public void deposit(){
		this.balance = this.temp_a + this.temp_d;
		this.temp_a = this.balance;
	}
}


