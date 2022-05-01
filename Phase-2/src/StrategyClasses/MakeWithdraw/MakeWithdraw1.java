package StrategyClasses.MakeWithdraw;

import DataClasses.Data;
import DataClasses.Data1;

public class MakeWithdraw1 extends MakeWithdraw{

    public MakeWithdraw1(Data data) {
        super(data);
    }

    //This method performs withdraw operation for Account-1.
    @Override
    public void MakeWithdraw() {
        Data1 data1 = (Data1)data;
        int withdraw = data1.get_temp_w();
        data1.set_balance(data1.get_balance()-withdraw);
        System.out.println("");
		System.out.println(">>>> Amount is withdrawed successfully !!");
		System.out.println("");
    }
    
}
