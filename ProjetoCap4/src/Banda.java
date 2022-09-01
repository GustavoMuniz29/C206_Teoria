public class Banda {

    //Construtor da Classe
    Banda(String name, String gen,
          Empresario e, Musico[] m,
          Musica[] mu){
        nome = name;
        genero = gen;
        emp = e;
        musicos = m;
        musicas = mu;
    }
    //Atributos Explicitos
    public String nome;
    public String genero;

    //Atributos Implicitos
    public Empresario emp;
    public Musico[] musicos;
    public Musica[] musicas;

    //Método
    public void mostraInfosBanda(){
        System.out.println("Nome da Banda: " +nome);
        System.out.println("Genero: " +genero);
        //Verificando se temos empresario...
        if (emp != null){
            System.out.println("Dados do Empresario:");
            System.out.println("Nome do Empresario: " +emp.nome);
            System.out.println("CNPJ: " +emp.cnpj);
        }
        //Mostrando os musicos:
        System.out.println("Musicos da Banda:");
        for (int i = 0; i < musicos.length; i++) {
            //Vericando a posicao de um array
            if(musicos[i] != null){
                System.out.println("Musico: " +musicos[i].nome);
                System.out.println("Funcao: " +musicos[i].funcao);
            }
        }
        //Mostrando as musicas:
        System.out.println("Musicas da Banda:");
        for (int i = 0; i < musicas.length; i++) {
            //Vericando a posicao de um array
            if(musicas[i] != null){
                System.out.println("Musica: " +musicas[i].nome);
                System.out.println("Tempo: " +musicas[i].tempo);
            }
        }
    }
}
