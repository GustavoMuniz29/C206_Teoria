public class Conta {

    //ATRIBUTOS DA CONTA
    private int numero;
    private float saldo;
    private String proprietario;

    //Atributo de classe
    static int totalDeContas = 0;

    //CRIANDO UM CONSTRUTOR
    Conta() {
        System.out.println("Construtor simples sendo criado!");
        totalDeContas++;
    }

    Conta(int n, float s, String p) {
        System.out.println("Objeto conta sendo criado!");
        totalDeContas += 1;
        numero = n;
        saldo = s;
        proprietario = p;
    }

    //METODO
    public void sacarDinheiro(float valor) {
        //Controlando a operação de saque
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
