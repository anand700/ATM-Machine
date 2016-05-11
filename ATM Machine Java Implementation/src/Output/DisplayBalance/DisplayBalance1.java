package Output.DisplayBalance;

import DataStore.DS1;
import DataStore.DataStore;

public class DisplayBalance1 extends DisplayBalance{

	@Override
	public
	void displayBalance(DataStore ds) {
		System.out.println("Balance in Account1 : " + ((DS1)ds).getBalance());
	}

}

