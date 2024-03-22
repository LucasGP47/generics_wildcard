package generics;

public class Main {
    public static void main(String[] args) {
        
        GenericClass<String> genericString = new GenericClass<>("Oi");
        String string = genericString.getObjeto();
        System.out.println("String: " + string);
   
        GenericClass<Integer> genericInt = new GenericClass<>(123);
        int inteiro = genericInt.getObjeto();
        System.out.println("Int: " + inteiro);

        Pessoa pessoa = new Pessoa("Pablo", 44);
        GenericClass<Pessoa> genericPessoa = new GenericClass<>(pessoa);
        Pessoa pessoaObtida = genericPessoa.getObjeto();
        System.out.println("Pessoa: " + pessoaObtida.getNome() + ", " + pessoaObtida.getIdade());
    }
}
