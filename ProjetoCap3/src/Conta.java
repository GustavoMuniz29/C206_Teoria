public class Conta {
    //ATRIBUTOS:
    int numero;
    float saldo;
    float limite;
    Cliente titular;

    //MÉTODOS:
    void saca(float quantia){ //SACAR DINHEIRO...
        float novoSaldo = saldo - quantia;
        saldo -= novoSaldo;
    }

    void deposita(float quantia){//DEPOSITAR DINHEIRO...
        saldo += quantia;
    }

    void transfere(Conta contaDestino, float valor){//TRANSFERIR DINHEIRO DE UMA CONTA PRA OUTRA...
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
}
class Cliente {
    String nome;
    String sobrenome;
    String cpf;
}
