import java.util.Random;

public class CanYouGuessTheNumber {
    public static void main(String[] args) {
        //VARIABLES:
        int i = 0;
        int aleatoryNumber;

        //SELECTING ALEATORY NUMBER:
        Random randomGenerator = new Random();
        aleatoryNumber = randomGenerator.nextInt(10)+1;

        //PROCESS:
        while(i != aleatoryNumber){
            i++;
        }

        //OUTPUT:
        System.out.println("O numero aleatorio sorteado foi " +i);
    }
}
