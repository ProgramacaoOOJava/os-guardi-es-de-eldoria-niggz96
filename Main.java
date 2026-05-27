public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Personagem
        Personagem heroi1 = new Personagem("João", "Guerreiro", 5, 100, 10.0);
        Personagem heroi2 = new Personagem("Maria", "Maga", 3, 80, 15.0);
        Personagem heroi3 = new Personagem("Carlos", "Arqueiro", 4, 90, 12.0);

        // Exibindo as informações do personagem
        heroi1.exibirStatus();
        heroi2.exibirStatus();
        heroi3.exibirStatus();
    }
}
