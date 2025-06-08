package Exercicio1;

public class LimpezaDeSistema implements Agendavel {
    private String descricao;
    public LimpezaDeSistema(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    
    public void agendar(String horario){
        if(horario != null){
            System.out.println("Limpeza do sistema agendada para " + horario);
        } else{
            System.out.println("Insira um horario permitido.\n");
        }
    }
    public String executar(){
        return "Limpeza do sistema executada com sucesso.\n";

    }
    public String monitorar(){
        return "Limpeza do sistema esta sendo monitorada\n";
    }

     @Override
    public String toString() {
        return "LimpezaDeSistema: " + descricao;
    }
}
