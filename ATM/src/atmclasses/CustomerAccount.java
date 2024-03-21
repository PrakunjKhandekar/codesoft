/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmclasses;

/**
 *
 * @author PRAKUNJ
 */
public class CustomerAccount {
    static double amount = 100000.0;
        
    public static double checkBalance(){
        return amount;
    }
    public static void withdraw(double wd){
        amount-=wd;
    }
    public static void deposit(double d){
        amount+=d;
    }
}
