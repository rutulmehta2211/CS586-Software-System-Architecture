package StrategyClasses.IncorrectPinMsg;

import DataClasses.Data;

//IncorrectPinMsg Abstract class.
public abstract class IncorrectPinMsg{
    Data data;
    
    public IncorrectPinMsg(Data data){
        this.data = data;
    }

    public abstract void IncorrectPinMsg();
}
