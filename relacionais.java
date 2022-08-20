package Pag1a10;/*
10) Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
 */

import java.util.Scanner;

public class relacionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
    }
}
