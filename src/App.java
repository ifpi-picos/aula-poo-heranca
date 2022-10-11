public class App {
    public static void main(String[] args) throws Exception {
       Funcionario f1 = new Professor("Bob", 
       999, "Doutor", 5000, "Info");

       Funcionario f2 = new Tecnico("Bob", 
       999, "Doutor", 5000, "Contabilidade");

       Funcionario f3 = new Funcionario(null, 0, null, 0);

       System.out.println(f1.getSalarioTotal());
       System.out.println(f2.getSalarioTotal());
    }
}
