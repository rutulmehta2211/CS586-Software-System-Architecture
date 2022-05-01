package StrategyClasses.DisplayBalance;

import DataClasses.Data;
import DataClasses.Data1;

//DisplayBalance1 class belongs to Account-2
public class DisplayBalance1 extends DisplayBalance{

    public DisplayBalance1(Data data) {
        super(data);
    }

    /**
     * This method display balance for Account-1.
     */
    @Override
    public void DisplayBalance() {
        Data1 data1 = (Data1)data;
        System.out.println("");
		System.out.println(">>>> Your Account Balance is: "+data1.get_balance());
		System.out.println("");
    }
    
}
