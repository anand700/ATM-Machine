package Output.StoreData;

import DataStore.DS1;
import DataStore.DataStore;

public class StoreData1 extends StoreData{

	@Override
	public
	void storeData(DataStore ds) {
		((DS1)ds).setPin();
		System.out.println("Account1>> Pin is set as = " + ((DS1)ds).getPin());
	}

}
