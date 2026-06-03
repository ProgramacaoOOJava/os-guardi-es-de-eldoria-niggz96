public class Mago extends Personagem { // classe concreta que representa um mago, que é um tipo específico de personagem em um jogo de RPG
    double inteligencia; // atributo específico do mago, representando sua inteligência

    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double inteligencia) { // construtor para inicializar os atributos do mago, chamando o construtor da classe pai (Personagem) para inicializar os atributos comuns a todos os personagens 
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }

    @Override
    public void usarHabilidadeEspecial() { // implementação do método abstrato da classe Personagem, onde o mago usa sua habilidade especial, que é a Bola de Fogo
        System.out.println("O mago usa sua habilidade especial: Bola de Fogo!");
    }
}
