package StrategyClasses.IncorrectIdMsg;

import DataClasses.Data;

//IncorrectIdMsg1 class belongs to Account-1
public class IncorrectIdMsg1 extends IncorrectIdMsg{

    public IncorrectIdMsg1(Data data) {
        super(data);
    }
    
    //This method display incorrect ID message for Account-1
    @Override
    public void IncorrectIdMsg() {
        System.out.println("");
		System.out.println(">>>> InCorrect UserId !!! Try Again");
		System.out.println("");
    }
    
}
