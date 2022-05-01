package StrategyClasses.StoreData;

import DataClasses.Data;
import DataClasses.Data2;

public class StoreData2 extends StoreData{

    public StoreData2(Data data) {
        super(data);
    }

    //This method store temporary variable for pin, user Id, and balance for Account-2.
    @Override
    public void StoreData() {
        Data2 data2 = (Data2)data;
        data2.set_pin(data2.get_temp_p());
        data2.set_balance(data2.get_temp_a());
        data2.set_uid(data2.get_temp_y());
    }
}
