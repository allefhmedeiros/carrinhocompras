package br.com.alura.carrinhocompras.modelos;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nomeProduto;
    private double precoProduto;
    private double valorTotal;
    int quantidadeProduto;

    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorTotal = (this.precoProduto * this.quantidadeProduto);
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public String resumeItem() {
        return (String.format("""
                    Nome: %s, Quantidade: %d, Valor Unitário R$ %.2f, Valor Total R$ %.2f. 
                """, this.nomeProduto, this.quantidadeProduto, this.precoProduto, this.valorTotal));
    }

    @Override
    public int compareTo(Produto produto) {
        if (this.valorTotal < produto.valorTotal) {
            return -1;
        }
        if (this.valorTotal > produto.valorTotal) {
            return 1;
        }
        return 0;
    }

//    @Override
//    public int compareTo(Produto produto) {
//        if (this.valorTotal < produto.valorTotal) {
//            return -1;
//        }
//        if (this.valorTotal > produto.valorTotal) {
//            return 1;
//        }
//        return 0;
//    }
}
