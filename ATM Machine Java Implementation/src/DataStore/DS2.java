package DataStore;

/**
* Data Store for Account 2 which consists of the all the variables required for Account2.
* @author Anand N
* @Date 05/01/2016
*/
public class DS2 extends DataStore{
	
	static final int penaltyAmount = 0;
	
	public int temp_y;
	public int temp_a;
	public int temp_p;
	public int balance;
	public int pin;
	public int temp_d;
	public int temp_w;
	public int uid;
	public int getTemp_y() {
		return temp_y;
	}
	public void setTemp_y(int temp_y) {
		this.temp_y = temp_y;
	}
	public int getTemp_a() {
		return temp_a;
	}
	public void setTemp_a(int temp_a) {
		this.temp_a = temp_a;
	}
	public int getTemp_p() {
		return temp_p;
	}
	public void setTemp_p(int temp_p) {
		this.temp_p = temp_p;
	}
	public int getBalance() {
		this.balance = getTemp_a();
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPin() {
		this.pin = getTemp_p();
		return this.pin;
	}
	public void setPin() {
		this.pin = getTemp_p();
	}
	public int getTemp_d() {
		return temp_d;
	}
	public void setTemp_d(int temp_d) {
		this.temp_d = temp_d;
	}
	public int getTemp_w() {
		return temp_w;
	}
	public void setTemp_w(int temp_w) {
		this.temp_w = temp_w;
	}
	public int getUid() {
		this.uid = getTemp_y();
		return this.uid;
	}
	public void setUid() {
		this.uid = getTemp_y();
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
