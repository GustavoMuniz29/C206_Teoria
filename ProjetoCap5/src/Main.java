import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner:
        Scanner valorTeclado = new Scanner(System.in);

        //______________________________________________________________________________________________________________
        /*
        //EXERCÍCIO 1 - POLIGONO REGULAR
        //Criando um objeto
        PoligonoRegular pr = new PoligonoRegular();

        //Declarações:
        int nLados;
        float cLados;

        System.out.print("Entre com o numero de lados do poligonos: ");
        nLados = valorTeclado.nextInt();
        System.out.print("Entre com o comprimento dos lados: ");
        cLados = valorTeclado.nextFloat();

        pr.calculaArea(nLados, cLados);
        System.out.println("Area: " + pr.getAreaPoligono());

        */
        //______________________________________________________________________________________________________________
        /*
        //Criando dois objetos de conta
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        System.out.println("Total de contas criadas: " + Conta.totalDeContas);
        */
        //______________________________________________________________________________________________________________
        //EXERCÍCIO 2 - FABRICA DE ROBOS

        //ATRIBUTOS:
        //Array de Robos
        Robo[] robos = new Robo[10];
        int contaRobos = 0;
        boolean criarRobo;
        boolean temProcessador;
        boolean mostrarRobos;

        //Interface:
        System.out.print("Deseja fabricar um robo? ");
        criarRobo = valorTeclado.nextBoolean();

        while (criarRobo) {

            //Meu array de robos comporta até 10 robos, no 11°, devo parar de criar
            if (contaRobos < 10) {

                System.out.print("Este robo tera um processador? ");
                temProcessador = valorTeclado.nextBoolean();

                //Criando o objeto robo
                robos[contaRobos] = new Robo(temProcessador);
                contaRobos++;
            }
            else{
                System.out.println("Voce já criou sua quantidade maxima de robos de hoje! :(");
                break;
            }

            System.out.print("Deseja fabricar outro robo? ");
            criarRobo = valorTeclado.nextBoolean();
        }

        //Amostragem:
        System.out.print("Deseja mostrar os robos que foram criados? ");
        mostrarRobos = valorTeclado.nextBoolean();

        if (mostrarRobos) {
            for (Robo r : robos) {
                if (r != null) {
                    r.mostraConfigRobo();
                }
            }
        } else System.out.println("Seus robos foram fabricados!");

    }
}
