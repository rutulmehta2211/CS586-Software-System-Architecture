package StrategyClasses.Penalty;

import DataClasses.Data;

//Penalty Abstract Class.
public abstract class Penalty {
    Data data;
    
    public Penalty(Data data){
        this.data = data;
    }

    public abstract void Penalty();
}
