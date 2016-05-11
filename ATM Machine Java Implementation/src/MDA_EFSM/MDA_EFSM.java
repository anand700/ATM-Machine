package MDA_EFSM;

import AbstractFactory.AbstractFactory;
import MDA_EFSM.States.*;
import Output.Output;

/**
* This class is manages the state changes. It calls the respective state functionalities. It is not connected to the data store.
* @author Anand N
* @Date 05/01/2016
*/
public class MDA_EFSM {
	
	static final int defaultAttempts = 0;
	
	State checkPin = new CheckPin(this);
	State idle = new Idle(this);
	State lock = new Lock(this);
	State overdrawn = new Overdrawn(this);
	State ready = new Ready(this);
	State s1 = new S1(this);
	State start = new Start(this);
	State stop = new Stop(this);
	State suspend = new Suspend(this);
	
	public AbstractFactory af = null;
	public Output o = null;
	public State state = null;
	public int noOfAttempts;
	public int acc;
	
	public MDA_EFSM(AbstractFactory af, Output o, int acc) {
		this.state = new Start(this);
		this.o = o;
		this.af = af;
		noOfAttempts = defaultAttempts;
		this.acc = acc;
	}
	
	public void open() {
		if(!(state instanceof Start)){
			printNotAValidOperation();
		}else{
			((Start)state).open();
		}
		printCurState();
	}

	public void Login() {
		if(!(state instanceof Idle)){
			printNotAValidOperation();
		}else{
			((Idle)state).Login();
		}
		noOfAttempts = defaultAttempts;
		printCurState();
	}
	public void IncorrectPin(int max) {
		if(!(state instanceof CheckPin)){
			printNotAValidOperation();
		}else{
			((CheckPin)state).IncorrectPin(max);
		}
		printCurState();
	}
	public void CorrectPinBelowMin() {
		if(!(state instanceof CheckPin)){
			printNotAValidOperation();
		}else{
			((CheckPin)state).CorrectPinBelowMin();
		}
		printCurState();
	}
	public void Deposit(){
		if((state instanceof Overdrawn)){
			((Overdrawn)state).Deposit();
		}
		else if((state instanceof Ready)){
			((Ready)state).Deposit();
		}
		else{
			printNotAValidOperation();
		}
		printCurState();
	}
	public void Logout() {
		if((state instanceof Overdrawn)){
			((Overdrawn)state).Logout();
		}
		else if((state instanceof Ready)){
			((Ready)state).Logout();
		}
		else if((state instanceof CheckPin)){
			((CheckPin)state).Logout();
		}
		else{
			printNotAValidOperation();
		}
		printCurState();
	}
	public void CorrectPinAboveMin() {
		if(!(state instanceof CheckPin)){
			printNotAValidOperation();
		}else{
			((CheckPin)state).CorrectPinAboveMin();	
		}
		printCurState();
	}
	public void AboveMinBalance() {
		if((state instanceof Ready)){
			//don't do anything
		}
		else if(!(state instanceof S1)){
			printNotAValidOperation();
		}else{
			((S1)state).AboveMinBalance();
		}
		printCurState();
	}
	public void balance() {
		if((state instanceof Overdrawn)){
			((Overdrawn)state).balance();
		}
		else if((state instanceof Ready)){
			((Ready)state).balance();
		}
		else if((state instanceof Suspend)){
			((Suspend)state).balance();
		}
		else{
			printNotAValidOperation();
		}
		printCurState();
	}
	public void withdraw() {
		if((state instanceof Overdrawn)){
			((Overdrawn)state).withdraw();
		}
		else if((state instanceof Ready)){
			((Ready)state).withdraw();
		}
		else{
			printNotAValidOperation();
		}
		printCurState();
	}
	public void WithdrawBelowMinBalance() {
		if(!(state instanceof S1)){
			printNotAValidOperation();
		}else{
			((S1)state).WithdrawBelowMinBalance();
		}
		printCurState();
	}
	public void Activate() {
		if(!(state instanceof Suspend)){
			printNotAValidOperation();
		}else{
			((Suspend)state).Activate();
		}
		printCurState();
	}
	public void BelowMinBalance() {
		if(!(state instanceof S1)){
			printNotAValidOperation();
		}else{
			((S1)state).BelowMinBalance();
		}
		printCurState();
	}
	public void Suspend() {
		if(!(state instanceof Ready)){
			printNotAValidOperation();
		}else{
			((Ready)state).Suspend();
		}
		printCurState();
	}
	public void close() {
		if(!(state instanceof Suspend)){
			printNotAValidOperation();
    	}
    	else{
    		((Suspend)state).close();
    	}
    	   	printCurState();

	}
	public void unlock() {
		if(!(state instanceof Lock)){
			printNotAValidOperation();
		}else{
			((Lock)state).unlock();
		}
		printCurState();
	}
	public void IncorrectUnlock() {
		if(!(state instanceof Lock)){
			printNotAValidOperation();
		}else{
			((Lock)state).IncorrectUnlock();
		}
		printCurState();
	}
	public void lock() {
		if((state instanceof Overdrawn)){
			((Overdrawn)state).lock();
		}
		else if((state instanceof Ready)){
			((Ready)state).lock();
		}
		else{
			printNotAValidOperation();
		}
		printCurState();
	}
	public void IncorrectLock() {
		if(!(state instanceof Ready)){
			printNotAValidOperation();
		}else{
			((Ready)state).IncorrectLock();
		}
		printCurState();
	}
	public void IncorrectLogin() {
		if(!(state instanceof Idle)){
			printNotAValidOperation();
		}else{
			((Idle)state).IncorrectLogin();
		}
		printCurState();
	}
	public State getCheckPin() {
		return this.checkPin;
	}
	public void setCheckPin(State checkPin) {
		this.checkPin = checkPin;
	}
	public State getIdle() {
		return this.idle;
	}
	public void setIdle(State idle) {
		this.idle = idle;
	}
	public State getLock() {
		return this.lock;
	}
	public void setLock(State lock) {
		this.lock = lock;
	}
	public State getOverdrawn() {
		return this.overdrawn;
	}
	public void setOverdrawn(State overdrawn) {
		this.overdrawn = overdrawn;
	}
	public State getReady() {
		return this.ready;
	}
	public void setReady(State ready) {
		this.ready = ready;
	}
	public State getS1() {
		return this.s1;
	}
	public void setS1(State s1) {
		this.s1 = s1;
	}
	public State getStart() {
		return this.start;
	}
	public void setStart(State start) {
		this.start = start;
	}
	public State getStop() {
		return this.stop;
	}
	public void setStop(State stop) {
		this.stop = stop;
	}
	public State getSuspend() {
		return this.suspend;
	}
	public void setSuspend(State suspend) {
		this.suspend = suspend;
	}
	public AbstractFactory getAf() {
		return this.af;
	}
	public void setAf(AbstractFactory af) {
		this.af = af;
	}
	public Output getO() {
		return this.o;
	}
	public void setO(Output o) {
		this.o = o;
	}
	public State getState() {
		return this.state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getNoOfAttempts() {
		return this.noOfAttempts;
	}
	public void setNoOfAttempts(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}
	public static int getDefaultattempts() {
		return defaultAttempts;
	}
	public void Nofunds() {
		if(!(state instanceof Ready)){
			printNotAValidOperation();
		}else{
			((Ready)state).Nofunds();
		}
		printCurState();
	}
	private void printCurState() {
		// TODO Auto-generated method stub
		System.out.println("Current State : "+state.getClass().getName());
	}
	private void printNotAValidOperation() {
		// TODO Auto-generated method stub
		System.out.println("Not a valid operation");
	}
}


