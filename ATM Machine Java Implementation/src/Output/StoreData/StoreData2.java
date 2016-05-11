package Output.StoreData;

import DataStore.DS2;
import DataStore.DataStore;

public class StoreData2 extends StoreData{

	@Override
	public
	void storeData(DataStore ds) {
		((DS2)ds).setPin();
		System.out.println("Account2>> Pin is set as = " + ((DS2)ds).getPin());
	}

}
