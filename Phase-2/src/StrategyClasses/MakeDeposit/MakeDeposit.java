package StrategyClasses.MakeDeposit;

import DataClasses.Data;

//MakeDeposit Abstract Class
public abstract class MakeDeposit {
    Data data;
    
    public MakeDeposit(Data data){
        this.data = data;
    }

    public abstract void MakeDeposit();
}
