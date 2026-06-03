public class Main {
    public static void main(String[] args) {
        // Criando instancias de Guerreiro e Mago
        Guerreiro talles = new Guerreiro("Talles", "Guerreiro", 10, 100, 20.5, 15.0); // criando um guerreiro chamado Talles com atributos específicos
        Mago mariana = new Mago("Mariana", "Mago", 8, 80, 25.0, 18.0); // criando um mago chamado Mariana com atributos específicos

        // Exibindo as informações do personagem
        talles.exibirStatus();
        mariana.exibirStatus();

        // Usando as habilidades especiais dos personagens
        talles.usarHabilidadeEspecial();
        mariana.usarHabilidadeEspecial();

        System.out.println("\n--- demonstracao polimorfismo ---"); // demonstrando o polimorfismo, onde ambos os personagens podem ser tratados como instâncias da classe Personagem
        List<Personagem> herois = new ArrayList<>(); // criando uma lista para armazenar personagens
        herois.add(new Guerreiro("Talles", "Guerreiro", 10, 75, 20.5, 15.0)); // adicionando o guerreiro Talles à lista de personagens
        herois.add(new Mago("Mariana", "Mago", 8, 60, 25.0, 18.0)); // adicionando o mago Mariana à lista de personagens

        for (Personagem p : herois) { // iterando sobre a lista de personagens e exibindo seus status e habilidades especiais
            p.exibirStatus(); // exibindo o status do personagem
            p.usarHabilidadeEspecial(); // usando a habilidade especial do personagem
            System.out.println("----------------------"); // adicionando uma linha em branco para melhor visualização entre os personagens
        }
    }
}
