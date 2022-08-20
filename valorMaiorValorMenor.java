/*
16) Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
 */

package Pag11a22;

import java.util.Scanner;

public class valorMaiorValorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("Digite o primeiro valor :");
        A = sc.nextInt();

        System.out.println("Digite o segundo valor :");
        B = sc.nextInt();

        if (A > B){
            System.out.println("Maior valor é o : " + A);
            System.out.println("Menor valor é o : " + B);
        }

        if (B > A) {
            System.out.println("Maior valor é o : " + B);
            System.out.println("Menor valor é o : " + A);
        }

        if (A >= B){
            System.out.println("Os valores são iguais");
        }
    }
}
