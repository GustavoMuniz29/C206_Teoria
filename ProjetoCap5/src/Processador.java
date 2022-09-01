public class Processador {
    private  String marca;
    private  float frequenciaProcessamento;




    //Getters and Setters
    public String getMarca() { //Esse get permite acessar a marca do robo
        return marca;
    }

    public void setMarca(String marca) { //Esse set permite especificar a marca do robo
        this.marca = marca;
    }

    public float getFrequenciaProcessamento() { //Esse get permite acessar a Frequencia de Processamento do robo
        return frequenciaProcessamento;
    }

    public void setFrequenciaProcessamento(float frequenciaProcessamento) { //Esse set permite especificar a Frequencia de Processamento do robo
        this.frequenciaProcessamento = frequenciaProcessamento;
    }
}
