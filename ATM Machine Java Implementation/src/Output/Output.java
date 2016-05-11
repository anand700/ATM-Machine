package Output;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore;
import MDA_EFSM.MDA_EFSM;
import Output.DisplayBalance.DisplayBalance;
import Output.DisplayMenu.DisplayMenu;
import Output.IncorrectIdMsg.IncorrectIdMsg;
import Output.IncorrectLockMsg.IncorrectLockMsg;
import Output.IncorrectPinMsg.IncorrectPinMsg;
import Output.IncorrectUnlockMsg.IncorrectUnlockMsg;
import Output.MakeDeposit.MakeDeposit;
import Output.MakeWithdraw.MakeWithdraw;
import Output.NoFundsMsg.NoFundMsg;
import Output.Penalty.Penalty;
import Output.PromptForPin.PromptForPin;
import Output.StoreData.StoreData;
import Output.TooManyAttemptsMsg.TooManyAttemptsMsg;

/**
* Consists of all the actions. Helps to displays output on to the screen.  
* @author Anand N
* @Date 05/01/2016
*/
public class Output {
	
	public DataStore ds = null;
	public AbstractFactory af = null;
	public MDA_EFSM me = null;
	public Output(DataStore ds, AbstractFactory af){
		this.af = af;
		this.ds = ds;
	}
	
	public void displayBalance(){
		//System.out.println("Output>> displayBalance()");
		DisplayBalance dpObj = af.createDisplayBalanceObj();
		dpObj.displayBalance(ds);
		//System.out.println("Output<< displayBalance()");
	}
	
	public void displayMenu(){
		//System.out.println("Output>> displayMenu()");
		DisplayMenu dmObj = af.createDisplayMenuObj();
		dmObj.displayMenu();
		//System.out.println("Output<< displayMenu()");
	}
	
	public void incorrectIdMsg(){
		//System.out.println("Output>> incorrectIdMsg()");
		IncorrectIdMsg iimObj = af.createIncorrectIdMsgObj();
		iimObj.incorrectIdMsg();
		//System.out.println("Output<< incorrectIdMsg()");
	}
	
	public void incorrectLockMsg(){
		//System.out.println("Output>> incorrectLockMsg()");
		IncorrectLockMsg ilmObj = af.createIncorrectLockMsgObj();
		ilmObj.incorrectLockMsg();
		//System.out.println("Output<< incorrectLockMsg()");
	}
	
	public void incorrectPinMsg(){
		//System.out.println("Output>> incorrectPinMsg()");
		IncorrectPinMsg ipmObj = af.createIncorrectPinMsgObj();
		ipmObj.incorrectPinMsg();
		//System.out.println("Output<< incorrectPinMsg()");
	}
	
	public void incorrectUnLockMsg(){
		//System.out.println("Output>> incorrectUnLockMsg()");
		IncorrectUnlockMsg iumObj = af.createIncorrectUnlockMsgObj();
		iumObj.incorrectUnlockMsg();
		//System.out.println("Output<< incorrectUnLockMsg()");
	}
	
	public void makeDeposit(){
		//System.out.println("Output>> makeDeposit(ds)");
		MakeDeposit mdObj = af.createMakeDepositObj();
		mdObj.makeDeposit(ds);
		//System.out.println("Output<< makeDeposit(ds)");
	}
	
	public void makeWithdraw(){
		//System.out.println("Output>> makeWithdraw(ds)");
		MakeWithdraw mwObj = af.createMakeWithdrawObj();
		mwObj.makeWithdraw(ds);
		//System.out.println("Output<< makeWithdraw(ds)");
	}
	
	public void noFundMsg(){
		//System.out.println("Output>> noFundMsg()");
		NoFundMsg nfmObj = af.createNoFundsMsgObj();
		nfmObj.noFundsMsg();
		//System.out.println("Output<< noFundMsg()");
	}
	
	public void penalty(){
		//System.out.println("Output>> penalty()");
		Penalty pObj = af.createPenaltyObj();
		pObj.penalty(ds);
		//System.out.println("Output<< penalty()");
	}
	
	public void promptForPin(){
		//System.out.println("Output>> promptForPin()");
		PromptForPin pfpObj = af.createPromptForPinObj();
		pfpObj.promptForPin();
		//System.out.println("Output<< promptForPin()");
	}
	
	public void storeData(){
		//System.out.println("Output>> storeData()");
		StoreData sdObj = af.createStoreDataObj();
		sdObj.storeData(ds);
		//System.out.println("Output<< storeData()");
	}
	
	public void tooManyAttemptsMsg(){
		//System.out.println("Output>> tooManyAttemptsMsg()");
		TooManyAttemptsMsg tmaObj = af.createTooManyAttemptsMsgObj();
		tmaObj.tooManyAttemptsMsg();
		//System.out.println("Output<< tooManyAttemptsMsg()");
	}
	
}



