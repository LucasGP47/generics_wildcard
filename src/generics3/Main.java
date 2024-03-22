package generics3;

public class Main {
	public static void main(String[] args) {
        StoreKeyValue<Integer> armazenamento = new StoreKeyValue<>();

        System.out.println("Adicionando elementos com chaves únicas:");
        System.out.println(armazenamento.adicionar("chave1", 10)); 
        System.out.println(armazenamento.adicionar("chave2", 20)); 
        System.out.println(armazenamento.adicionar("chave3", 30)); 

        System.out.println("\nTentando adicionar elemento com chave já existente:");
        System.out.println(armazenamento.adicionar("chave2", 40)); 

        System.out.println("\nBuscando elementos:");
        KeyValue<Integer> par1 = armazenamento.buscar("chave1");
        KeyValue<Integer> par2 = armazenamento.buscar("chave2");
        KeyValue<Integer> par3 = armazenamento.buscar("chave3");

        System.out.println("Valor encontrado para chave1: " + par1.getValor()); 
        System.out.println("Valor encontrado para chave2: " + par2.getValor()); 
        System.out.println("Valor encontrado para chave3: " + par3.getValor()); 

        System.out.println("\nTentando buscar elemento com chave inexistente:");
        KeyValue<Integer> par4 = armazenamento.buscar("chave4");
        if (par4 != null) {
            System.out.println("Valor encontrado para chave4: " + par4.getValor());
        } else {
            System.out.println("Chave4 não encontrada.");
        }
    }
}
