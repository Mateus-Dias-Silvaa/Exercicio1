/*
15) Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
aluno.
 */

package Pag11a22;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int alunoA, alunoB, alunoC, alunoD;
        int media = 5;

        System.out.println("Informe a nota");
        alunoA = sc.nextInt();

        System.out.println("Informe a nota");
        alunoB = sc.nextInt();

        System.out.println("Informe a nota");
        alunoC = sc.nextInt();

        System.out.println("Informe a nota");
        alunoD = sc.nextInt();

        if (alunoA >= media) {
            System.out.println("Nota igual : " + alunoA + " =  Você foi aprovado");
        } else if (alunoA <= media){
            System.out.println("Nota igual : " + alunoA + " =  Você não foi aprovado" + ", nota de recuperação = " +  (alunoA + media));
        }

        if (alunoB >= media) {
            System.out.println("Nota igual : " + alunoB + " =  Você foi aprovado");
        } else if (alunoB <= media){
            System.out.println("Nota igual : " + alunoB + " =  Você não foi aprovado" + ", nota de recuperação = " + (alunoB + media));
        }

        if (alunoC >= media) {
            System.out.println("Nota igual : " + alunoC + " =  Você foi aprovado");
        } else if (alunoC <= media){
            System.out.println("Nota igual : " + alunoC + " =  Você não foi aprovado" + ", nota de recuperação = " +  (alunoC + media));
        }

        if (alunoD >= media) {
            System.out.println("Nota igual : " + alunoD + " =  Você foi aprovado");
        } else if (alunoD <= media){
            System.out.println("Nota igual : " + alunoD + " =  Você não foi aprovado" + ", nota de recuperação = " +  (alunoD + media));
        }


    }
}
