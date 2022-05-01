package StateClasses;

import StrategyClasses.Output;

/**
 * Start State Class
 * From this State Open() is Invoked.
 */
public class Start extends State{
    public int id = 0;

    public Start(Output output){
        super(output);
    }

    //StoreData() is invoked from the Output Class.
    @Override
    public void Open() {
        this.output.StoreData();
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
