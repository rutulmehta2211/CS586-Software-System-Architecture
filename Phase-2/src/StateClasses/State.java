package StateClasses;

import StrategyClasses.Output;

//Abstract  State Class.
public abstract class State {
    public Output output;

    public State(Output output){
        this.output = output;
    }

    public abstract void Open();
    public abstract void Login();
    public abstract void IncorrectLogin();
    public abstract void IncorrectPin();
    public abstract void CorrectPinBelowMin();
    public abstract void CorrectPinAboveMin();
    public abstract void Deposit();
    public abstract void BelowMinBalance();
    public abstract void AboveMinBalance();
    public abstract void Logout();
    public abstract void Balance();
    public abstract void Withdraw();
    public abstract void WithdrawBelowMinBalance();
    public abstract void NoFunds();
    public abstract void Lock();
    public abstract void IncorrectLock();
    public abstract void Unlock();
    public abstract void IncorrectUnlock();
    public abstract void Suspend();
    public abstract void Activate();
    public abstract void Close(); 

    public abstract int getStateId();

    public abstract void TooManyAttempts();

    //This method calls when user try to perform wrong action from the perticular state.
    public void notatthisstatemsg() {
		System.out.println("");
		System.out.println("WRONG ACTION !!! Cannot Perform From This Present State ");
	}
}
