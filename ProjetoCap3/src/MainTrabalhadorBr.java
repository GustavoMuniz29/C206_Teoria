import java.util.Scanner;

public class MainTrabalhadorBr {
    public static void main(String[] args) {
        //SCANNER's:
        Scanner aumentou = new Scanner(System.in);

        //TRABALHADOR BRASILEIRO:
        //1° TRABALHADOR:
        //ABRIR UM PONTEIRO:
        TrabalhadorBrasileiro t1 = new TrabalhadorBrasileiro();
        t1.nome = "Gustavo Muniz";
        t1.profissao = "Operador de Maquinas";
        t1.salario = 1500f;
        t1.rg = "MG-20.626.924";
        t1.dataDeNascimento = "29/11/2000";

        //Entrada de aumento:
        System.out.println("Quanto de aumento " +t1.nome+ " ira ganhar?");
        t1.aumento = aumentou.nextFloat();

        //CHAMAR A FUNÇÃO ATRAVÉS DO PONTEIRO:
        t1.recebeAumento(t1.aumento);
        t1.ganhoAnual = t1.calculaGanhoAnual();
        t1.mostraInfosFuncionario();

        //______________________________________________________________________________________________________________
        //2° TRABALHADOR:
        //ABRIR UM PONTEIRO:

        //REFERENCIA DO SEGUNDO TRABALHADOR:
        TrabalhadorBrasileiro t2 = new TrabalhadorBrasileiro();
        t2.nome = "Kenzo Umezawa";
        t2.profissao = "Programador Senior";
        t2.salario = 2500f;
        t2.rg = "MG-20.626.924";
        t2.dataDeNascimento = "08/02/2001";

        //Entrada de aumento:
        System.out.println("Quanto de aumento " +t2.nome+ " ira ganhar?");
        t2.aumento = aumentou.nextFloat();

        // -> SE RECEBESSE A REFERENCIA DO TRABALHADOR 1:
        // -> t2 = t1;

        //CHAMAR A FUNÇÃO ATRAVÉS DO PONTEIRO:
        t2.recebeAumento(t2.aumento);
        t2.ganhoAnual = t2.calculaGanhoAnual();
        t2.mostraInfosFuncionario();

        //______________________________________________________________________________________________________________
        //TRABALHADOR BRASILEIRO PT2.:
        //TESTE IGUADADE:
        /*if (t1 == t2){
            System.out.println("Objetos Iguais!");
        }
        else{
            System.out.println("Objetos Diferentes!");
        }*/

        //TESTE SAÍDA:
        //System.out.println(TrabalhadorBrasileiro.salario);

        /*CONCLUSÕES PT2. TRABALHADOR BRASILEIRO:
         * 1) São diferentes pois cada um foi criado como sendo objetos diferentes da mesma classe
      -> * 2) São iguais, pois usando "TrabalhadorBrasileiro t2 = t1;", estamos fazendo com que t2 compartilhe o mesmo endereço de memória de t1, e assim, se tornam iguais
         * 3) Funciona, porém, o valor que será exibido é referente a última atualização que houve na variavel em questão...
         */

    }
}
