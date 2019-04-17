/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class BankAccount {
    private int accountnumber;
    //instancia
    
    private static int count;
    //clase
    
    public int getNumber(){
        return this.accountnumber;
    }
    
    public static void incrementCount(){
        count++;
    }
    
    public static int getCount(){
        return count;
    }
}
