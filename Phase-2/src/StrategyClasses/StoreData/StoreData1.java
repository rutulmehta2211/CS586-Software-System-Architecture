package StrategyClasses.StoreData;

import DataClasses.Data;
import DataClasses.Data1;

public class StoreData1 extends StoreData{

    public StoreData1(Data data) {
        super(data);
    }

    //This method store temporary variable for pin, user Id, and balance for Account-1.
    @Override
    public void StoreData() {
        Data1 data1 = (Data1)data;
        data1.set_pin(data1.get_temp_p());
        data1.set_balance(data1.get_temp_a());
        data1.set_uid(data1.get_temp_y());
    }
}
