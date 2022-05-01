package StrategyClasses.MakeWithdraw;

import DataClasses.Data;

//MakeWithdraw Abstract Class.
public abstract class MakeWithdraw {
    Data data;
    
    public MakeWithdraw(Data data){
        this.data = data;
    }

    public abstract void MakeWithdraw();
}
