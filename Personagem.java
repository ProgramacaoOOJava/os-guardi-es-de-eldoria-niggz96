public class Personagem { // classe base para os personagens do jogo
    String nome; // nome do personagem
    String classe; // classe do personagem (guerreiro, mago, arqueiro, etc.)
    int nivel; // nível do personagem
    int pontosDeVida; // pontos de vida do personagem, que determinam sua resistência em combate
    double poderBase; // poder base do personagem, que pode ser usado para calcular o dano causado em ataques

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) { // construtor para inicializar os atributos do personagem
        this.nome = nome; // atribui o nome do personagem
        this.classe = classe; // atribui a classe do personagem
        this.nivel = nivel; // atribui o nível do personagem
        this.pontosDeVida = pontosDeVida; // atribui os pontos de vida do personagem
        this.poderBase = poderBase; // atribui o poder base do personagem
    }

    public void exibirStatus() { // método para exibir o status do personagem, mostrando seus atributos principais
        System.out.println("---------Status do Personagem---------"); // título para o status do personagem
        System.out.println("Nome: " + nome); // exibe o nome do personagem
        System.out.println("Classe: " + classe); // exibe a classe do personagem
        System.out.println("Nivel: " + nivel); // exibe o nível do personagem
        System.out.println("Pontos de Vida: " + pontosDeVida); // exibe os pontos de vida do personagem
        System.out.println("Poder Base: " + poderBase); // exibe o poder base do personagem
    }
}

