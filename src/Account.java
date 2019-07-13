/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public abstract class Account implements IBaseRate{
    // List common properties for saving and checking accounts
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;
    static int index=10000;
    int randomThreeNumbers;
    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
    this.name=name;
    this.sSN=sSN;
    this.balance=initDeposit;
   // System.out.println("NAME : "+name+" sSN : "+sSN+" BALANCE : "+balance);
     this.accountNumber=setAccountNumber();  
     
     index++;
     
    }
    //list common methods

private String setAccountNumber(){
    String lastTwoOfSSN = sSN.substring(sSN.length()-2);
    int uniqueID=index;
    int randomNumber=setrandomNumber();
    return lastTwoOfSSN+""+uniqueID+""+randomNumber;
}

private int setrandomNumber(){
    int randomNumber=(int)(Math.random()*Math.pow(10, 3));
    return randomNumber;
    }

public void showInfo(){
    System.out.println("NAME : " + name +
            "\n Account Number : " + accountNumber +
            "\nBalance : " + balance);
}
}

