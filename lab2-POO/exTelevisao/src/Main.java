
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        /* private String modelo;
        private float preco, tamanho;
        private int volume, canal;
        private boolean ligada;
        
        Televisao tv = new Televisao();
        tv.setVolume(20);
        tv.alteraVolume(tv.getVolume()); */
        
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        
        System.out.print("Digite o modelo da tv1: ");
        tv1.setModelo(sc.nextLine());
        tv1.getModelo();
        
        System.out.print("Digite o preço da tv1: ");
        tv1.setPreco(sc.nextFloat());
        tv1.getPreco();
        
        System.out.print("Digite o tamanho da tv1: ");
        tv1.setTamanho(sc.nextFloat());
        tv1.getTamanho();
        
        System.out.print("Digite o volume da tv1: ");
        tv1.setVolume(sc.nextInt());
        tv1.alteraVolume(tv1.getVolume());
        
        System.out.print("Digite o canal da tv1: ");
        tv1.setCanal(sc.nextInt());
        tv1.alteraCanal(tv1.getCanal());
        
        System.out.print("Digite o modelo da tv2: ");
        tv2.setModelo(sc.nextLine());
        tv2.getModelo();
        
        System.out.print("Digite o preço da tv2: ");
        tv2.setPreco(sc.nextFloat());
        tv2.getPreco();
        
        System.out.print("Digite o tamanho da tv2: ");
        tv2.setTamanho(sc.nextFloat());
        tv2.getTamanho(); 
        
        System.out.print("Digite o volume da tv2: ");
        tv2.setVolume(sc.nextInt());
        tv2.alteraVolume(tv2.getVolume());
        
        System.out.print("Digite o canal da tv2: ");
        tv2.setCanal(sc.nextInt());
        tv2.alteraCanal(tv2.getCanal());
        
        tv2.setLigada(false);
        
        sc.close();
    }
}
