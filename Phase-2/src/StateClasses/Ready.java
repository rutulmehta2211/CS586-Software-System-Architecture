package StateClasses;

import StrategyClasses.Output;

/**
 * Ready State Class
 * From this State Deposit(), Balance(), Withdraw(), NoFunds(), Logout(), IncorrectLock(), Lock(), Suspend() are Invoked.
 */
public class Ready extends State{

    public Ready(Output output) {
        super(output);
    }

    public int id = 3;

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

    // MakeWithdraw() is invoked from Output class.
    @Override
    public void Withdraw() {
        this.output.MakeWithdraw();
    }

    @Override
    public void WithdrawBelowMinBalance() {
        notatthisstatemsg();
    }

    // NoFundsMsg() is invoked from Output class.
    @Override
    public void NoFunds() {
        this.output.NoFundsMsg();
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
        //notatthisstatemsg();
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
