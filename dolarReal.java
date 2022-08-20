package Pag1a10;/*
2) Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado
 */





import java.util.Scanner;

public class dolarReal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorReal, cotaçaoDolar, valorDolar;

        System.out.println("Digite os valores :");

        valorDolar = sc.nextDouble();
        cotaçaoDolar = sc.nextDouble();

        valorReal = (valorDolar * cotaçaoDolar);

        System.out.println(valorReal);
    }
}
