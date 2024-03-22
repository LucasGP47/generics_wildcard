package generics;

public class GenericClass<T> {
    private T objeto;

    public GenericClass(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }
}
