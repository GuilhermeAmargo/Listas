public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(7865,"Guilherme Camargo");
        if(c1.depositar(100))
            System.out.println("Deposito realizado com sucesso!");
        else
            System.out.println("Valor inválido!");
        System.out.println(c1.getSaldo());
        if(c1.sacar(13.40))
            System.out.println("Saque realizado!");
        else
            System.out.println("Valor inválido!");
        System.out.println(c1.getSaldo());
        System.out.println(c1);
    }
}