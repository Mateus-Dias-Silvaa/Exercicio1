package Pag1a10;/*
3) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida
 */

public class Comissao {

    public static void main(String[] args) {

        System.out.println("Programa de comissão ");

         String vendedor = "Alex";
         String peça = "Peça A";
         int preçoPeça = 10;
         int quantidadeVendida = 10;
         int operaçao = preçoPeça * quantidadeVendida ;
         double comissao = operaçao - 5;



        System.out.println("O vendedor " + vendedor + "vendeu todo o estoque da " + peça + "sua comissão é de " + comissao);





    }
}
