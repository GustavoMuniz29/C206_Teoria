import java.util.Objects;
import java.util.Scanner;

public class MarioKart {
    public static void main(String[] args) {
        //Scanner's:
        Scanner piloto = new Scanner(System.in);
        Scanner kart = new Scanner(System.in);
        //Scanner motor = new Scanner(System.in);

        //Variaveis:
        int i;

        //Proccess:
        for (i = 1; i <= 1; i++) {
            //Entrada de dados:
            //Ponteiro de piloto
            Piloto p = new Piloto();
            //Ponteiro de kart
            Kart k = new Kart();

            System.out.println("Entre com os dados do " + i + "° piloto:");
            System.out.print("Nome: ");
            p.nomePiloto = piloto.nextLine();
            System.out.print("Vilao? ");
            p.vilao = piloto.nextBoolean();

            System.out.println("Entre com os dados do Kart do Piloto " + p.nomePiloto + ":");
            System.out.print("Nome do Kart: ");
            k.nomeKart = kart.nextLine();
            // ----> DO-WHILE?
            System.out.print("Quantas cilindradas o motor do kart possui? (50cc , 100cc ou 150cc)");
            k.motorizacao.cilindradas = kart.nextLine();// <----
            System.out.print("Qual a velocidade máxima do Kart? ");
            k.motorizacao.velocidadeMaxima = kart.nextFloat();

            //Saída de Dados:
            System.out.println("Nome do piloto: " +p.nomePiloto);
            System.out.println("Nome do kart: " +k.nomeKart);
            System.out.println("Potencia: " +k.motorizacao.cilindradas);
            System.out.println("Velocidade Maxima: " +k.motorizacao.velocidadeMaxima);
            if (i == 1) {
                p.soltaSuperPoder();
                System.out.print("e");
                k.pular();
            } else
                k.soltarTurbo();
            System.out.println("para tentar ganhar a corrida!");
            if(p.vilao == false)
                System.out.println("Este piloto nao eh um vilao");
            else
                System.out.println("O vilao nao pode vencer!");
        }
    }
}
