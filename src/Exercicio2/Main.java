package Exercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SistemaDeTransporte sistema = new SistemaDeTransporte(); //criando uma instancia de SistemaDeTransporte
        CarroAutonomo ca1 = new CarroAutonomo("Carro Autônomo 1", 500);
        CarroAutonomo ca2 = new CarroAutonomo("Carro Autônomo 2", 500);
        CarroAutonomo ca3 = new CarroAutonomo("Carro Autônomo 3", 500);

        CaminhaoAutonomo cam1 = new CaminhaoAutonomo("Caminhão Autônomo 1", 5000);
        CaminhaoAutonomo cam2 = new CaminhaoAutonomo("Caminhão Autônomo 2", 5000);
        CaminhaoAutonomo cam3 = new CaminhaoAutonomo("Caminhão Autônomo 3", 5000);

        DroneAutonomo da1 = new DroneAutonomo("Drone Autônomo 1", 50);
        DroneAutonomo da2 = new DroneAutonomo("Drone Autônomo 2", 50);
        DroneAutonomo da3 = new DroneAutonomo("Drone Autônomo 3", 50);

        sistema.adicionarVeiculo(ca1);
        sistema.adicionarVeiculo(ca2);
        sistema.adicionarVeiculo(ca3);

        sistema.adicionarVeiculo(cam1);
        sistema.adicionarVeiculo(cam2);
        sistema.adicionarVeiculo(cam3);

        sistema.adicionarVeiculo(da1);
        sistema.adicionarVeiculo(da2);
        sistema.adicionarVeiculo(da3);

        sistema.iniciarRotaVeiculo(2, "São Paulo");
        sistema.carregarVeiculo(3);
        sistema.iniciarRotaVeiculo(2, "Rio de Janeiro");
        sistema.monitorarTodos();
    }
}
