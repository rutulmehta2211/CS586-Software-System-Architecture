package StrategyClasses.MakeDeposit;

import DataClasses.Data;
import DataClasses.Data2;

public class MakeDeposit2 extends MakeDeposit{

    public MakeDeposit2(Data data) {
        super(data);
    }

    //This method performs deposit operation for Account-2.
    @Override
    public void MakeDeposit() {
        Data2 data2 = (Data2)data;
        float deposit = data2.get_temp_d();
        data2.set_balance(data2.get_balance()+deposit);
        System.out.println("");
		System.out.println(">>>> Amount is deposited successfully !!");
		System.out.println("");
    } 
}
