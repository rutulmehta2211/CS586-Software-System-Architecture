package StrategyClasses.IncorrectIdMsg;

import DataClasses.Data;

//IncorrectIdMsg Abstract class
public abstract class IncorrectIdMsg {
    Data data;
    public IncorrectIdMsg(Data data){
        this.data = data;
    }

    public abstract void IncorrectIdMsg();
}
