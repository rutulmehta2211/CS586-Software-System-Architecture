package StateClasses;

import StrategyClasses.Output;

/**
 * S1 State Class
 * From this State BelowMinBalance(), AboveMinBalance(), WithdrawBelowMinBalance() are Invoked.
 */
public class S1 extends State{

    public int id = 4;

    public S1(Output output) {
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
        //notatthisstatemsg();
    }

    @Override
    public void AboveMinBalance() {
        //notatthisstatemsg();
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

    //Penalty() is invoked from Output class.
    @Override
    public void WithdrawBelowMinBalance() {
        this.output.Penalty();
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

    @Override
    public void TooManyAttempts() {
        // TODO Auto-generated method stub
        
    }
    
}
