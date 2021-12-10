package AtividadeProgIII.Atividade4;

public class CartaLacaio {
//     Faça a implementação do método construtor, métodos get() e set() de todos os atributos e do método 
// toString() para a classe CartaLacaio. 

    private int ID;
    private String nome;
    private int ataque;
    private int vidaAtual;
    private int vidaMaxima;
    private int custoMana;

    //Metodoc o n s t r u t o ra q u i
    public CartaLacaio(int ID, String nome, int ataque, int vidaAtual, int vidaMaxima, int custoMana)
    {
        this.ID = ID;
        this.nome = nome;
        this.ataque = ataque;
        this.vidaAtual = vidaAtual;
        this.vidaMaxima = vidaMaxima;
        this.custoMana = custoMana; 
    }
    //Demaismetodosa q u i 

    @Override
    public String toString()
    {
        String out = String.format("ID: %d\nNome: %s\nAtaque: %d\nVida atual: %d\nVida máxima: %d\nCusto mana: %d\n",
         ID, nome, ataque, vidaAtual, vidaMaxima, custoMana);
        
         return out;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }


}
