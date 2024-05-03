public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("P1");
        Personagem p2 = new Personagem("P2");
        Personagem p3 = new Personagem("P3");
        int rounds = 10;

        for (int i = 0; i <= rounds; i++) {
            p1.ataque(p2);
            p2.ataque(p3);
            p3.ataque(p1);
        }


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}