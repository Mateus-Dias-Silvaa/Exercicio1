package Pag1a10;/*
7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
variável C é a temperatura em graus Celsius.
 */


import java.util.Scanner;

public class calculoTemp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grausFahrenherit;
        double Celsius;

        grausFahrenherit = sc.nextDouble();
        Celsius = (grausFahrenherit - 32) * 5 / 9;

        System.out.println(Celsius);

        sc.close();
    }
}
