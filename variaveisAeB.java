/*
11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados
 */

package Pag11a22;

public class variaveisAeB {
    public static void main(String[] args) {
        int Aux,A,B;

        A = 10;
        B = 5;

         Aux = A;
         A = B;
         B = Aux;

        System.out.println(A);
        System.out.println(B);

    }
}
