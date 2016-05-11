package AbstractFactory;

import DataStore.DataStore;
import Output.DisplayBalance.*;
import Output.DisplayMenu.*;
import Output.IncorrectIdMsg.*;
import Output.IncorrectLockMsg.*;
import Output.IncorrectPinMsg.*;
import Output.IncorrectUnlockMsg.*;
import Output.MakeDeposit.*;
import Output.MakeWithdraw.*;
import Output.TooManyAttemptsMsg.*;
import Output.NoFundsMsg.*;
import Output.Penalty.*;
import Output.PromptForPin.*;
import Output.StoreData.*;

/**
* This is a Abstract Factory class which has all the abstract methods. This class is extended by the A1Factory and A2Factory class which implements all the methods in its own way.
* @author Anand N
* @Date 05/01/2016
*/
public abstract class AbstractFactory {
	abstract public DataStore createDataStoreObj();
	abstract public DisplayBalance createDisplayBalanceObj();
	abstract public DisplayMenu createDisplayMenuObj();
	abstract public IncorrectIdMsg createIncorrectIdMsgObj();
	abstract public IncorrectLockMsg createIncorrectLockMsgObj();
	abstract public IncorrectPinMsg createIncorrectPinMsgObj();
	abstract public IncorrectUnlockMsg createIncorrectUnlockMsgObj();
	abstract public MakeDeposit createMakeDepositObj();
	abstract public MakeWithdraw createMakeWithdrawObj();
	abstract public TooManyAttemptsMsg createTooManyAttemptsMsgObj();
	abstract public NoFundMsg createNoFundsMsgObj();
	abstract public Penalty createPenaltyObj();
	abstract public PromptForPin createPromptForPinObj();
	abstract public StoreData createStoreDataObj();
	
}


