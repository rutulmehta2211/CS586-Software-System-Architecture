package DataClasses;

/**
 * Data2 is child class of the Data class.
 * Data2 class is used by the Account1.
 * Data2 has getter setter methods utilized in Account1 and Output class.
 */
public class Data2 extends Data{
    private int pin;
    private float balance;
    private int uid;

    private int temp_p;
    private int temp_y;
    private float temp_a;
    private float temp_d;
    private float temp_w;

    //get pin number
    public int get_pin(){
        return pin;
    }

    //set pin number
    public void set_pin(int pin){
        this.pin = pin;
    }

    //get account balance
    public float get_balance(){
        return balance;
    }

    //set balance
    public void set_balance(float balance){
        this.balance = balance;
    }

    //get user identification number
    public int get_uid(){
        return uid;
    }

    //set user identification number
    public void set_uid(int uid){
        this.uid = uid;
    }

    //get value of temporary variable temp_p (for pin).
    public int get_temp_p(){
        return temp_p;
    }

    //set value of temporary variable temp_p (for pin).
    public void set_temp_p(int temp_p){
        this.temp_p = temp_p;
    }

    //get value of temporary variable temp_y (for userId).
    public int get_temp_y(){
        return temp_y;
    }

    //set value of temporary variable temp_y (for userId).
    public void set_temp_y(int temp_y){
        this.temp_y = temp_y;
    }

    //get value of temporary variable temp_a (for balance)
    public float get_temp_a(){
        return temp_a;
    }

    //set value of temporary variable temp_a (for balance)
    public void set_temp_a(float temp_a){
        this.temp_a = temp_a;
    }

    //get value of temporary variable temp_d (for deposit amount)
    public float get_temp_d(){
        return temp_d;
    }

    //set value of temporary variable temp_d (for deposit amount)
    public void set_temp_d(float temp_d){
        this.temp_d = temp_d;
    }

    //get value of temporary variable temp_w (for withdraw amount)
    public float get_temp_w(){
        return temp_w;
    }

    //set value of temporary variable temp_w (for withdraw amount)
    public void set_temp_w(float temp_w){
        this.temp_w = temp_w;
    }
}
