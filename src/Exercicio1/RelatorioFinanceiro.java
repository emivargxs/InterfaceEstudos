package Exercicio1;

public class RelatorioFinanceiro implements Agendavel{
    private String descricao;

    public RelatorioFinanceiro(String descricao){
    this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    public void agendar(String horario){
        if(horario != null){
            System.out.println("Relatorio Financeiro agendado para " + horario);
        }else{
            System.out.println("Insira um horario permitido.\n");
        }
    }

    public String executar(){
        return "Relatorio Financeiro executado com sucesso.\n";
    }
    public String monitorar(){
        return "Relatorio Financeiro sendo monitorado\n";
    }
     @Override
    public String toString() {
        return "RelatorioFinanceiro: " + descricao;
    }
}