/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.util.Scanner;

/**
 *
 * @author BRYANROY
 */
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,i,n=4,cont=2;
        String cad="";
        System.out.println("Ingrese un numero:");
        num=sc.nextInt();
        if(num>2){
            cad="2 - 3";
            while(cont<num){
                i=2;
                while(i<=n){
                    if(i==n){
                    cad=cad+" - "+n;
                    cont=cont+1;
                    }else{
                    if(n % i==0){
                    i=n;
                    }
                    }
                    i=i+1;
                }
                n=n+1;
            }
            System.out.println(cad);
        }else{
            if(num>0){
            if(num==1){
                System.out.println("es primo 2");
            }else{
            System.out.println("es primo 2, 3");
            }
            }else{
            System.out.println("ingresa numeros positivos");
            }
        }        
     }
}