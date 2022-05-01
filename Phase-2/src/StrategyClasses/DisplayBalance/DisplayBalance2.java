package StrategyClasses.DisplayBalance;

import DataClasses.Data;
import DataClasses.Data2;

//DisplayBalance2 class belongs to Account-2
public class DisplayBalance2 extends DisplayBalance{

    public DisplayBalance2(Data data) {
        super(data);
    }

    /**
     * This method display balance for Account-2.
     */
    @Override
    public void DisplayBalance() {
        Data2 data2 = (Data2)data;
        System.out.println("");
		System.out.println(">>>> Your Account Balance is: "+data2.get_balance());
		System.out.println("");
    }    
}
