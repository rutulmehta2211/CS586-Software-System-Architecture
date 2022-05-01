package StrategyClasses.TooManyAttemptsMsg;

import DataClasses.Data;

public class TooManyAttemptsMsg1 extends TooManyAttemptsMsg{

    public TooManyAttemptsMsg1(Data data) {
        super(data);
    }

    //This method display message when Maximum limit for Incorrect pin is exceeded for Account-1.
    @Override
    public void TooManyAttemptsMsg() {
        System.out.println("");
		System.out.println(">>>> Maximum limit for Incorrect pin is exceeded !!");
		System.out.println("");
    }
    
}
