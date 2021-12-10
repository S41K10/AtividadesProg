package AtividadeProgIII.Atividade4;

public class CartaMagia {
//     Utilizando a classe CartaLacaio como base, crie a classe CartaMagia e faça a implementação do método 
// construtor, métodos get() e set() de todos os atributos e do método toString() para a classe CartaMagia. 
// A classe CartaMagia deve ter os seguintes atributos: 
// •ID (número inteiro) 
// •nome (cadeia de caracteres - String) 
// •dano (número inteiro) 
// •area (variável da lógica booleana - boolean) 
// •custoMana (número inteiro)

private int ID;
private String nome;
private int dano;
private boolean area;
private int custoMana;

//Metodoc o n s t r u t o ra q u i
public CartaMagia(int ID, String nome, int dano,boolean area, int custoMana)
{
    this.ID = ID;
    this.nome = nome;
    this.dano = dano;
    this.area = area;
    this.custoMana = custoMana;
}
//Demaismetodosa q u i 

@Override
public String toString()
{
    String out = String.format("ID: %d\nNome: %s\nDano: %d\nArea: %b\nCusto mana: %d\n",
     ID, nome, dano, area, custoMana);
    
     return out;
}

public int getID() {
    return ID;
}

public String getNome() {
    return nome;
}

public int getDano() {
    return dano;
}

public boolean getarea() {
    return area;
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

public void dano(int dano) {
    this.dano = dano;
}

public void setArea(Boolean area)
{
    this.area = area;
}


public void setCustoMana(int custoMana) {
    this.custoMana = custoMana;
}
}
