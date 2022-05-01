package StrategyClasses.NoFundsMsg;

import DataClasses.Data;

//NoFundsMsg Abstract Class.
public abstract class NoFundsMsg {
    Data data;
    
    public NoFundsMsg(Data data){
        this.data = data;
    }

    public abstract void NoFundsMsg();
}
