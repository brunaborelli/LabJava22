
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Laser l[] = new Laser[10];
        
        //for(int i=0;i<l.length;i++){
        for(Laser i : l){
            i = new Laser();
            var input = sc.nextLine();
            System.out.print("Informe o fabricante: ");
            i.fabricante = input;
            
            System.out.print("Informe o alcance: ");
            input = sc.nextLine();
            i.alcance = input;
            
            System.out.print("Informe a precisão: ");
            input = sc.nextLine();
            i.precisao = input;
            
            System.out.print("Informe a medida: ");
            input = sc.nextLine();
            i.medida = input;
            System.out.println(i.toString());
        }
        
        
        
        
    }
}
