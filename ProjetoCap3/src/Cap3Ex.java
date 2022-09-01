public class Cap3Ex {
    public static void main(String[] args) {

        //1° Exemplo: ACESSAR INFOS DE UMA CONTA BANCÁRIA
        /*Conta novaConta = new Conta();

        novaConta.donoDaConta = "Duke";
        novaConta.saldo = 1000f;

        System.out.println(novaConta.donoDaConta+
                " seu saldo eh: R$"+novaConta.saldo);*/

        //______________________________________________________________________________________________________________

        //2° Exemplo: ACESSAR E MODIFICAR INFOS DE DUAS CONTAS BANCÁRIAS
        /*Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.saldo = 10000;
        c2.saldo = 50000;

        c2.transfere(c1, 10000f);

        System.out.println("Saldo Conta 1: R$" +c1.saldo);
        System.out.println("Saldo Conta 2: R$" +c2.saldo);*/

        //______________________________________________________________________________________________________________

        //3° Exemplo: CLASSES DENTRO DE CLASSES (CONTA BANCÁRIA)
        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        c.nome = "Gustavo";
        c.sobrenome = "Muniz";
        c.cpf = "140.145.856-46";
        minhaConta.saldo = 15000f;
        minhaConta.titular = c;

        System.out.print(minhaConta.titular.nome+ " " +minhaConta.titular.sobrenome);
        System.out.print(" portador do CPF " +minhaConta.titular.cpf);
        System.out.print(" tem de saldo de R$ " +minhaConta.saldo);
    }
}
