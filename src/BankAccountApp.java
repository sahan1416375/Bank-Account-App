/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class BankAccountApp {

    public static void main(String[] args) {
        
        Checking check1=new Checking("Sahan Hasintha","321456879",1500);
        Saving save1=new Saving("Shehari Imalsha","456734567",2500); 
        check1.showInfo();
        System.out.println("************************\n");
        save1.showInfo();
        //Read a CSV File then create new accounts based on that data
        
    }
    
}
