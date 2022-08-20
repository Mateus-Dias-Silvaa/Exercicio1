package Pag1a10;/*
6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
Fahrenheit e a variável C representa é a temperatura em graus Celsius.
 */

import java.util.Scanner;

public class calculoTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grausCelsions;
        double Fahrenheit;

        grausCelsions = sc.nextDouble();
        Fahrenheit = (9 * grausCelsions + 160) / 5;

        System.out.println(Fahrenheit);


    }
}
