package Output.MakeDeposit;

import DataStore.*;

public class MakeDeposit2 extends MakeDeposit{

	@Override
	public
	void makeDeposit(DataStore ds) {
		((DS2)ds).deposit();
		System.out.println("Account2>> Balance After Deposit = " + ((DS2)ds).getBalance());
	}

}
