public class Tecnico extends Funcionario {

    private String departamento;

    public Tecnico(String nome, int matricula, 
    String titulacao, double salario, String dp) {
        super(nome, matricula, titulacao, salario);
        this.departamento = dp;
    }

    @Override
    public double getValorRt() {
        System.out.println("RT de Técnico");
        if(this.getTitulacao().equals("Mestre")){
            return this.getSalario() * 0.25;
        }else if(this.getTitulacao().equals("Doutor")){
            return this.getSalario() * 0.75;
        }
        return 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
