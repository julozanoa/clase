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
        
        System.out.println("Ingrese Nombre del dueño de la cuenta c1");
        String nombre1 = s.nextLine();
        
        System.out.println("Ingrese Número de la cuenta c1");
        int número1 = s.nextInt();
        
        System.out.println("Ingrese clave de 4 digitos de la cuenta c1");
        int clave1 = s.nextInt();
        
        CuentaBancaria c1 = new CuentaBancaria(nombre1, número1, clave1);
        
        System.out.println("Cuenta c1 creada como: ");
        System.out.println("Dueño: " + c1.getDueño());
        System.out.println("Número: " + c1.getNúmero());
        System.out.println("Clave: " + c1.getClave());
        System.out.println("Saldo : $" + c1.getSaldo());
        
        
        
        System.out.println("Ingrese valor a consignar");
        float consignación = s.nextFloat(); 
        c1.Consignar(consignación);
        System.out.println("Su saldo ahora es: $" + c1.getSaldo());
        
        System.out.println("Ingrese número de la cuenta c2");
        int número2 = s.nextInt();
        
        System.out.println("Ingrese clave de 4 digitos de la cuenta c2");
        int clave2 = s.nextInt();
                  
        CuentaBancaria c2 = new CuentaBancaria("Joselito Perez", número2, clave2);
        c2.setSaldo(500000);
        
        System.out.println("Cuenta c2 creada como: ");
        System.out.println("Dueño: " + c2.getDueño());
        System.out.println("Número: " + c2.getNúmero());
        System.out.println("Clave: " + c2.getClave());
        System.out.println("Saldo : $" + c2.getSaldo());
        
        System.out.println("Ingrese nueva clave");
        int nuevaclave = s.nextInt();
        c2.cambiarClave(nuevaclave);
        if(c2.cambiarClave(nuevaclave) == true){
            System.out.println("Su nueva clave es: " + c2.getClave());
        }
        
        System.out.println("Su saldo actual es : " + c2.getSaldo());
        

                
    }
    
}
