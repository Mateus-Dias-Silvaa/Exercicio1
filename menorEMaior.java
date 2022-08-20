/*
14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
 */

package Pag11a22;

import java.util.Scanner;

public class menorEMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Informe o primeiro número");
        a = sc.nextInt();

        System.out.println("Informe o primeiro número");
        b = sc.nextInt();

        if (a > b){
            System.out.println("A diferença dos dois números é :" + (a - b));
        } else {
            System.out.println("A diferença dos dois números é :" + (b - a));
        }

    }
}
