package construtoresJava;


public class Funcionario {
    String nome, sobrenome, sexo;
    int idade, numero;
    double salario;
    
    Funcionario(){
    }
    
    Funcionario(String nome,
                String sobrenome,
                String sexo,
                int idade,
                int numero,
                double salario){
            
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.numero = numero;
        this.salario = salario;
    }
}
