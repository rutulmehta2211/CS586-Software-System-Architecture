package StrategyClasses.IncorrectLockMsg;

import DataClasses.Data;

//IncorrectLockMsg1 class belongs to Accounut-1
public class IncorrectLockMsg1 extends IncorrectLockMsg{

    public IncorrectLockMsg1(Data data) {
        super(data);
    }

    //This method incorrect lock message for Account-1
    @Override
    public void IncorrectLockMsg() {
        System.out.println("");
		System.out.println(">>>> Account is not locked due to InCorrect Pin !!! Try Again");
		System.out.println("");
    }
    
}
