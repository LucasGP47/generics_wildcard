package generics3;

public class KeyValue<T> {
    private String chave;
    private T valor;

    public KeyValue(String chave, T valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public String getChave() {
        return chave;
    }

    public T getValor() {
        return valor;
    }
}	
