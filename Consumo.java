package Pag1a10;/*
5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais
 */


public class Consumo {

    public static void main(String[] args) {

        double tempoGasto = 5;
        double velocidadeMedia = 80.0;
        double distancia = tempoGasto * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.println("Velocidade média :"+ velocidadeMedia );
        System.out.println("Tempo gasto foi de : "+ tempoGasto );
        System.out.println("Distânciia percorrida foi de : "+distancia + "Kilometros");
        System.out.println("Litros gastos foi de : "+litrosUsados );








    }
}
