import java.util.Scanner;

public class ClassePrincipal {
    //java main
    public static void main(String[] args) {
        // -> one line comment
        /*
        multi line comment
         */
        //**
         /* java doc
         */

        //PRIMITIVE: int, float, char -> guardar valores
        //CLASS: string -> guardar valores, usar variaveis, funções pré-pontos

        //CRIANDO UM TIPO PRIMITIVO:
        int idade = 21;

        //CRIANDO UMA CLASSE:
        String nome = "Nenhum";

        //______________________________________________________________________________________

        /*
            Variáveis dentro de um escopo só existem dentro do escopo em que
            ela foi criada!
        */

        //______________________________________________________________________________________

        //COMO FAZER ENTRADA DE DADOS:
        //SCANNER CLASS
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com seu name:");
        nome = leitor.nextLine();

        // SAIDA:
        System.out.println("My name is: " +nome+
                " and age is " +idade);
        //TUDO EM MAIUSCULO:
        System.out.println(nome.toUpperCase());
        //TUDO EM MINUSCULO:
        System.out.println(nome.toLowerCase());
        //TAMANHO DA STRING:
        System.out.println(nome.length());

        //CASTING e PROMOÇÃO:
        long x = 10000;
        int i = (int) x;

        System.out.println("X: " +x);
        System.out.println("i: " +i);
    }
}
