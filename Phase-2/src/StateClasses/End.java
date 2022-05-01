package StateClasses;

import StrategyClasses.Output;

/**
 * Check Pin State Class
 * From this State no other method is Invoked.
 */
public class End extends State{

    public int id = 8;
    public End(Output output) {
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

    @Override
    public int getStateId() {
        return this.id;
    }

    @Override
    public void TooManyAttempts() {
        // TODO Auto-generated method stub
        
    }
    
}
