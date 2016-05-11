package Output.MakeWithdraw;

import DataStore.DS2;
import DataStore.DataStore;

public class MakeWithdraw2 extends MakeWithdraw{

	@Override
	public
	void makeWithdraw(DataStore ds) {
		((DS2)ds).withdraw();
		System.out.println("Account2>> Balance After Withdraw = " + ((DS2)ds).getBalance());
	}

}
