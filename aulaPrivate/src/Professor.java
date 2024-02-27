public class Professor {
    private double salario;
    private int matricula;
    private String nome;

    public String getNome()
    {
        return nome;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
