import java.util.Scanner;

public class GoRangers {
    public static void main(String[] args) {
        //VARIAVEIS:
        int year_1 = 0;
        int year_2 = 0;
        int year_3 = 0;

        //INITIAL OUTPUT's:
        System.out.println("Foram apreendidos no ano 1: " + year_1 + " viloes");
        System.out.println("Foram apreendidos no ano 2: " + year_2 + " viloes");
        System.out.println("Foram apreendidos no ano 3: " + year_3 + " viloes");

        //INPUT's:
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com os viloes apreendios no ano 1:");
        year_1 = input.nextInt();
        System.out.println("Entre com os viloes apreendios no ano 2:");
        year_2 = input.nextInt();
        System.out.println("Entre com os viloes apreendios no ano 3:");
        year_3 = input.nextInt();

        //OUTPUT's:
        System.out.println("Foram apreendidos no ano 1: " + year_1 + " viloes");
        System.out.println("Foram apreendidos no ano 2: " + year_2 + " viloes");
        System.out.println("Foram apreendidos no ano 3: " + year_3 + " viloes");
    }
}
