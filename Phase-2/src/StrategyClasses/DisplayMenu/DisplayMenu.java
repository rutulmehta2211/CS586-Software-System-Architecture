package StrategyClasses.DisplayMenu;

import DataClasses.Data;

public abstract class DisplayMenu {
    Data data;
    
    public DisplayMenu(Data data){
        this.data = data;
    }

    public abstract void DisplayMenu();
}
