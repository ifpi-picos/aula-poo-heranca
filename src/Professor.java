public class Professor extends Funcionario {

    private String eixo;

    public Professor(String nome, int matricula, String titulacao, double salario, String eixo) {
        super(nome, matricula, titulacao, salario);
        this.eixo = eixo;
    }

    @Override
    public double getValorRt() {
        System.out.println("RT de Professor");
        if(this.getTitulacao().equals("Mestre")){
            return this.getSalario() * 0.5;
        }else if(this.getTitulacao().equals("Doutor")){
            return this.getSalario();
        }
        return 0;
    }

    public String getEixo() {
        return eixo;
    }

    public void setEixo(String eixo) {
        this.eixo = eixo;
    }
    
}
