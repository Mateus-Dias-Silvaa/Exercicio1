/*
17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
Caso contrário, apresentar a mensagem “valor inválido”.

 */



package Pag11a22;

import java.util.Scanner;

public class validoEInvalido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String conclusao;

        switch (x) {
            case 1:
                conclusao = "valor válido";
                break;
            case 2:
                conclusao = "valor válido";
                break;
            case 3:
                conclusao = "valor válido";
                break;
            case 4:
                conclusao = "valor válido";
                break;
            case 5:
                conclusao = "valor válido";
                break;
            case 6:
                conclusao = "valor válido";
                break;
            case 7:
                conclusao = "valor válido";
                break;
            case 8:
                conclusao = "valor válido";
                break;
            case 9:
                conclusao = "valor válido";
                break;
            default:
                conclusao = "valor inválido";
                break;
        }
        System.out.println("Valor é : " + conclusao);
        sc.close();
    }
}
