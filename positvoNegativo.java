/*
21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é
positivo ou negativo. Pare a execução do programa quando o usuário requisitar.
 */

package Pag11a22;

import java.util.Scanner;

public class positvoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor");

        int x = sc.nextInt();

        if ( x > 0) {
            System.out.print("Positivo...\n");
        } else if (x < 0) {
            System.out.print("Negativo...\n");
        } else {
            System.out.println("Igual a zero\n");
        }
    }
}
