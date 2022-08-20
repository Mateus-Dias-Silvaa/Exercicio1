/*
23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
1 – Adição
2 – Subtração
3 – Multiplicação
4 – Divisão
 */

package Pag23a25;

import java.util.Scanner;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorDeApoio = 5;

        System.out.println("1 – Adição");
        int ad = sc.nextInt();
        System.out.println("2 – Subtração");
        int sub = sc.nextInt();
        System.out.println("3 – Multiplicação");
        int mult = sc.nextInt();
        System.out.println("4 – Divisão");
        int div = sc.nextInt();

        ad += valorDeApoio;
        sub -= valorDeApoio;
        mult *= valorDeApoio;
        div /= valorDeApoio;

        System.out.println("Resultado da adição = " + ad);
        System.out.println("Resultado da subtração = " + sub);
        System.out.println("Resultado da multiplicação = " + mult);
        System.out.println("Resultado da divisão = " + div);

    }
}
