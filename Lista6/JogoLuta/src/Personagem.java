import java.util.Random;
public class Personagem {

    //Atributos
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    Random valor = new Random();

    //Construtor

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ataque = valor.nextInt(11)+20;
        this.defesa = valor.nextInt(6)+10;
    }


    //Metodos
    public boolean ataque (Personagem personagem){
        if(vida <= 0 || personagem.vida <= 0)
            return false;
        if(vida > 0 && personagem.vida >= ataque - personagem.defesa){
            personagem.vida -= ataque - personagem.defesa;
            if(vida > 0 && personagem.vida <= ataque - personagem.defesa){
                personagem.vida = 0;
            }
        }
        return true;
    }

    //Getter Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }


    //to String ()

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defesa=" + defesa +
                '}';
    }
}
