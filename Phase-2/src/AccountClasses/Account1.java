package AccountClasses;

import AbstractFactoryClasses.AbstractFactory;
import DataClasses.Data1;

/**
 * Account1 Class
 * All the methods of account1 class invoke members of MDA_EFSM class.
 */
public class Account1 extends Account{

    /**
     * Constructor of the account1 class.
     * @param abstractFactory
     */
    public Account1(AbstractFactory abstractFactory) {
        super(abstractFactory);
    }
    
    /**
     * Open method is used to open an account
     * @param p - Pin
     * @param y - User Identification
     * @param a - Account balancw
     */
    public void open(int p, int y, int a){
        Data1 data1 = (Data1)this.data;
        if(p>0 && y>0 && a>0){
            data1.set_temp_p(p);
            data1.set_temp_y(y);
            data1.set_temp_a(a);
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
        Data1 data1 = (Data1)this.data;
        if(x == data1.get_pin()){
            if(data1.get_balance() > 100){
                efsm.CorrectPinAboveMin();
            }
            else{
                efsm.CorrectPinBelowMin();
            }
        }
        else{
            efsm.IncorrectPin(1);
        }
    }

    /**
     * Deposit method deposit amount in account
     * @param d - deposit amount
     */
    public void deposit(int d){
        Data1 data1 = (Data1)this.data;
        if(d>0){
            data1.set_temp_d(d);
            efsm.Deposit();
            if(data1.get_balance() > 100){
                efsm.AboveMinBalance();
            }
            else{
                efsm.BelowMinBalance();
            }
        }
        else{
            FailMethod("Deposit","Deposit amount");
        }
        
    }

    /**
     * Withdraw method withdraw amount from account
     * @param w - withdraw amount
     */
    public void withdraw(int w){
        Data1 data1 = (Data1)this.data;
        if(w>0){
            data1.set_temp_w(w);
            efsm.Withdraw();
            if (data1.get_balance() > 100) {
                efsm.AboveMinBalance();
            } else {
                efsm.WithdrawBelowMinBalance();
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
        Data1 data1 = (Data1)this.data;
        if(y>0){
            if(y == data1.get_uid()){
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
     * lock method use to lock account by entering correct pin number
     * @param x - Pin number
     */
    public void lock(int x){
        Data1 data1 = (Data1)this.data;
        if(x>0){
            if(data1.get_pin() == x){
                efsm.Lock();
            }
            else{
                efsm.IncorrectLock();
            }
        }
        else{
            FailMethod("Lock", "Pin number");
        }
    }

    /**
     * unlock method use to unlock account by entering correct pin number
     * @param x - Pin number
     */
    public void unlock(int x){
        Data1 data1 = (Data1)this.data;
        if(x>0){
            if(x == data1.get_pin()){
                efsm.Unlock();
                if(data1.get_balance()>100){
                    efsm.AboveMinBalance();
                }
                else{
                    efsm.BelowMinBalance();
                }
            }
            else{
                efsm.IncorrectUnlock();
            }
        }
        else{
            FailMethod("Unlock", "Pin number");
        }
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
