package Exercicio2;

public abstract class VeiculoAutonomo implements Carregavel, Navegavel {
    protected String tipo;           // tipo de veículo
    protected int capacidade;        // capacidade máxima de carga
    protected String destinoAtual;   // destino atual do veículo
    protected boolean emRota;        // se está em rota
    protected boolean carregado;     // se está carregado

    public VeiculoAutonomo(String tipo, int capacidade){
    this.tipo = tipo;
    this.capacidade = capacidade;
    this.destinoAtual = "Nenhum";
    this.emRota = false;
    this.carregado = false;
    }


    //getters
    public String getTipo(){
        return tipo;
    }

    public int getCapacidade(){
        return capacidade;
    }
    // Métodos abstratos a serem implementados pelas subclasses
    public abstract void exibirStatus();


    public abstract void iniciarRota(String destino);
    public abstract String parar();
    public abstract String monitorarPosicao();
    public abstract void carregar(int peso);
    public abstract String descarregar();
}
//como a classe é abstrata, ela pode apenas declarar que implementa as interfaces e deixar para as subclasses as implementações