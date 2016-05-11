package MDA_EFSM.States;

public abstract class State {
	public void open() {
	}
	public void Login() {
	}
	public void IncorrectPin(int max) {
	}
	public void CorrectPinBelowMin() {
	}
	public void Deposit(){
	}
	public void Logout() {
	}
	public void CorrectPinAboveMin() {
	}
	public void AboveMinBalance() {
	}
	public void balance() {
	}
	public void withdraw() {
	}
	public void WithdrawBelowMinBalance() {
	}
	public void Activate() {
	}
	public void BelowMinBalance() {
	}
	public void Suspend() {
	}
	public void close() {
	}
	public void unlock() {
	}
	public void IncorrectUnlock() {
	}
	public void lock() {
	}
	public void IncorrectLock() {
	}
	public void IncorrectLogin() {
	}
	public void Nofunds() {
	}
}


