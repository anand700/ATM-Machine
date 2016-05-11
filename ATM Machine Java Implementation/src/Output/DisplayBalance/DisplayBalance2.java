package Output.DisplayBalance;

import DataStore.DS2;
import DataStore.DataStore;

public class DisplayBalance2 extends DisplayBalance{

	@Override
	public
	void displayBalance(DataStore ds) {
		System.out.println("Balance in Account2 : " + ((DS2)ds).getBalance());
	}

}

