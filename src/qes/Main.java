package qes;

public class Main {
	
	public static void main(String[] args) {
    
        ProdutoX produto1 = new ProdutoX("Produto 1", 25.99);
        ProdutoX produto2 = new ProdutoX("Produto 2", 39.99);
        ProdutoX produto3 = new ProdutoX("Produto 3", 15.50);

        Pedido pedido = new Pedido();

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        pedido.mostrarListaProdutos();
    }
}
