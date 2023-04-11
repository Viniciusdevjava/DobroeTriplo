/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobroetriplo;

import java.util.Scanner;


public class DobroeTriplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        int numero;
        System.out.println("Digite um numero Inteiro para saber seu dobro se for positivo ou negativo para saber seu triplo: ");
        numero=t.nextInt();
        if (numero>0){
            System.out.println("O resultado é :"+numero*2);
        }else {
            if(numero<0){
                System.out.println("O resultado é :"+numero*3);
            }
        }
    }
    
}
