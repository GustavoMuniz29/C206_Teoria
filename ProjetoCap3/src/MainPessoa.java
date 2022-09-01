public class MainPessoa {
    public static void main(String[] args) {
        /* Para se criar um objeto dentro da memória, usa-se a palavra "new"
         *  Para acessar este objeto, deve-se criar um ponteiro para ele */

        Pessoa p1 = new Pessoa();
        p1.nome = "Diego";
        p1.idade = 19;
        p1.cpf = "123.456.789-00";

        Pessoa p2 = new Pessoa();
        p2.nome = "Izaque";
        p2.idade = 19;
        p2.cpf = "987.654.321-00";

        Pessoa p3 = new Pessoa();
        p3.nome = "Maria Luiza";
        p3.idade = 20;
        p3.cpf = "555.666.777-11";

        p1.comer();
        p2.dormir();
        p3.tomarAgua();
    }
}
