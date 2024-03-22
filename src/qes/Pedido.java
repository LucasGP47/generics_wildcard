package qes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<ProdutoX> listaProdutos;

    public Pedido() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoX produto) {
        listaProdutos.add(produto);
    }

    public void mostrarListaProdutos() {
        System.out.println("Lista de Produtos no Pedido:");
        for (ProdutoX produto : listaProdutos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}
