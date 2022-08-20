package Pag1a10;/*
4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
multiplicações.
 */


public class Adiçao {
    public static void main(String[] args) {
        int A,B,C,D;

        A = 10;
        B = 10;
        C = 10;
        D = 10;

       int Ab = A - B;
       int Ac = A - C;
       int Ad = A - D;
       int ab = A * B;
       int ac = A * C;
       int ad = A * D;

       int Bc = B - C;
       int Bd = B - D;
       int bc = B * C;
       int bd = B * D;

       int Cd = C - D;
       int cd = C * D;

        System.out.println(Ab);
        System.out.println(Ac);
        System.out.println(Ad);

        System.out.println(ab);
        System.out.println(ac);
        System.out.println(ad);

        System.out.println(Bc);
        System.out.println(Bd);
        System.out.println(bc);
        System.out.println(bd);

        System.out.println(Cd);
        System.out.println(cd);


























    }
}
