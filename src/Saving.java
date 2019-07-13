/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Saving extends Account{
    //List properties specific to a saving accounts
    int saftyDepositBoxID;
    int saftyDepositBoxKey;
    
    //Constructors to initialize for the saving properties
    public Saving(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber="1"+accountNumber;
        
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE : saving");
    }
    //List any method specific to saving account
    
}
