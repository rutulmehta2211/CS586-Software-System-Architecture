package StrategyClasses.DisplayBalance;

import DataClasses.Data;

//Abstract Class DisplayBalance
public abstract class DisplayBalance {
    Data data;

    public DisplayBalance(Data data){
        this.data = data;
    }

    public abstract void DisplayBalance();
}
