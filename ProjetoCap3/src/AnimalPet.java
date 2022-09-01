import java.util.Objects;
import java.util.Scanner;

public class AnimalPet {
    Scanner alimentou = new Scanner(System.in);

    //ATRIBUTOS:
    String nome;
    String especie;
    String som;
    String comida;
    int idade;
    boolean comeu = false;
    String op;

    //AÇÕES:
    void emitirSom(){
        System.out.println(nome+ " " +som+ " te pedindo " +comida);
        System.out.println("Deseja alimentar?");
        op = alimentou.nextLine();
        if(Objects.equals(op,"Sim")){
            comeu = true;
        }
        else comeu = false;
    }
    void alimentar(){
        if(comeu) {
            System.out.println(especie+ " alimentado!");
        }
        else{
            System.out.println(especie+ " nao foi alimentado!");
        }
    }
}
