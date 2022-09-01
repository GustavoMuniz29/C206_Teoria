public class TrabalhadorBrasileiro {

    //ATRIBUTOS:
    String nome, profissao, rg, dataDeNascimento;
    static float salario;
    float aumento;
    float novoSalario;
    float ganhoAnual;

    void recebeAumento(float aumento) {
        novoSalario = (float) (salario + aumento);
    }

    float calculaGanhoAnual() {
        ganhoAnual = (float) (novoSalario * 13.0);

        return ganhoAnual;
    }

    void mostraInfosFuncionario() {
        System.out.println("Mostrando as infos de " + nome + ":");
        System.out.println("Nome: " + nome);
        System.out.println("Profissao: " + profissao);
        System.out.println("Salario: " + salario);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("Salario Atualizado: " + novoSalario);
        System.out.println("Ganho Anual: " + ganhoAnual);
    }
}
