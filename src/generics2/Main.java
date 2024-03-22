package generics2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	
        Produto<Integer> produtoInt = new Produto<>(1001, 50.99, LocalDate.of(2023, 3, 15), LocalDate.of(2024, 3, 15));
        System.out.println("Produto com ID Inteiro:");
        System.out.println("ID: " + produtoInt.getId());
        System.out.println("Valor: " + produtoInt.getValor());
        System.out.println("Data de Fabricação: " + produtoInt.getDataFabricacao());
        System.out.println("Data de Vencimento: " + produtoInt.getDataVencimento());
        System.out.println();

        Produto<String> produtoString = new Produto<>("1001", 35.75, LocalDate.of(2023, 5, 20), LocalDate.of(2024, 5, 20));
        System.out.println("Produto com ID String:");
        System.out.println("ID: " + produtoString.getId());
        System.out.println("Valor: " + produtoString.getValor());
        System.out.println("Data de Fabricação: " + produtoString.getDataFabricacao());
        System.out.println("Data de Vencimento: " + produtoString.getDataVencimento());
    }
}
