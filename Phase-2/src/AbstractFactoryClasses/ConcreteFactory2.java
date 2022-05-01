package AbstractFactoryClasses;

import DataClasses.Data;
import DataClasses.Data2;
import StrategyClasses.DisplayBalance.DisplayBalance;
import StrategyClasses.DisplayBalance.DisplayBalance2;
import StrategyClasses.DisplayMenu.DisplayMenu;
import StrategyClasses.DisplayMenu.DisplayMenu2;
import StrategyClasses.IncorrectIdMsg.IncorrectIdMsg;
import StrategyClasses.IncorrectIdMsg.IncorrectIdMsg2;
import StrategyClasses.IncorrectLockMsg.IncorrectLockMsg;
import StrategyClasses.IncorrectLockMsg.IncorrectLockMsg2;
import StrategyClasses.IncorrectPinMsg.IncorrectPinMsg;
import StrategyClasses.IncorrectPinMsg.IncorrectPinMsg2;
import StrategyClasses.IncorrectUnlockMsg.IncorrectUnlockMsg;
import StrategyClasses.IncorrectUnlockMsg.IncorrectUnlockMsg2;
import StrategyClasses.MakeDeposit.MakeDeposit;
import StrategyClasses.MakeDeposit.MakeDeposit2;
import StrategyClasses.MakeWithdraw.MakeWithdraw;
import StrategyClasses.MakeWithdraw.MakeWithdraw2;
import StrategyClasses.NoFundsMsg.NoFundsMsg;
import StrategyClasses.NoFundsMsg.NoFundsMsg2;
import StrategyClasses.Penalty.Penalty;
import StrategyClasses.Penalty.Penalty2;
import StrategyClasses.PromptForPin.PromptForPin;
import StrategyClasses.PromptForPin.PromptForPin2;
import StrategyClasses.StoreData.StoreData;
import StrategyClasses.StoreData.StoreData2;
import StrategyClasses.TooManyAttemptsMsg.TooManyAttemptsMsg;
import StrategyClasses.TooManyAttemptsMsg.TooManyAttemptsMsg2;

public class ConcreteFactory2 extends AbstractFactory{

    //Create object of the Data2 class.
    public final Data2 data2;

    //Constructor of the ConcreteFactory2 class where Data2 class is Initialized.
    public ConcreteFactory2(){
        data2 = new Data2();
    }

    //return Data2.
    @Override
    public Data getData() {
        return data2;
    }

    //return StoreData2.
    @Override
    public StoreData getStoreData() {
        return new StoreData2(this.data2);
    }

    //return IncorrectIdMsg2
    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        return new IncorrectIdMsg2(this.data2);
    }

    //return IncorrectPinMsg2
    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        return new IncorrectPinMsg2(this.data2);
    }

    //return TooManyAttemptsMsg2
    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        return new TooManyAttemptsMsg2(this.data2);
    }

    //return DisplayMenu2
    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu2(this.data2);
    }

    //return MakeDeposit2
    @Override
    public MakeDeposit getMakeDeposit() {
        return new MakeDeposit2(this.data2);
    }

    //return DisplayBalance2
    @Override
    public DisplayBalance getDisplayBalance() {
        return new DisplayBalance2(this.data2);
    }

    //return PromptForPin2
    @Override
    public PromptForPin getPromptForPin() {
        return new PromptForPin2(this.data2);
    }

    //return MakeWithdraw2
    @Override
    public MakeWithdraw getMakeWithdraw() {
        return new MakeWithdraw2(this.data2);
    }

    //return Penalty2
    @Override
    public Penalty getPenalty() {
        return new Penalty2(this.data2);
    }

    //return IncorrectLockMsg2
    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        return new IncorrectLockMsg2(this.data2);
    }

    //return IncorrectUnlockMsg2
    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        return new IncorrectUnlockMsg2(this.data2);
    }

    //return NoFundsMsg2
    @Override
    public NoFundsMsg getNoFundsMsg() {
        return new NoFundsMsg2(this.data2);
    }
}