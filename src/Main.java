/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String nombre = s.nextLine();
        int número = s.nextInt();
        int clave = s.nextInt();
        
        
        CuentaBancaria c1 = new CuentaBancaria(nombre, número, clave);
        
        System.out.println(c1.getDueño()+ " " +c1.getNúmero() + " " + c1.getClave() + " " + c1.getSaldo());
        
                
    }
    
}
