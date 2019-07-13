/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Checking extends Account {
    //List properties specific to a checking account
    int debitCardNumber;
    int debitCardPIN;
    //Constructors to initialize checking account properties
    public Checking(String name,String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber="2"+accountNumber;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE :checking");
    }
    //List any methods specific the checking accounts
    
}
