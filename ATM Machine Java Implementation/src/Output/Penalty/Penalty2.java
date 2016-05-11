package Output.Penalty;

import DataStore.DS2;
import DataStore.DataStore;

public class Penalty2 extends Penalty{

	@Override
	public
	void penalty(DataStore ds) {
		((DS2)ds).applyPenalty();
		System.out.println("Account2>> No penalty Applied. Balance = " + ((DS2)ds).getBalance());
	}

}
