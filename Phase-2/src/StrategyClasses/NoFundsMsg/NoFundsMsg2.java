package StrategyClasses.NoFundsMsg;

import DataClasses.Data;

public class NoFundsMsg2 extends NoFundsMsg{

    public NoFundsMsg2(Data data) {
        super(data);
    }

    //This method display no fund alert message for Account-2.
    @Override
    public void NoFundsMsg() {
        System.out.println("");
		System.out.println(">>>> No fund Available in the Account !!!");
		System.out.println("");
    }
    
}
