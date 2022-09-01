public class Kart {
    //ATRIBUTOS:
    String nomeKart;
    Motor motorizacao;
    //AÇÕES:
    void pular() {
        System.out.print(" pula com seu Kart ");
    }

    void soltarTurbo() {
        System.out.print(" solta o turbo ");
    }

    void fazerDrift() {
        System.out.print(" faz drift ");
    }
}

class Motor {
    String cilindradas;
    float velocidadeMaxima;
}
