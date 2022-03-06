
public class Funcionario {
    private String nome, sobrenome;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if(salario <= 0){
            this.salario = 0.0;
        } else {
            this.salario = salario;
        }
    }
        
    public double salarioAnual(){
        return this.salario * 12;
        //System.out.println("Salario anual: " + sa);
    }
}
