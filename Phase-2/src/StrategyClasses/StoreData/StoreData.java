package StrategyClasses.StoreData;

import DataClasses.Data;

//StoreData Abstract Class.
public abstract class StoreData {
    Data data;

    public StoreData(Data data){
        this.data=data;
    }
    public abstract void StoreData();
}
