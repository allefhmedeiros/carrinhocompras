package br.com.alura.carrinhocompras.modelos;

import java.util.ArrayList;
import java.util.Collections;

public class Carrinho {

    double valorTotal;
    ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Carrinho(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void resumeCarrinho() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println(String.format("Meu Carrinho - Valor Total de Compra R$ %.2f", this.valorTotal));
        System.out.println("\nResumo de Compra:\n");
        Collections.sort(listaProdutos);
        for (Produto produto : listaProdutos) {
            System.out.println(produto.resumeItem());
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public void adcionaProduto (Produto novoProduto) {
        listaProdutos.add(novoProduto);
        this.valorTotal += (novoProduto.quantidadeProduto * novoProduto.getPrecoProduto());
    }

}
