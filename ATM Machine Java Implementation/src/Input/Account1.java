package Input;

import DataStore.*;
import MDA_EFSM.MDA_EFSM;

/**
* Account 1 function calls. This class has datastore and MdaEfsm objects.
* @author Anand N
* @Date 05/01/2016
*/
public class Account1 {
	
	static final int thresholdBalanceForPenalty = 500;
	static final int thresholdAttempts = 3;
	public MDA_EFSM me = null;
	public DataStore ds = null;	
	
	public Account1(MDA_EFSM me,DataStore ds) 
	{
        this.me = me;
        this.ds = ds;
    }

	public void open (String p, String y, float a) { 
		////System.out.println("Account1>>open()");
		((DS1)ds).setTemp_p(p);
		((DS1)ds).setTemp_y(y);
		((DS1)ds).setTemp_a(a);
		me.open();
		////System.out.println("Account1<<open()");
	} 
	
	public void pin (String x) { 
		////System.out.println("Account1>>pin()");
		if(!x.equalsIgnoreCase(((DS1)ds).getTemp_p())){
			me.IncorrectPin(thresholdAttempts);
		}
		if (x!= null && x.equalsIgnoreCase(((DS1)ds).getTemp_p())) { 
			if (((DS1)ds).getTemp_a() > thresholdBalanceForPenalty) {
				me.CorrectPinAboveMin();
			}else{
				me.CorrectPinBelowMin();
			}
		}
		//System.out.println("Account1<<pin()");
	} 
	
	public void deposit (float d) { 
		//System.out.println("Account1>>deposit()");
		((DS1)ds).setTemp_d(d);
		me.Deposit(); 
		if (((DS1)ds).getTemp_a() > thresholdBalanceForPenalty){
			me.AboveMinBalance();
		}
		else{
			me.BelowMinBalance(); 
		}
		//System.out.println("Account1<<deposit()");
	} 
	
	public void withdraw (float w) { 
		//System.out.println("Account1>>withdraw()");
		((DS1)ds).setTemp_w(w);
		me.withdraw();
		if ((((DS1)ds).getTemp_a()) > thresholdBalanceForPenalty) {
			me.AboveMinBalance(); 
		}
		else {
			me.WithdrawBelowMinBalance(); 
		}
		//System.out.println("Account1<<withdraw()");
	} 
	
	public void balance() {
		//System.out.println("Account1>>balance()");
		me.balance();
		//System.out.println("Account1<<balance()");
	} 
	
	public void login (String y) { 
		//System.out.println("Account1>>login()");
		if (y != null && y.equalsIgnoreCase(((DS1)ds).getUid())){
			me.Login();
		} 
		else{
			me.IncorrectLogin(); 
		}
		//System.out.println("Account1<<login()");
	} 
	
	public void logout() {
		//System.out.println("Account1>>logout()");
		me.Logout();
		//System.out.println("Account1<<logout()");
	} 
	
	public void lock (String x) { 
		//System.out.println("Account1>>lock()");
		if (x.equalsIgnoreCase(((DS1)ds).getPin())) {
			me.lock();
		}
		else {
			me.IncorrectLock();
		}
		//System.out.println("Account1<<lock()");
	} 
	public void unlock (String x) { 
		//System.out.println("Account1>>unlock()");
		if (x.equalsIgnoreCase(((DS1)ds).getPin())) { 
			me.unlock();
			if ((((DS1)ds).getTemp_a()) > thresholdBalanceForPenalty){
				me.AboveMinBalance();
			} 
			else me.BelowMinBalance(); 
		} 
			else {
				me.IncorrectUnlock();  
			}
		//System.out.println("Account1<<unlock()");
	}
		
}
