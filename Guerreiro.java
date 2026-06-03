public class Guerreiro extends Personagem { // classe concreta que representa um guerreiro, que é um tipo específico de personagem em um jogo de RPG
    double forca; // atributo específico do guerreiro, representando sua força física

    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("O guerreiro usa sua habilidade especial: Ataque Poderoso!");
    }
}
