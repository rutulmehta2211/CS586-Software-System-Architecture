package StrategyClasses.IncorrectLockMsg;

import DataClasses.Data;

//IncorrectLockMsg Abstract class
public abstract class IncorrectLockMsg {
    Data data;
    
    public IncorrectLockMsg(Data data){
        this.data = data;
    }

    public abstract void IncorrectLockMsg();
}
