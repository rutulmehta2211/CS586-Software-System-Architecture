package AbstractFactoryClasses;

import DataClasses.Data;
import DataClasses.Data1;
import StrategyClasses.DisplayBalance.DisplayBalance;
import StrategyClasses.DisplayBalance.DisplayBalance1;
import StrategyClasses.DisplayMenu.DisplayMenu;
import StrategyClasses.DisplayMenu.DisplayMenu1;
import StrategyClasses.IncorrectIdMsg.IncorrectIdMsg;
import StrategyClasses.IncorrectIdMsg.IncorrectIdMsg1;
import StrategyClasses.IncorrectLockMsg.IncorrectLockMsg;
import StrategyClasses.IncorrectLockMsg.IncorrectLockMsg1;
import StrategyClasses.IncorrectPinMsg.IncorrectPinMsg;
import StrategyClasses.IncorrectPinMsg.IncorrectPinMsg1;
import StrategyClasses.IncorrectUnlockMsg.IncorrectUnlockMsg;
import StrategyClasses.IncorrectUnlockMsg.IncorrectUnlockMsg1;
import StrategyClasses.MakeDeposit.MakeDeposit;
import StrategyClasses.MakeDeposit.MakeDeposit1;
import StrategyClasses.MakeWithdraw.MakeWithdraw;
import StrategyClasses.MakeWithdraw.MakeWithdraw1;
import StrategyClasses.NoFundsMsg.NoFundsMsg;
import StrategyClasses.NoFundsMsg.NoFundsMsg1;
import StrategyClasses.Penalty.Penalty;
import StrategyClasses.Penalty.Penalty1;
import StrategyClasses.PromptForPin.PromptForPin;
import StrategyClasses.PromptForPin.PromptForPin1;
import StrategyClasses.StoreData.StoreData;
import StrategyClasses.StoreData.StoreData1;
import StrategyClasses.TooManyAttemptsMsg.TooManyAttemptsMsg;
import StrategyClasses.TooManyAttemptsMsg.TooManyAttemptsMsg1;

/**
 * This is child class of the "AbstractFectory" class.
 */
public class ConcreteFactory1 extends AbstractFactory{

    //Create object of the Data1 class.
    public final Data1 data1;

    //Constructor of the ConcreteFactory1 class where Data1 class is Initialized.
    public ConcreteFactory1(){
        data1 = new Data1();
    }

    //return Data1.
    @Override
    public Data getData() {
        return data1;
    }

    //return StoreData1.
    @Override
    public StoreData getStoreData() {
        return new StoreData1(this.data1);
    }

    //return IncorrectIdMsg1
    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        return new IncorrectIdMsg1(this.data1);
    }

    //return IncorrectPinMsg1
    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        return new IncorrectPinMsg1(this.data1);
    }

    //return TooManyAttemptsMsg1
    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        return new TooManyAttemptsMsg1(this.data1);
    }

    //return DisplayMenu1
    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1(this.data1);
    }

    //return MakeDeposit1
    @Override
    public MakeDeposit getMakeDeposit() {
        return new MakeDeposit1(this.data1);
    }

    //return DisplayBalance1
    @Override
    public DisplayBalance getDisplayBalance() {
        return new DisplayBalance1(this.data1);
    }

    //return PromptForPin1
    @Override
    public PromptForPin getPromptForPin() {
        return new PromptForPin1(this.data1);
    }

    //return MakeWithdraw1
    @Override
    public MakeWithdraw getMakeWithdraw() {
        return new MakeWithdraw1(this.data1);
    }

    //return Penalty1
    @Override
    public Penalty getPenalty() {
        return new Penalty1(this.data1);
    }

    //return IncorrectLockMsg1
    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        return new IncorrectLockMsg1(this.data1);
    }

    //return IncorrectUnlockMsg1
    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        return new IncorrectUnlockMsg1(this.data1);
    }

    //return NoFundsMsg1
    @Override
    public NoFundsMsg getNoFundsMsg() {
        return new NoFundsMsg1(this.data1);
    }
    
}
