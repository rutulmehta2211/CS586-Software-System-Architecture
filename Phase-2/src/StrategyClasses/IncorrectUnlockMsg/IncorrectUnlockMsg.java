package StrategyClasses.IncorrectUnlockMsg;

import DataClasses.Data;

//IncorrectUnlockMsg Abstract class.
public abstract class IncorrectUnlockMsg {
    Data data;
    
    public IncorrectUnlockMsg(Data data){
        this.data = data;
    }

    public abstract void IncorrectUnlockMsg();
}
