package StrategyClasses.IncorrectIdMsg;

import DataClasses.Data;

////IncorrectIdMsg2 class belongs to Account-2
public class IncorrectIdMsg2 extends IncorrectIdMsg{

    public IncorrectIdMsg2(Data data) {
        super(data);
    }

    /**
     * This method display incorrect ID message for Account-2
     */
    @Override
    public void IncorrectIdMsg() {
        System.out.println("");
		System.out.println(">>>> InCorrect UserId !!! Try Again");
		System.out.println("");
    }
    
}
