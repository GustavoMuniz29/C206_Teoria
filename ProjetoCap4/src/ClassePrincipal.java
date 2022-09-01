public class ClassePrincipal {
    public static void main(String[] args) {
        /*
        CARACTERÍSTICAS IMORTANTES DE UM ARRAY
        1.Tem tamanho definido
        2.Guarda elementos homêneos
        3.É declarado como um objeto (new)
        */

        /*
        ARRAY's
        - Array's de primitivos guardam valores...
        - Array's de objetos guardam referências...
        -
        */

        /*
        Declarando o Array
        Parte 1 - criando como se fosse um vetor
        Parte 2 - criando um ponteiro
        */

        //Declaração de um array de primitivos...
        //int[] numeros = new int[10];

        /*Colocando elementos no Array
        numeros[0] = 15;
        numeros[8] = 20;
        */

        /*for (int numero : numeros) { // numeros.length -> tamanho do vetor
            System.out.println(numero);
        }*/

        /* Criando um "Array de Objetos"
        Conta[] contas = new Conta[10];

        //Criando contas
        Conta c1 = new Conta();
        c1.numero = 77;

        Conta c2 = new Conta();
        c2.numero = 88;

        /*Aqui estamos pedindo para que
        * cada posição do nosso array
        * aponte para um objeto diferente...

        contas[0] = c1;
        contas[1] = c2;
        contas[2] = new Conta();
        contas[2].numero = 99;

        for (Conta aux:
             contas) {
            if(aux != null){
                System.out.println(aux.numero);
            }
        }
        */

        //EXERCICIO - ROCK BAND

        //Criando musicos
        Musico mu1 = new Musico();
        mu1.nome = "Joelma";
        mu1.funcao = "Cantora";

        Musico mu2 = new Musico();
        mu2.nome = "Chimbinha";
        mu2.funcao = "Guitarra";

        Musico[] musicos = new Musico[50];
        musicos[0] = mu1;
        musicos[1] = mu2;

        //Criando musicas
        Musica music1 = new Musica();
        music1.nome = "A lua me traiu";
        music1.tempo = "3:00";

        Musica music2 = new Musica();
        music2.nome = "Vendaval";
        music2.tempo = "3:30";

        Musica[] musicas = new Musica[50];
        musicas[0] = music1;
        musicas[1] = music2;

        //Criando Banda
        Banda banda1 = new Banda("Calypso", "Axeh", null, musicos, musicas);
        banda1.mostraInfosBanda();;
    }
}
