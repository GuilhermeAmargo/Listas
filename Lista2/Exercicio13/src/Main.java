import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int option;
        double raioC, areaC, perimeterC, baseT, heightT, areaT, perimeterT, hypotenuse, baseR, heightR, areaR, perimeterR;

        Scanner in = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");
        System.out.println("Escolha uma opção:");
        option = in.nextInt();

        if (option > 3 && option < 0){
            System.out.print("Opção inválida!");
        }
        switch (option){
            case 1:
                System.out.println("Informe o raio:");
                raioC = in.nextDouble();
                areaC = Math.PI * (Math.sqrt(raioC));
                perimeterC = 2 * Math.PI  * raioC;

                System.out.println("Área ="+areaC);
                System.out.println("Perímetro ="+perimeterC);
                break;
            case 2:
            System.out.println("Informe a base:");
            baseT = in.nextDouble();
            System.out.println("Informe a altura:");
            heightT = in.nextDouble();
            System.out.println("Informe a hipotenusa:");
            hypotenuse = in.nextDouble();

            areaT = (baseT * heightT) / 2;
            perimeterT = baseT + heightT + hypotenuse;

            System.out.println("Área="+ areaT);
            System.out.println("Perímetro="+ perimeterT);
            break;

            case 3:
                System.out.println("Informe a base:");
                baseR = in.nextDouble();
                System.out.println("Informe a altura:");
                heightR = in.nextDouble();
                areaR = baseR * heightR;
                perimeterR = 2 * (baseR + heightR);

                System.out.println("Área="+ areaR);
                System.out.println("Perímetro="+ perimeterR);
                break;
            default:
                System.out.println("Opção inválida!");
                break;



        }
    }
}