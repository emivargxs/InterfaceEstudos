package Exercicio1;

public class BackupDeDados implements Agendavel{
    private String descricao;

    public BackupDeDados(String descricao){
    this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void agendar(String horario){
        if(horario != null){
           System.out.println("Tarefa de Backup agendada para: "+ horario);
        } else{
            System.out.println("Insira um horario permitido.\n");
        }
    }
    public String executar(){
        return "Backup de dados executado com sucesso.\n";
    }
    public String monitorar(){
        return "Backup de dados esta sendo monitorado\n";
    }
    @Override
    public String toString() {
        return "BackupDeDados: " + descricao;
    }
}
