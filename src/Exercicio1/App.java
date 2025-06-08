package Exercicio1;

public class App {
    public static void main(String[] args) {
    // Criação das tarefas
    BackupDeDados b1 = new BackupDeDados("Backup diário");
    BackupDeDados b2 = new BackupDeDados("Backup semanal");
    BackupDeDados b3 = new BackupDeDados("Backup mensal");

    RelatorioFinanceiro r1 = new RelatorioFinanceiro("Relatório mensal");
    RelatorioFinanceiro r2 = new RelatorioFinanceiro("Relatório trimestral");
    RelatorioFinanceiro r3 = new RelatorioFinanceiro("Relatório anual");

    LimpezaDeSistema l1 = new LimpezaDeSistema("Limpeza diária");
    LimpezaDeSistema l2 = new LimpezaDeSistema("Limpeza semanal");
    LimpezaDeSistema l3 = new LimpezaDeSistema("Limpeza mensal");

    // Criação do sistema de tarefas
    SistemaDeTarefas sistema = new SistemaDeTarefas(); //cria uma nova instancia de sistema tarefas e armazenando ela em sistemas

    // Adicionando tarefas ao sistema
    sistema.adicionarTarefa(b1);
    sistema.adicionarTarefa(b2);
    sistema.adicionarTarefa(b3);
    sistema.adicionarTarefa(r1);
    sistema.adicionarTarefa(r2);
    sistema.adicionarTarefa(r3);
    sistema.adicionarTarefa(l1);
    sistema.adicionarTarefa(l2);
    sistema.adicionarTarefa(l3);
    System.out.println("\n");

    // Operações
    sistema.agendarTodas("17:00");
    sistema.executarTodas();
    sistema.monitorarTarefa();

    }
}
