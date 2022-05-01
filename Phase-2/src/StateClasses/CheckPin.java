package StateClasses;

import StrategyClasses.Output;

/**
 * Check Pin State Class
 * From this State IncorrectPin(), CorrectPinBelowMin(), CorrectPinAboveMin(), TooManyAttempts(), Logout() are Invoked.
 */
public class CheckPin extends State{

    public int id = 2;

    public CheckPin(Output output) {
        super(output);
    }

    @Override
    public void Open() {
        notatthisstatemsg();
    }

    @Override
    public void Login() {
        notatthisstatemsg();
    }

    @Override
    public void IncorrectLogin() {
        notatthisstatemsg();
    }

    // IncorrectPinMsg() is invoked from Output class.
    @Override
    public void IncorrectPin() {
        this.output.IncorrectPinMsg();
    }

    // DisplayMenu() is invoked from Output class.
    @Override
    public void CorrectPinBelowMin() {
        this.output.DisplayMenu();
    }

    // DisplayMenu() is invoked from Output class.
    @Override
    public void CorrectPinAboveMin() {
        this.output.DisplayMenu();
    }

    @Override
    public void Deposit() {
        notatthisstatemsg();
    }

    @Override
    public void BelowMinBalance() {
        notatthisstatemsg();
    }

    @Override
    public void AboveMinBalance() {
        notatthisstatemsg();
    }

    @Override
    public void Logout() {
        //notatthisstatemsg();
    }

    @Override
    public void Balance() {
        notatthisstatemsg();
    }

    @Override
    public void Withdraw() {
        notatthisstatemsg();
    }

    @Override
    public void WithdrawBelowMinBalance() {
        notatthisstatemsg();
    }

    @Override
    public void NoFunds() {
        notatthisstatemsg();
    }

    @Override
    public void Lock() {
        notatthisstatemsg();
    }

    @Override
    public void IncorrectLock() {
        notatthisstatemsg();
    }

    @Override
    public void Unlock() {
        notatthisstatemsg();
    }

    @Override
    public void IncorrectUnlock() {
        notatthisstatemsg();
    }

    @Override
    public void Suspend() {
        notatthisstatemsg();
    }

    @Override
    public void Activate() {
        notatthisstatemsg();
    }

    @Override
    public void Close() {
        notatthisstatemsg();
    }

    //return current state ID.
    @Override
    public int getStateId() {
        return this.id;
    }

    //TooManyAttemptsMsg() is invoked from Output class.
    @Override
    public void TooManyAttempts() {
        this.output.TooManyAttemptsMsg();
    }
    
}
