import java.util.Scanner;

public class SWITCH_Pokemons {
    public static void main(String[] args) {
        //VARIABLES
        int element;

        //INPUT's:

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o elemento do Pokemom: (1 - Fogo | 2 - Agua | 3 - Eletricidade | 4 - Pedra | 5 - Gelo | 6 - Planta");
        element = input.nextInt();

        //PROCESS and OUTPUT's:

        switch (element) {
            case 1 -> System.out.println("A fraqueza do seu pokemom eh Agua!");
            case 2 -> System.out.println("A fraqueza do seu pokemom eh Eletricidade!");
            case 3 -> System.out.println("A fraqueza do seu pokemom eh Pedra!");
            case 4 -> System.out.println("A fraqueza do seu pokemom eh Gelo");
            case 5 -> System.out.println("A fraqueza do seu pokemom eh Fogo");
            case 6 -> System.out.println("A fraqueza do seu pokemom eh Fogo");
        }
    }
}
