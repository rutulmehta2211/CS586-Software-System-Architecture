package AbstractFactoryClasses;

import DataClasses.Data;
import StrategyClasses.DisplayBalance.DisplayBalance;
import StrategyClasses.DisplayMenu.DisplayMenu;
import StrategyClasses.IncorrectIdMsg.IncorrectIdMsg;
import StrategyClasses.IncorrectLockMsg.IncorrectLockMsg;
import StrategyClasses.IncorrectPinMsg.IncorrectPinMsg;
import StrategyClasses.IncorrectUnlockMsg.IncorrectUnlockMsg;
import StrategyClasses.MakeDeposit.MakeDeposit;
import StrategyClasses.MakeWithdraw.MakeWithdraw;
import StrategyClasses.NoFundsMsg.NoFundsMsg;
import StrategyClasses.Penalty.Penalty;
import StrategyClasses.PromptForPin.PromptForPin;
import StrategyClasses.StoreData.StoreData;
import StrategyClasses.TooManyAttemptsMsg.TooManyAttemptsMsg;

/**
 * This is abstract class. 
 * All the declared metheds are also abstract.
 * The implementation of the abstract methods are in inherited concrete fectory class.
 */
public abstract class AbstractFactory {
    public abstract Data getData();
    public abstract StoreData getStoreData();
    public abstract IncorrectIdMsg getIncorrectIdMsg();
    public abstract IncorrectPinMsg getIncorrectPinMsg();
    public abstract TooManyAttemptsMsg getTooManyAttemptsMsg();
    public abstract DisplayMenu getDisplayMenu();
    public abstract MakeDeposit getMakeDeposit();
    public abstract DisplayBalance getDisplayBalance();
    public abstract PromptForPin getPromptForPin();
    public abstract MakeWithdraw getMakeWithdraw();
    public abstract Penalty getPenalty();
    public abstract IncorrectLockMsg getIncorrectLockMsg();
    public abstract IncorrectUnlockMsg getIncorrectUnlockMsg();
    public abstract NoFundsMsg getNoFundsMsg();
}
