package StrategyClasses;

import AbstractFactoryClasses.AbstractFactory;
import DataClasses.Data;
import StrategyClasses.DisplayBalance.DisplayBalance;
import StrategyClasses.DisplayMenu.DisplayMenu;
import StrategyClasses.IncorrectIdMsg.IncorrectIdMsg;
import StrategyClasses.IncorrectLockMsg.IncorrectLockMsg;
import StrategyClasses.IncorrectPinMsg.IncorrectPinMsg;
import StrategyClasses.IncorrectUnlockMsg.IncorrectUnlockMsg;
import StrategyClasses.MakeDeposit.MakeDeposit;
import StrategyClasses.MakeWithdraw.MakeWithdraw;
import StrategyClasses.NoFundsMsg.NoFundsMsg;
import StrategyClasses.Penalty.Penalty;
import StrategyClasses.PromptForPin.PromptForPin;
import StrategyClasses.StoreData.StoreData;
import StrategyClasses.TooManyAttemptsMsg.TooManyAttemptsMsg;

public class Output {
    public AbstractFactory abstractFactory;

    public Data data;
    public StoreData storeData;
    public IncorrectIdMsg incorrectIdMsg;
    public IncorrectPinMsg incorrectPinMsg;
    public TooManyAttemptsMsg tooManyAttemptsMsg;
    public DisplayMenu displayMenu;
    public MakeDeposit makeDeposit;
    public DisplayBalance displayBalance;
    public PromptForPin promptForPin;
    public MakeWithdraw makeWithdraw;
    public Penalty penalty;
    public IncorrectLockMsg incorrectLockMsg;
    public IncorrectUnlockMsg incorrectUnlockMsg;
    public NoFundsMsg noFundsMsg;

    public Output(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;

        /*
		 * Here Get method gets the Object and Sets it using set method
		 */
		setData(abstractFactory.getData());
        setStoreData(abstractFactory.getStoreData());
        setIncorrectIdMsg(abstractFactory.getIncorrectIdMsg());
        setIncorrectPinMsg(abstractFactory.getIncorrectPinMsg());
        setTooManyAttemptsMsg(abstractFactory.getTooManyAttemptsMsg());
        setDisplayMenu(abstractFactory.getDisplayMenu());
        setMakeDeposit(abstractFactory.getMakeDeposit());
        setDisplayBalance(abstractFactory.getDisplayBalance());
        setPromptForPin(abstractFactory.getPromptForPin());
        setMakeWithdraw(abstractFactory.getMakeWithdraw());
        setPenalty(abstractFactory.getPenalty());
        setIncorrectLockMsg(abstractFactory.getIncorrectLockMsg());
        setIncorrectUnlockMsg(abstractFactory.getIncorrectUnlockMsg());
        setNoFundsMsg(abstractFactory.getNoFundsMsg());
    }

    private void setData(Data data) {
    }

    //Store data
    public void StoreData(){
        this.storeData.StoreData();
    }

    private void setStoreData(StoreData storeData) {
        this.storeData = storeData;
    }

    //IncorrectIdMsg
    public void IncorrectIdMsg(){
        this.incorrectIdMsg.IncorrectIdMsg();
    }

    private void setIncorrectIdMsg(IncorrectIdMsg incorrectIdMsg) {
        this.incorrectIdMsg = incorrectIdMsg;
    }

    //IncorrectPinMsg
    public void IncorrectPinMsg(){
        this.incorrectPinMsg.IncorrectPinMsg();
    }
    
    private void setIncorrectPinMsg(IncorrectPinMsg incorrectPinMsg) {
        this.incorrectPinMsg = incorrectPinMsg;
    }

    //TooManyAttemptsMsg
    public void TooManyAttemptsMsg(){
        this.tooManyAttemptsMsg.TooManyAttemptsMsg();
    }

    private void setTooManyAttemptsMsg(TooManyAttemptsMsg tooManyAttemptsMsg) {
        this.tooManyAttemptsMsg = tooManyAttemptsMsg;
    }

    //DisplayMenu
    public void DisplayMenu(){
        this.displayMenu.DisplayMenu();
    }

    private void setDisplayMenu(DisplayMenu displayMenu) {
        this.displayMenu = displayMenu;
    }

    //MakeDeposit
    public void MakeDeposit(){
        this.makeDeposit.MakeDeposit();
    }
    
    private void setMakeDeposit(MakeDeposit makeDeposit) {
        this.makeDeposit = makeDeposit;
    }

    //DisplayBalance
    public void DisplayBalance(){
        this.displayBalance.DisplayBalance();
    }

    private void setDisplayBalance(DisplayBalance displayBalance) {
        this.displayBalance = displayBalance;
    }

    //PromptForPin
    public void PromptForPin(){
        this.promptForPin.PromptForPin();
    }

    private void setPromptForPin(PromptForPin promptForPin) {
        this.promptForPin = promptForPin;
    }

    //MakeWithdraw
    public void MakeWithdraw(){
        this.makeWithdraw.MakeWithdraw();
    }

    private void setMakeWithdraw(MakeWithdraw makeWithdraw) {
        this.makeWithdraw = makeWithdraw;
    }

    //Penalty
    public void Penalty(){
        this.penalty.Penalty();
    }

    private void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    //IncorrectLockMsg
    public void IncorrectLockMsg(){
        this.incorrectLockMsg.IncorrectLockMsg();
    }

    private void setIncorrectLockMsg(IncorrectLockMsg incorrectLockMsg) {
        this.incorrectLockMsg=incorrectLockMsg;
    }

    //IncorrectUnlockMsg
    public void IncorrectUnlockMsg(){
        this.incorrectUnlockMsg.IncorrectUnlockMsg();
    }

    private void setIncorrectUnlockMsg(IncorrectUnlockMsg incorrectUnlockMsg) {
        this.incorrectUnlockMsg = incorrectUnlockMsg;
    }

    //NoFundsMsg
    public void NoFundsMsg(){
        this.noFundsMsg.NoFundsMsg();
    }

    private void setNoFundsMsg(NoFundsMsg noFundsMsg) {
        this.noFundsMsg = noFundsMsg;
    }
}
