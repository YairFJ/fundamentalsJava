/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fundamentsjava;

/**
 *
 * @author User
 */
public class FundamentsJava {

    public static void main(String[] args) {
       // Crear 3 variables, una para edad, otra para nombre y una ultima para su salario
       
       int edad;
     
       edad = 22;
               
       String nombre = "Yair";
       double salario = 400000;
       
        System.out.println("Soy " + nombre + " tengo " + edad + " años y mi sueldo es de " + salario);
       
        
        System.out.println("----------------------------------------------------------------------------");
    
    // Condicionales
    
    edad = 35;
    
    if (edad >= 35) {
        System.out.println("Sos muy grande para este boliche");
    } else if (edad >= 18) {
        System.out.println("Podés entrar");
    } else{
        System.out.println("Sos menor, no podés entrar");
    }
    
    
    }
}
