package Output.MakeWithdraw;

import DataStore.DS1;
import DataStore.DataStore;

public class MakeWithdraw1 extends MakeWithdraw{

	@Override
	public
	void makeWithdraw(DataStore ds) {
		((DS1)ds).withdraw();
		System.out.println("Account1>> Balance After Withdraw = " + ((DS1)ds).getBalance());
	}

}
