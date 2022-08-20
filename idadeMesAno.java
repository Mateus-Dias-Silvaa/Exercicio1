package Pag1a10;/*
9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */


import java.util.Scanner;

public class idadeMesAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Alex";
        int anos;
        int mes;
        int dias;
        int anosEmDias;
        int mesesEmDias;
        int idadeEmDias;

        anos = sc.nextInt();
        mes = sc.nextInt();
        dias = sc.nextInt();

        anosEmDias = anos * 365;
        mesesEmDias = mes * 30;
        idadeEmDias = anosEmDias + mesesEmDias + dias;

        System.out.println(nome + " tem " + anos + " anos, " + mes + " meses, " + dias + " dias de vida ");
        System.out.println("---------------------------------");
        System.out.println(idadeEmDias + " dias ");



    }
}
