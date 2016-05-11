package AbstractFactory;

import DataStore.*;
import Output.DisplayBalance.*;
import Output.DisplayMenu.*;
import Output.IncorrectIdMsg.*;
import Output.IncorrectLockMsg.*;
import Output.IncorrectPinMsg.*;
import Output.IncorrectUnlockMsg.*;
import Output.MakeDeposit.*;
import Output.MakeWithdraw.*;
import Output.NoFundsMsg.*;
import Output.Penalty.*;
import Output.PromptForPin.*;
import Output.StoreData.*;
import Output.TooManyAttemptsMsg.*;

/**
* Creates objects required for Account 1. It extends the AbstractFactory Class. 
* @author Anand N
* @Date 05/01/2016
*/
public class A1Factory extends AbstractFactory{
	
	DataStore ds = new DS1();
	DisplayBalance db = new DisplayBalance1();
	DisplayMenu dm = new DisplayMenu1();
	IncorrectPinMsg ipm = new IncorrectPinMsg1();
	MakeDeposit md = new MakeDeposit1();
	MakeWithdraw mw = new MakeWithdraw1();
	Penalty p = new Penalty1();
	PromptForPin pfp = new PromptForPin1();
	TooManyAttemptsMsg tam = new TooManyAttemptsMsg1();
	IncorrectIdMsg iim = new IncorrectIdMsg1();
	IncorrectUnlockMsg ium = new IncorrectUnlockMsg1();
	NoFundMsg nf = new NoFundMsg1();
	IncorrectLockMsg ilm = new IncorrectLockMsg1();
	StoreData sd = new StoreData1();
	
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		return this.ds;
	}

	@Override
	public DataStore createDataStoreObj() {
		// TODO Auto-generated method stub
		return this.ds;
	}

	@Override
	public DisplayBalance createDisplayBalanceObj() {
		// TODO Auto-generated method stub
		return this.db;
	}

	@Override
	public DisplayMenu createDisplayMenuObj() {
		// TODO Auto-generated method stub
		return this.dm;
	}

	@Override
	public IncorrectIdMsg createIncorrectIdMsgObj() {
		// TODO Auto-generated method stub
		return this.iim;
	}

	@Override
	public IncorrectLockMsg createIncorrectLockMsgObj() {
		// TODO Auto-generated method stub
		return this.ilm;
	}

	@Override
	public IncorrectPinMsg createIncorrectPinMsgObj() {
		// TODO Auto-generated method stub
		return this.ipm;
	}

	@Override
	public IncorrectUnlockMsg createIncorrectUnlockMsgObj() {
		// TODO Auto-generated method stub
		return this.ium;
	}

	@Override
	public MakeDeposit createMakeDepositObj() {
		// TODO Auto-generated method stub
		return this.md;
	}

	@Override
	public MakeWithdraw createMakeWithdrawObj() {
		// TODO Auto-generated method stub
		return this.mw;
	}

	@Override
	public TooManyAttemptsMsg createTooManyAttemptsMsgObj() {
		// TODO Auto-generated method stub
		return this.tam;
	}

	@Override
	public NoFundMsg createNoFundsMsgObj() {
		// TODO Auto-generated method stub
		return this.nf;
	}

	@Override
	public Penalty createPenaltyObj() {
		// TODO Auto-generated method stub
		return this.p;
	}

	@Override
	public PromptForPin createPromptForPinObj() {
		// TODO Auto-generated method stub
		return this.pfp;
	}

	@Override
	public StoreData createStoreDataObj() {
		// TODO Auto-generated method stub
		return this.sd;
	}

}

