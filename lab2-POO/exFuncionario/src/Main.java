
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Funcionario nick = new Funcionario();
        Funcionario bru = new Funcionario();
        
        //Nick
        System.out.print("Digite o nome do funcionario: ");
        nick.setNome(sc.nextLine());
        System.out.print("Digite o sobrenome do funcionario: ");
        nick.setSobrenome(sc.nextLine());
        System.out.print("Digite o salário do funcionario: ");
        nick.setSalario(sc.nextDouble());
        
        //Bru
        System.out.print("Digite o nome do funcionario: ");
        bru.setNome(sc.nextLine());
        System.out.print("Digite o sobrenome do funcionario: ");
        bru.setSobrenome(sc.nextLine());
        System.out.print("Digite o salário do funcionario: ");
        bru.setSalario(sc.nextDouble());   
        
        System.out.println("\nNome:  " + nick.getNome() + " " + nick.getSobrenome() +
                            "\nSalário Mensal = " + nick.getSalario() +
                            "\nSalário Anual = R$" + nick.salarioAnual() +
                            "\n\nNome: " + bru.getNome() + " " + bru.getSobrenome() +
                            "\nSalário Mensal = " + bru.getSalario() +
                            "\nSalário Anual = R$" + bru.salarioAnual());
        
        nick.setSalario(nick.getSalario() * 1.1);
        bru.setSalario(bru.getSalario() * 1.1);
        
        System.out.println("\nSalários anuais reajustados: " +
                            "\nNome:  " + nick.getNome() + " " + nick.getSobrenome() +
                            "Salário Reajustado = R$" + nick.salarioAnual() +
                            "\nNome:  " + bru.getNome() + " " + bru.getSobrenome() +
                            "Salário Reajustado = R$" + bru.salarioAnual());
        
        sc.close();
 
    }   
}
