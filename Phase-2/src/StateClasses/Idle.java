package StateClasses;

import StrategyClasses.Output;

/**
 * Idle State Class
 * From this State Login(), IncorrectLogin() are Invoked.
 */
public class Idle extends State{

    public int id = 1;

    public Idle(Output output) {
        super(output);
    }

    @Override
    public void Open() {
        notatthisstatemsg();
    }

    //PromptForPin() is invoked from Output class.
    @Override
    public void Login() {
        this.output.PromptForPin();
    }

    //IncorrectIdMsg() is invoked from Output class.
    @Override
    public void IncorrectLogin() {
        this.output.IncorrectIdMsg();
    }

    @Override
    public void IncorrectPin() {
        notatthisstatemsg();
    }

    @Override
    public void CorrectPinBelowMin() {
        notatthisstatemsg();
    }

    @Override
    public void CorrectPinAboveMin() {
        notatthisstatemsg();
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
        notatthisstatemsg();
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

    //return current State ID.
    @Override
    public int getStateId() {
        return this.id;
    }

    @Override
    public void TooManyAttempts() {
        // TODO Auto-generated method stub
        
    }
    
}
