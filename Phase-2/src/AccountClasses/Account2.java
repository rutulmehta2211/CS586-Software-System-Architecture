package AccountClasses;

import AbstractFactoryClasses.AbstractFactory;
import DataClasses.Data2;

/**
 * Account2 Class
 * All the methods of account1 class invoke members of MDA_EFSM class.
 */
public class Account2 extends Account{

    /**
     * Constructor of the account1 class.
     * @param abstractFactory
     */
    public Account2(AbstractFactory abstractFactory) {
        super(abstractFactory);
    }
    
    /**
     * Open method is used to open an account
     * @param p - Pin
     * @param y - User Identification
     * @param a - Account balancw
     */
    public void open(int p, int y, float a){
        Data2 data2 = (Data2)this.data;
        if(p>0 && y>0 && a>0){
            data2.set_temp_p(p);
            data2.set_temp_y(y);
            data2.set_temp_a(a);
            efsm.Open();
        }
        else{
            FailMethod("Open","Pin, UserId, Balance");
        }
    }

    /**
     * Pin method check whether entered pin is correct or not.
     * @param x - Pin
     */
    public void pin(int x){
        Data2 data2 = (Data2)this.data;
        if(x == data2.get_pin()){
            efsm.CorrectPinAboveMin();
        }
        else{
            efsm.IncorrectPin(2);
        }
    }

    /**
     * Deposit method deposit amount in account
     * @param d - deposit amount
     */
    public void deposit(float d){
        Data2 data2 = (Data2)this.data;
        if(d>0){
            data2.set_temp_d(d);
            efsm.Deposit();
        }
        else{
            FailMethod("Deposit","Deposit amount");
        }
    }

    /**
     * Withdraw method withdraw amount from account
     * @param w - withdraw amount
     */
    public void withdraw(float w){
        Data2 data2 = (Data2)this.data;
        if(w>0){
            data2.set_temp_w(w);
            if (data2.get_balance() > 0) {
                efsm.Withdraw();
                efsm.AboveMinBalance();
            } else {
                efsm.NoFunds();
            }
        }
        else{
            FailMethod("Withdraw", "Withdraw amount");
        }
    }

    /**
     * balance method check the balance of the account.
     */
    public void balance(){
        efsm.Balance();
    }

    /**
     * login method check whether user entered correct UserID or not.
     * @param y - User Identification number
     */
    public void login(int y){
        Data2 data2 = (Data2)this.data;
        if(y>0){
            if(y == data2.get_uid()){
                efsm.Login();
            }
            else{
                efsm.IncorrectLogin();
            }
        }
        else{
            FailMethod("Login", "User Identification");
        }
    }

    /**
     * logout method use to logout from the current system.
     */
    public void logout(){
        efsm.Logout();
    }

    /**
     * suspend method call when user want to suspend the current system.
     */
    public void suspend(){
        efsm.Suspend();
    }

    /**
     * activate method calls when user activate account from suspended state.
     */
    public void activate(){
        efsm.Activate();
    }

    /**
     * close method calls when user want to close the accounut.
     */
    public void close(){
        efsm.Close();
    }

    /**
     * FailMethod call when user enter invalid data in any other method.
     * @param methodname - Method name
     * @param varname - Variable name
     */
    public void FailMethod(String methodname, String varname){
        System.out.println(methodname+" Method Failed");
		System.out.println(varname+" should be greater than 0");
		System.out.println("\n");
    }
}
