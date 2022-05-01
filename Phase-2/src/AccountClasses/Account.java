package AccountClasses;

import AbstractFactoryClasses.AbstractFactory;
import DataClasses.Data;
import MDA_EFSM.MDA_EFSM;
import StrategyClasses.Output;

/**
 * Account abstract Class
 */
public abstract class Account {
    Data data;
    MDA_EFSM efsm;

    /**
     * Constructor of the Account class
     * @param abstractFactory
     */
    Account(AbstractFactory abstractFactory){
        this.data = abstractFactory.getData();
        this.efsm = new MDA_EFSM(new Output(abstractFactory));
    }
}
