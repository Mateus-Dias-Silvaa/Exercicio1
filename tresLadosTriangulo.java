/*
19) Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
ocorrência.
 */


package Pag11a22;

import java.util.Scanner;

public class tresLadosTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A==B){
            if (B==C) {
                System.out.println(" Triângulo eqüilátero ");
            } else if ( A==B) {
                System.out.println(" Triângulo isósceles ");
            } else if (A==C) {
                System.out.println(" Triângulo isósceles ");
            } else if (B==C) {
                System.out.println(" Triângulo isósceles ");
            } else {
                System.out.println(" Não é um triângulo ");
            }
        }

    }
}
