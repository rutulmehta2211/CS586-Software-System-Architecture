package StrategyClasses.MakeDeposit;

import DataClasses.Data;
import DataClasses.Data1;

public class MakeDeposit1 extends MakeDeposit {

    public MakeDeposit1(Data data) {
        super(data);
    }

    //This method performs deposit operation for Account-1.
    @Override
    public void MakeDeposit() {
        Data1 data1 = (Data1)data;
        int deposit = data1.get_temp_d();
        data1.set_balance(data1.get_balance()+deposit);
        System.out.println("");
		System.out.println(">>>> Amount is deposited successfully !!");
		System.out.println("");
    }
}
