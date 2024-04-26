public class Main {
    public static void main(String[] args) {
        // Criação do arquivo
        Arquivo a1 = new Arquivo("Texto");
        a1.abrir();
        System.out.println();

        // Edição do arquivo
        a1.editar("Esse é meu novo texto");
        a1.abrir();
        System.out.println();

        // Renomeação e limpeza do arquivo
        a1.renomear("Lista");
        a1.limpar();
        a1.abrir();
        System.out.println();

        // to String
        System.out.println(a1);
    }
}