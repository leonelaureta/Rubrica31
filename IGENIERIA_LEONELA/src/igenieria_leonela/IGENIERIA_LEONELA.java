/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igenieria_leonela;

import java.util.Scanner;

/**
 *
 * @author leonelaureta
 */
public class IGENIERIA_LEONELA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        System.out.println("BIENVENIDOS AL SISTEMA");
        do{
            System.out.print("INTRODUSCA UN VALOR QUE SEA MAYOR A 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

        fibo1=1;
        fibo2=1; 

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        
        System.out.println("HASTA LUEGO");
        funciona();
    }

    private static void funciona() {
       
        System.out.println("SI FUNCIONA");
    
        }
         
       
    }
    

