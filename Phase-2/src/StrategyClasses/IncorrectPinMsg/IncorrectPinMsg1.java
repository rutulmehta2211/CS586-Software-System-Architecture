package StrategyClasses.IncorrectPinMsg;

import DataClasses.Data;

public class IncorrectPinMsg1 extends IncorrectPinMsg{

    public IncorrectPinMsg1(Data data) {
        super(data);
    }

    //This method display incorrect Pin message for Account-1
    @Override
    public void IncorrectPinMsg() {
        System.out.println("");
		System.out.println(">>>> InCorrect Pin !!! Try Again");
		System.out.println("");
    }
}
