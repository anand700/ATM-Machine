package Output.Penalty;

import DataStore.DS1;
import DataStore.DataStore;

public class Penalty1 extends Penalty{

	@Override
	public
	void penalty(DataStore ds) {
		((DS1)ds).applyPenalty();
		System.out.println("Account1>> Penalty of 20$ applied since balance is below 500$. Balance After Penalty = " + ((DS1)ds).getBalance());
	}

}
