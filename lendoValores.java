/*
20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada
variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido
multiplicado pelo maior e o maior valor dividido pelo menor.
 */

package Pag11a22;

import java.util.Arrays;
import java.util.Scanner;

public class lendoValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        System.out.print("Verificador de variáveis\n\n");

        for (int x= 0; x < 3; x++) {
            System.out.print("Digite o valor "+(x+1)+": ");
            valores[x] = sc.nextInt();
            while(valores[x]<=0){
                System.out.print("Digite um valor válido no valor "+(x+1)+": ");
                valores[x] = sc.nextInt();
            }
        }
        Arrays.sort(valores);
        System.out.print("Exibe o menor valor lido multiplicado pelo maior: "+(valores[0]*valores[2])+"  E o maior valor dividido pelo menor: "+(valores[2]/valores[0]));
    }
}
