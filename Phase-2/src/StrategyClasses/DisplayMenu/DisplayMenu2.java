package StrategyClasses.DisplayMenu;

import DataClasses.Data;

public class DisplayMenu2 extends DisplayMenu{

    public DisplayMenu2(Data data) {
        super(data);
    }

    @Override
    public void DisplayMenu() {
        System.out.println(">>>> Available Options: ");
        System.out.print("\n");
        System.out.print("     2. deposit(float)");
        System.out.print("\n");
        System.out.print("     3. withdraw(float)");
        System.out.print("\n");
        System.out.print("     4. balance()");
        System.out.print("\n");
        System.out.print("     6. logout()");
        System.out.print("\n");
        System.out.print("     7. suspend()");
        System.out.print("\n");
    }
    
}
