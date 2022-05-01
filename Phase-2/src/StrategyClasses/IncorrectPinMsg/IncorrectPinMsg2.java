package StrategyClasses.IncorrectPinMsg;

import DataClasses.Data;

public class IncorrectPinMsg2 extends IncorrectPinMsg{

    public IncorrectPinMsg2(Data data) {
        super(data);
    }

    //This method display incorrect Pin message for Account-2.
    @Override
    public void IncorrectPinMsg() {
        System.out.println("");
		System.out.println(">>>> InCorrect Pin !!! Try Again");
		System.out.println("");
    }
    
}
