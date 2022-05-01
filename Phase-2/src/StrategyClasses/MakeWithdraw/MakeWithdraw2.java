package StrategyClasses.MakeWithdraw;

import DataClasses.Data;
import DataClasses.Data2;

public class MakeWithdraw2 extends MakeWithdraw{

    public MakeWithdraw2(Data data) {
        super(data);
    }

    //This method performs withdraw operation for Account-2.
    @Override
    public void MakeWithdraw() {
        Data2 data2 = (Data2)data;
        float withdraw = data2.get_temp_w();
        data2.set_balance(data2.get_balance()-withdraw);
        System.out.println("");
		System.out.println(">>>> Amount is withdrawed successfully !!");
		System.out.println("");
    }
}
