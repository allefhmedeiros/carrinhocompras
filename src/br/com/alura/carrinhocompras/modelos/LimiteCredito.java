package br.com.alura.carrinhocompras.modelos;

public class LimiteCredito {
    private double limiteLinha;

    private Carrinho carrinho;

    public LimiteCredito(double limiteLinha, Carrinho carrinho) {
        this.limiteLinha = limiteLinha;
        this.carrinho = carrinho;
    }

    public double getLimiteLinha() {
        return limiteLinha;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void resumeCredito(){
        System.out.println(String.format("Limite de Crédito: R$ %.2f", this.limiteLinha));
        System.out.println(String.format("Valor Total de Compras: R$ %.2f", this.carrinho.valorTotal));
        System.out.println(String.format("Limite Restante: R$ %.2f", this.limiteLinha - this.carrinho.valorTotal));
    }

    public void verificaLimite(double novaCompra, Produto novoProduto){
        if(novaCompra <= (this.limiteLinha - this.carrinho.valorTotal)){
            this.carrinho.adcionaProduto(novoProduto);
        }else{
            System.out.println("Seu limite de crédito restante não comporta essa nova compra.\n");
        }
    }
}
