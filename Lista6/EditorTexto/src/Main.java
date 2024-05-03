public class Main {
    public static void main(String[] args) {
        Arquivo a1 = new Arquivo("Texto");
        a1.abrir();

        a1.editar("Esse é meu novo texto");
        a1.abrir();

        a1.renomear("Lista");
        a1.limpar();
        a1.abrir();

        System.out.println(a1);
    }
}
