/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1.unidad2examen;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class UNIDAD1UNIDAD2EXAMEN {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);    
        
     System.out.println("Ingresa el nombre del primer instrumento: ");
         String Instrumento1 = scanner.nextLine();
        
        System.out.println("Ingresa el precio de compra del primer instrumento: ");
        double Precio1 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Ingresa el nombre del segundo instrumento: ");
         String Instrumento2 = scanner.nextLine();
        
         System.out.println("Ingresa el precio de compra del segundo instrumento: ");
         double Precio2 = scanner.nextDouble();
         
         scanner.nextLine();

        System.out.println("Ingresa el nombre del tercer instrumento: ");
         String Instrumento3 = scanner.nextLine();
         
        System.out.println("Ingresa el precio de compra del tercer instrumento: ");
        double Precio3 = scanner.nextDouble();
              
      double Producto1Guitarra = (1250.45-Precio1);
              
      double Producto2Bajo = (3743-Precio2);
              
      double Producto3bateria = (2683.78-Precio3);
      scanner.close();
      
      double Producto1GP = (Producto1Guitarra/Precio1)*100 ;
      double Producto2GP = (Producto2Bajo/Precio2)*100 ;
      double Producto3GP = (Producto1Guitarra/Precio3)*100 ;
      
      
      System.out.println("El porcentaje de ganancia de "+Instrumento1+" es de "+ Producto1GP +"%");
      System.out.println("El porcentaje de ganancia de "+Instrumento2+" es de "+ Producto2GP +"%");
      System.out.println("El porcentaje de ganancia de "+Instrumento3+" es de "+ Producto3GP +"%");
        
        
        
    }
}
