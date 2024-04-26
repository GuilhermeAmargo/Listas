public class Arquivo {
    //Atributos
    private String nome;
    private int tamanho;
    private String conteudo;

    //Construtor

    public Arquivo(String nome) {
        this.nome = nome;
        this.tamanho = 0;
        this.conteudo = "";
    }


    //Metodos
    public boolean abrir (){
        if(nome.isEmpty()){
            return false;
        }
        System.out.println("Nome: "+getNome()+"\n"+
                "Conteúdo: "+getConteudo()+"\n"+
                "Tamanho: "+getTamanho());
            return true;
    }

    public boolean editar (String editarCont){
        if(nome.isEmpty()){
            return false;
        }
        conteudo = editarCont;
        tamanho = conteudo.length()*8;
        return true;
    }


    public boolean renomear (String novoNome){
        if(nome.isEmpty()){
            return false;
        }
        nome = novoNome;
        return true;
    }

    public boolean limpar (){
        if(nome.isEmpty()){
            return false;
        }
        conteudo = "";
        tamanho = conteudo.length()*8;
        return true;
    }
    //Getter Setter

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    //to String()

    @Override
    public String toString() {
        return "Arquivo{" +
                "nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
