import java.util.Date;
import java.util.Scanner;

public class Robo {

    Scanner valorTeclado = new Scanner(System.in);
    private static long serialNumberGenerator;
    private long serialNumber;
    private Date dataCriacao;

    Processador processador = new Processador();
    private boolean proc;
    Corpo corpo = new Corpo();

    //Construtor de Robos
    Robo(boolean temProcessador){

        //Infos do Robo:
        serialNumberGenerator++;
        serialNumber = serialNumberGenerator;
        dataCriacao = new Date();

        //Tem processador?
        if(temProcessador){
            proc = true;
            System.out.print("Qual processador? ");
            processador.setMarca(valorTeclado.nextLine());
            System.out.print("Qual frequencia do processador? ");
            processador.setFrequenciaProcessamento(valorTeclado.nextFloat());
            valorTeclado.nextLine();
        }

        //Corpo do Robo
        System.out.print("Qual o tipo de corpo do seu robo? ");
        corpo.setTipo(valorTeclado.nextLine());
        System.out.print("Qual a cor do seu robo? ");
        corpo.setCor(valorTeclado.nextLine());
    }

    public void mostraConfigRobo(){
        System.out.println();
        System.out.println("Infos do Robo de "
                + "Serial Number: " + serialNumber);
        System.out.println("Data de Criacao: " + dataCriacao);
        if(proc){
            System.out.println("Marca Processador: " + processador.getMarca());
            System.out.println("Frequencia de Processamento: " + processador.getFrequenciaProcessamento() + " Mhz");
        }
        System.out.println("Tipo de Corpo: " + corpo.getTipo());
        System.out.println("Cor do Corpo: " + corpo.getCor());
    }
}
