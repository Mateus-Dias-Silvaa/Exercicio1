/*
12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
O módulo de um número x é:
x se x é maior ou igual a zero
x * (-1) se x é menor que zero
 */

package Pag11a22;

import java.util.Scanner;

public class numberX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();

        if(x >= 0){
            System.out.println("Verdadeiro");
        } else if (x * (-1) >= 0) {
            System.out.println("Falso");
        }
    }
}
