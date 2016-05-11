package Input;

import DataStore.DS2;
import DataStore.DataStore;
import MDA_EFSM.MDA_EFSM;

/**
* Account 2 function calls. This class has datastore and MdaEfsm objects.
* @author Anand N
* @Date 05/01/2016
*/
public class Account2 {
	
	static final int thresholdBalanceForPenalty = 0;
	static final int thresholdAttempts = 2;
	MDA_EFSM me = null;
	DataStore ds = null;	
	
	public Account2(MDA_EFSM me,DataStore ds) 
	{
        this.me = me;
        this.ds = ds;
    }
	
	public void OPEN (int p, int y, int a) { 
		((DS2)ds).setTemp_p(p);
		((DS2)ds).setTemp_y(y);
		((DS2)ds).setTemp_a(a);
		me.open();
	} 
	
	public void PIN (int x) { 
		//System.out.println("Account2>>PIN()");
		if(!(x == ((DS2)ds).getTemp_p())){
			me.IncorrectPin(thresholdAttempts);
		}else{
			me.CorrectPinAboveMin();
		}
		//System.out.println("Account2<<PIN()");
	} 
	
	public void DEPOSIT (int d) { 
		//System.out.println("Account2>>DEPOSIT()");
		((DS2)ds).setTemp_d(d);
		me.Deposit(); 
		//System.out.println("Account2<<DEPOSIT()");
	} 
	
	public void WITHDRAW (int w) { 
		//System.out.println("Account2>>WITHDRAW()");
		((DS2)ds).setTemp_w(w);
		if ((((DS2)ds).getTemp_a()) > thresholdBalanceForPenalty) {
			me.withdraw(); 
		}
		else{
			me.Nofunds();
		}
		//System.out.println("Account2<<WITHDRAW()");
	} 
	
	public void BALANCE() {
		//System.out.println("Account2>>BALANCE()");
		me.balance();
		//System.out.println("Account2<<BALANCE()");
	} 
	
	public void LOGIN (int y) { 
		//System.out.println("Account2>>LOGIN()");
		if (y == (((DS2)ds).getUid())){
			me.Login();
		} 
		else{
			me.IncorrectLogin(); 
		} 
		//System.out.println("Account2<<LOGIN()");
	}
	
	public void LOGOUT() {
		//System.out.println("Account2>>LOGOUT()");
		me.Logout();
		//System.out.println("Account2<<LOGOUT()");
	}
	
	public void suspend () { 
		//System.out.println("Account2>>suspend()");
		me.Suspend(); 
		//System.out.println("Account2<<suspend()");
	} 
	
	public void activate () { 
		//System.out.println("Account2>>activate()");
		me.Activate(); 
		//System.out.println("Account2<<activate()");
	} 
	
	public void close () { 
		//System.out.println("Account2>>close()");
		me.close();     
		//System.out.println("Account2<<close()");
	} 
}
