package construtoresJava;


public class Main {
    public static void main(String[] args){
        Funcionario luiz = new Funcionario();
        Funcionario mel = new Funcionario("Melissa", "Fernandes", "Feminino", 19, 10, 7000);
        
        System.out.println(luiz.nome);
        System.out.println(mel.nome);
    }
}
