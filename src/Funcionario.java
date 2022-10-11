public abstract class Funcionario{
    private String nome;
    private int matricula;
    private String titulacao;
    private double salario;
    
    public Funcionario(String nome, int matricula, String titulacao, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public abstract double getValorRt();

    public double getSalarioTotal()
    {
        return this.salario + getValorRt();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}