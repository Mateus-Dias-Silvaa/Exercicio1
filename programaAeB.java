/*
22) Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
resultado.
 */

package Pag11a22;

import java.util.Scanner;

public class programaAeB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;

        int x = sc.nextInt();
        A = 0;
        B = 0;


         if (x > 0){
             System.out.println("Postivo");
             x = A;
             System.out.println("O valor é igual  " + "A = " + A);
         }

         if (x <= 0){
            System.out.println("Negativo");
            x = B;
            System.out.println("O valor é igual  " + "B = " + B);
         }

    }
}