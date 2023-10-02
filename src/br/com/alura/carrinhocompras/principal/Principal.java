package br.com.alura.carrinhocompras.principal;

import br.com.alura.carrinhocompras.modelos.Carrinho;
import br.com.alura.carrinhocompras.modelos.LimiteCredito;
import br.com.alura.carrinhocompras.modelos.Produto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //ABRINDO MONITORAMENTO DO TECLADO.
        Scanner monitoraTeclado = new Scanner(System.in);

        int opcoesComprador = 0;                          //CONTROLADOR ONDE USUÁRIO MANIPULA SISTEMA
        double limiteSelecionado = 0;                     //USUÁRIO ENTRA COM NOVO LIMITE.
        String produtoSelecionado = "";                   //USUÁRIO ENTRA COM NOVO PRODUTO.
        double valorSelecionado = 0;                      //USUÁRIO ENTRA COM NOVO VALOR.
        int quantidadeSelecionada = 0;                    //USUÁRIO ENTRA COM NOVA QUANTIDADE

        System.out.print("Insira seu limite de crédito: ");
        limiteSelecionado = monitoraTeclado.nextDouble();
        Carrinho novoCarrinho = new Carrinho(0);
        LimiteCredito novoLimite = new LimiteCredito(limiteSelecionado, novoCarrinho);

        while (opcoesComprador != 2) {

            System.out.println("\nMenu de Opções:");
            System.out.println("\n1 - Adicionar novo Produto");
            System.out.println("2 - Finalizar a compra");
            opcoesComprador = monitoraTeclado.nextInt();

            if(opcoesComprador==1){
                System.out.println("Nome do Produto Desejado: ");
                produtoSelecionado = monitoraTeclado.next();
                System.out.println("Valor do Produto Desejado: ");
                valorSelecionado = monitoraTeclado.nextDouble();
                System.out.println("Quantidade do Produto Desejado:");
                quantidadeSelecionada = monitoraTeclado.nextInt();
                Produto novoProduto = new Produto(produtoSelecionado, valorSelecionado, quantidadeSelecionada);
                novoLimite.verificaLimite((quantidadeSelecionada * valorSelecionado),novoProduto);
                novoLimite.resumeCredito();
                novoCarrinho.resumeCarrinho();
            }

        }

        //FECHANDO MONITORAMENTO DO TECLADO.
        monitoraTeclado.close();

    }
}