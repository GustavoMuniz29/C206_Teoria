import java.util.Objects;
import java.util.Scanner;

public class IF_Pokemons {
    public static void main(String[] args) {
        //VARIABLES
        String element;
        String fire = "Fogo";
        String water = "Agua";
        String eletric = "Eletricidade";
        String stone = "Pedra";
        String ice = "Gelo";
        String plant = "Planta";

        //INPUT's:

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o elemento do Pokemom:");
        element = input.nextLine();

        //PROCESS and OUTPUT's:

        /* Objects.equals(variable, comparator) -> quando temos comparações
           entre variaveis literais e não literais, ou seja, queremos comparar
           o conteúdo e não os endereços...
           (NECESSÁRIO O USO DA BIBLIOTECA JAVA.UTIL.OBJECTS)
        */
        
        if (Objects.equals(element, fire)) {
            System.out.println("A fraqueza do seu pokemom eh Agua!");
        } else if (Objects.equals(element, water)) {
            System.out.println("A fraqueza do seu pokemom eh Eletricidade!");
        } else if (Objects.equals(element, eletric)) {
            System.out.println("A fraqueza do seu pokemom eh Pedra!");
        } else if (Objects.equals(element, stone)) {
            System.out.println("A fraqueza do seu pokemom eh gelo!");
        } else if (Objects.equals(element, ice)) {
            System.out.println("A fraqueza do seu pokemom eh Fogo!");
        } else if (Objects.equals(element, plant)) {
            System.out.println("A fraqueza do seu pokemom eh Fogo!");
        } else {
            System.out.println("A fraqueza desse pokemom eh desconhecida!");
        }
    }
}

