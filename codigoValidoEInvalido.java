/*
18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou
igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é
um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou
seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).

 */


package Pag11a22;

import java.util.Scanner;

public class codigoValidoEInvalido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CODIGO1 = sc.nextInt();
        int CODIGO2 = sc.nextInt();
        int CODIGO3 = sc.nextInt();

        String conc;

        switch (CODIGO1) {
            case 1:
                conc = "valor válido";
                break;
            case 2:
                conc = "valor válido";
                break;
            case 3:
            default:
                conc = "valor inválido";
                break;
        }
        System.out.println("Codigo é igual a : " + "um é " + conc);
        sc.close();


        switch (CODIGO2) {
            case 1:
                conc = "valor válido";
                break;
            case 2:
                conc = "valor válido";
                break;
            case 3:
            default:
                conc = "valor inválido";
                break;
        }
        System.out.println("Codigo é igual a : " + "dois é " + conc);
        sc.close();

        switch (CODIGO3) {
            case 1:
                conc = "valor válido";
                break;
            case 2:
                conc = "valor válido";
                break;
            case 3:
            default:
                conc = "valor inválido";
                break;
        }
        System.out.println("Codigo é igual a : " + "três é " + conc);
        sc.close();
    }
}
