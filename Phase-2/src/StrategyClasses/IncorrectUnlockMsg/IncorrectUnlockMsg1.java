package StrategyClasses.IncorrectUnlockMsg;

import DataClasses.Data;

public class IncorrectUnlockMsg1 extends IncorrectUnlockMsg{

    public IncorrectUnlockMsg1(Data data) {
        super(data);
    }

    //This method display incorrect unlock message for Account-1.
    @Override
    public void IncorrectUnlockMsg() {
        System.out.println("");
		System.out.println(">>>> Account unlock is not possible due to InCorrect Pin !!! Try Again");
		System.out.println("");
    }    
}
