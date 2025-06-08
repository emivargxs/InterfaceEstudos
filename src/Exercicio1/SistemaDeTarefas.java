package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeTarefas {
    List<Agendavel> listaTarefas = new ArrayList<>();
    public void adicionarTarefa(Agendavel tarefa){
        listaTarefas.add(tarefa);
        System.out.println("\n");
        }

    public void agendarTodas(String horario){
    for(Agendavel tarefa : listaTarefas){
        tarefa.agendar(horario);
    }
    System.out.println("\n");
}
    public String executarTodas(){
    for(Agendavel tarefa : listaTarefas){
        System.out.println("Tarefa executada" + tarefa);
    }
    return "Todas as tarefas executadas\n";
    }

    public String monitorarTarefa(){
    for(Agendavel tarefa : listaTarefas){
        System.out.println("Status verificado" + tarefa);
    }
    return "Todas as tarefas monitoradas\n";
    }    

}


