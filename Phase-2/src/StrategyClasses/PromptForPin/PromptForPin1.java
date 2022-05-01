package StrategyClasses.PromptForPin;

import DataClasses.Data;

public class PromptForPin1 extends PromptForPin{

    public PromptForPin1(Data data) {
        super(data);
    }

    //Prompt message to enter pin is appeared after successful login for Account-1. 
    @Override
    public void PromptForPin() {
        System.out.println(">>>> Available Options: ");
        System.out.print("\n");
        System.out.print("1. Pin(int)");
        System.out.print("\n");
    }
}
