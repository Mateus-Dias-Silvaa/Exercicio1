/*
13) Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
 */

package Pag11a22;

import java.util.Scanner;

public class sequenciaNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, c;

        System.out.println("Ultimo");
        a = sc.nextInt();
        System.out.println("Penultimo");
        b = sc.nextInt();
        System.out.println("Primeiro");
        c = sc.nextInt();

        if (a < b){
            if (b < c){
                System.out.println(c+"\n"+b+"\n"+a);
            } else if (a < c) {
                System.out.println(a+"\n"+b+"\n"+c);
            } else {
                System.out.println(c+"\n"+b+"\n"+a);
            }
        }
    }
}
