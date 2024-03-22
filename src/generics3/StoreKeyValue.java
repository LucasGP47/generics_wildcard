package generics3;

import java.util.ArrayList;

public class StoreKeyValue<T> {
	private ArrayList<KeyValue<T>> lista;

    public StoreKeyValue() {
        this.lista = new ArrayList<>();
    }

    public boolean adicionar(String chave, T valor) {
        for (KeyValue<T> par : lista) {
            if (par.getChave().equals(chave)) {
                return false;
            }
        }
        lista.add(new KeyValue<>(chave, valor));
        return true; 
    }

    public KeyValue<T> buscar(String chave) {
        for (KeyValue<T> par : lista) {
            if (par.getChave().equals(chave)) {
                return par; 
            }
        }
        return null;
}
}
