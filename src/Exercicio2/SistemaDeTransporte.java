package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeTransporte {
    List<VeiculoAutonomo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(VeiculoAutonomo veiculo){
        veiculos.add(veiculo);
    }

    public void iniciarRotaVeiculo(int indice, String destino){
        if (indice >= 0 && indice < veiculos.size()) {
            veiculos.get(indice).iniciarRota(destino);
        } else {
            System.out.println("Índice de veículo inválido!");
        }
    }

    public void carregarVeiculo(int indice){
        if(indice >0 && indice < veiculos.size()){
            veiculos.get(indice).carregar(indice);
        }else{
            System.out.println("Indice de veiculo invalido!");
        }
    }

    public void descarregarVeiculo(int indice){
        if(indice > 0 && indice < veiculos.size()){
            veiculos.get(indice).descarregar();
        }else{
            System.out.println("Indice de veiculo invalido!");
        }
    }

    public void monitorarTodos(){
        for (VeiculoAutonomo veiculo : veiculos) {
            veiculo.exibirStatus();
            System.out.println(veiculo.monitorarPosicao());
            System.out.println("-----------------------------");
        }
    }
}
