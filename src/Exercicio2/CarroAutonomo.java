package Exercicio2;
public class CarroAutonomo extends VeiculoAutonomo{

    public CarroAutonomo(String tipo, int capacidade){
    super(tipo, capacidade);
    }

    @Override
    public void exibirStatus(){ //metodo abstrato de veiculo autonomo.
    System.out.println("=== Status do Carro Autônomo ===");
    System.out.println("Tipo: " + tipo);
    System.out.println("Capacidade: " + capacidade + "kg");
    System.out.println("Destino atual: " + destinoAtual);

    if (emRota) {
        System.out.println("Em rota: Sim");
    } else {
        System.out.println("Em rota: Não");
    }

    if (carregado) {
        System.out.println("Carregado: Sim");
    } else {
        System.out.println("Carregado: Não");
    }
        }


    @Override
    public void iniciarRota(String destino){
        System.out.println("Iniciando rota | destino: " + destino);
    }
   
    @Override
    public String parar(){
        return "Navegacao interrompida.";
    }

    @Override
    public String monitorarPosicao(){
        return "posicao atual do veiculo.";
    }

    @Override
    public void carregar(int peso){
        if(peso > 0 && peso >= 500){
            System.out.println("Transportando" + peso);
        }else{
            System.out.println("Transporte de ate 500kg");
        }
    }

    @Override
    public String descarregar(){
        return "Item descarregado.";
    }
}