package StateClasses;

import StrategyClasses.Output;

/**
 * Overdrawn State Class
 * From this State Deposit(), Balance(), Withdraw(), IncorrectLock(), Lock(), Logout() are Invoked.
 */
public class Overdrawn extends State{

    public int id = 5;
    
    public Overdrawn(Output output) {
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

    // MakeDeposit() is invoked from Output class.
    @Override
    public void Deposit() {
        this.output.MakeDeposit();
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
    
    // DisplayBalance() is invoked from Output class.
    @Override
    public void Balance() {
        this.output.DisplayBalance();
    }

    // NoFundsMsg() is invoked from Output class.
    @Override
    public void Withdraw() {
        this.output.NoFundsMsg();
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
        //notatthisstatemsg();
    }

    // IncorrectLockMsg() is invoked from Output class.
    @Override
    public void IncorrectLock() {
        this.output.IncorrectLockMsg();
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
