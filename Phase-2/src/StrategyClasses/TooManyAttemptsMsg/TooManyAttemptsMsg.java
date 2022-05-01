package StrategyClasses.TooManyAttemptsMsg;

import DataClasses.Data;

//TooManyAttemptsMsg Abstract Class.
public abstract class TooManyAttemptsMsg {
    Data data;
    
    public TooManyAttemptsMsg(Data data){
        this.data = data;
    }

    public abstract void TooManyAttemptsMsg();
}
