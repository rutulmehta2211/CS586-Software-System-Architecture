package StrategyClasses.PromptForPin;

import DataClasses.Data;

//PromptForPin Abstract Class.
public abstract class PromptForPin {
    Data data;
    
    public PromptForPin(Data data){
        this.data = data;
    }

    public abstract void PromptForPin();
}
