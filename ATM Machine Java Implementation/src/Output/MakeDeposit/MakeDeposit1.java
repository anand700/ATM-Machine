package Output.MakeDeposit;

import DataStore.*;

public class MakeDeposit1 extends MakeDeposit{

	@Override
	public
	void makeDeposit(DataStore ds) {
		((DS1)ds).deposit();
		System.out.println("Account1>> Balance After Deposit = " + ((DS1)ds).getBalance());
	}

}
