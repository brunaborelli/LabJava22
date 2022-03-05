package excarro;

import java.util.Scanner;

public class ExCarro {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Carro ca = new Carro("corsa", "amarelo", 1998);
        
        System.out.print("Marca: ");
        ca.setModelo(sc.nextLine());
        System.out.print("Cor: ");
        ca.setCor(sc.nextLine());
        System.out.print("Ano: ");
        ca.setAno(sc.nextInt());
        
        System.out.println(ca.getModelo() +
                    "\n" + ca.getCor() +
                    "\n" + ca.getAno());        
    }
    
}
