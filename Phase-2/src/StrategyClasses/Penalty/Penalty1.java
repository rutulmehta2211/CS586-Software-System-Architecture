package StrategyClasses.Penalty;

import DataClasses.Data;
import DataClasses.Data1;

public class Penalty1 extends Penalty{

    public Penalty1(Data data) {
        super(data);
    }

    //$15 penalty is applied when user's account balance is below $100 for Account-1.
    @Override
    public void Penalty() {
        Data1 data1 = (Data1)data;
        int balance = data1.get_balance();
        if(balance <=100){
            data1.set_balance(balance-15);
        }
        else{
            data1.set_balance(balance);
        }
        System.out.println("");
		System.out.println(">>>> $15 Penalty is applied !!");
		System.out.println("");
    }
    
}
