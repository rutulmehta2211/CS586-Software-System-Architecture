package MDA_EFSM;

import StrategyClasses.Output;
import StateClasses.*;

/**
 * MDA_EFSM Class
 */
public class MDA_EFSM {

    public State list[];
    public State state;  
	Integer k = 0;
    
    /**
     * Constructor of the MDA_EFSM class. 
     * @param output - object of the output class
     */
    public MDA_EFSM(Output output){
        list = new State[9];
		list[0] = new Start(output); 
		list[1] = new Idle(output);
		list[2] = new CheckPin(output);
		list[3] = new Ready(output);
		list[4] = new S1(output);
		list[5] = new Overdrawn(output);
		list[6] = new Locked(output);
        list[7] = new Suspended(output);
        list[8] = new End(output);
		state = list[0];
    }

    /**
     * This method calls open method from the state class.
     * State is changed from start to Idle.
     */
    public void Open(){
        state.Open();
        int stateid = state.getStateId();
        if(stateid == 0){
            state = list[1];
        }
    }

    /**
     * This method calls login method from the state class.
     * State is changed from Idle to CheckPin.
     */
    public void Login(){
        state.Login();
        int stateid = state.getStateId();
        if(stateid == 1){
            state = list[2];
        }
    }
    
    /**
     * This method calls IncorrectLogin method from the state class.
     */
    public void IncorrectLogin(){
        state.IncorrectLogin();
    }

    /**
     * This method calls IncorrectPin or TooManyAttempts methods from state class based on the limit of maximum attempts. 
     * If limit to enter incorrect pin is exceeded State is changed from CheckPin to Idle.
     * @param Max - Maximum attempts possible for incorrect pin.
     */
    public void IncorrectPin(int Max){
        if(k < Max){
            state.IncorrectPin();
            k=k+1;
        }
        else if(k == Max){
            state.TooManyAttempts();
            int stateid = state.getStateId();
            if(stateid == 2){
                state = list[1];
            }
        }
    }

    /**
     * This method calls CorrectPinBelowMin method from state class.
     * State is changed from CheckPin to Overdrawn.
     */
    public void CorrectPinBelowMin(){
        state.CorrectPinBelowMin();
        int stateid = state.getStateId();
        if(stateid == 2){
            state = list[5];
        }
    }

    /**
     * This method calls CorrectPinAboveMin method from state class.
     * State is changed from CheckPin to Ready
     */
    public void CorrectPinAboveMin(){
        state.CorrectPinAboveMin();
        int stateid = state.getStateId();
        if(stateid == 2){
            state = list[3];
        }
    }

    /**
     * This method calls Deposit method from state class.
     * State is changed from Overdrawn to S1. 
     */
    public void Deposit(){
        state.Deposit();
        int stateid = state.getStateId();
        if(stateid == 5){
            state = list[4];
        }
    }

    /**
     * This method calls BelowMinBalance method from state class.
     * State is changed from S1 to Overdrawn. 
     */
    public void BelowMinBalance(){
        state.BelowMinBalance();
        int stateid = state.getStateId();
        if(stateid == 4){
            state = list[5];
        }
    }
    
    /**
     * This method calls AboveMinBalance method from state class.
     * State is changed from S1 to Ready. 
     */
    public void AboveMinBalance(){
        state.AboveMinBalance();
        int stateid = state.getStateId();
        if(stateid == 4){
            state = list[3];
        }
    }

    /**
     * This method calls Logout method from state class.
     * State is changed from CheckPin, Ready and Overdrawn to Idle. 
     */
    public void Logout(){
        state.Logout();
        int stateid = state.getStateId();
        if(stateid == 2){
            state = list[1];
        }
        else if(stateid == 5){
            state = list[1];
        }
        else if(stateid == 3){
            state = list[1];
        }
    }

    /**
     * This method calls Balance method from state class.
     */
    public void Balance(){
        state.Balance();
    }

    /**
     * This method calls Withdraw method from state class.
     * State is changed from Ready to S1. 
     */
    public void Withdraw(){
        state.Withdraw();
        int stateid = state.getStateId();
        if(stateid == 3){
            state = list[4];
        }
    }

    /**
     * This method calls WithdrawBelowMinBalance method from state class.
     * State is changed from S1 to Overdrawn. 
     */
    public void WithdrawBelowMinBalance(){
        state.WithdrawBelowMinBalance();
        int stateid = state.getStateId();
        if(stateid == 4){
            state = list[5];
        }
    }

    /**
     * This method calls NoFunds method from state class.
     */
    public void NoFunds(){
        state.NoFunds();
    }

    /**
     * This method calls Lock method from state class
     * State is changed from Ready, Overdrawn to Lock
     */
    public void Lock(){
        state.Lock();
        int stateid = state.getStateId();
        if(stateid == 3){
            state = list[6];
        }
        else if(stateid == 5){
            state = list[6];
        }
    }

    /**
     * This method calls IncorrectLock method from state class. 
     */
    public void IncorrectLock(){
        state.IncorrectLock();
    }

    /**
     * This method calls Unlock method from state class.
     * State is changed from Lock to S1. 
     */
    public void Unlock(){
        state.Unlock();
        int stateid = state.getStateId();
        if(stateid == 6){
            state = list[4];
        }
    }

    /**
     * This method calls IncorrectUnlock method from state class. 
     */
    public void IncorrectUnlock(){
        state.IncorrectUnlock();
    }

    /**
     * This method calls Suspend method from state class. 
     * State is changed from Ready to Suspended.
     */
    public void Suspend(){
        state.Suspend();
        int stateid = state.getStateId();
        if(stateid == 3){
            state = list[7];
        }
    }

    /**
     * This method calls Activate method from state class.
     * State is changed from Suspended to Ready. 
     */
    public void Activate(){
        state.Activate();
        int stateid = state.getStateId();
        if(stateid == 7){
            state = list[3];
        }
    }

    /**
     * This method calls Close method from state class.
     * State is changed from Suspended to End.
     */
    public void Close(){
        state.Close();
        int stateid = state.getStateId();
        if(stateid == 7){
            state = list[8];
        }
    }
}
