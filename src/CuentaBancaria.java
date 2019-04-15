/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class CuentaBancaria {
    private String dueño;
    private int número;
    private int clave;
    private float saldo;

    public CuentaBancaria(String dueño, int número, int clave) {
        this.dueño = dueño;
        this.número = número;
        this.clave = clave;
    }

    

   

    public boolean consignar(float valor){
            if(valor >0){
                this.saldo += valor;
                return true;
            }else return false;
        }
    
    public boolean retirar(float valor){
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else return false;
    }
    
    public double consultar(){
        return this.saldo;
    }
    
    public boolean cambiarClave(int nuevaClave){
        if(nuevaClave <= 9999){
            return true;
        }else return false;
    }
    

    public int getNúmero() {
        return número;
    }

    public int getClave() {
        return clave;
    }

    public String getDueño() {
        return dueño;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    
    
    
}
