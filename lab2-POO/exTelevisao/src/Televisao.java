import java.util.Scanner;

public class Televisao {
Scanner sc = new Scanner(System.in);

    private String modelo;
    private float preco, tamanho;
    private int volume, canal;
    private boolean ligada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public void alteraVolume(int volume){
        int va = volume;
        int i = 3;
        System.out.print("\nVolume padrão: " + va);
        do{
            System.out.println("\n0: Diminuir \n1: Aumentar \n2: Finalizar");
            i = sc.nextInt();
            switch(i){
                case 0:
                    va -= 2;
                    break;
                case 1: 
                    va += 2;
                    break;
                case 2:
                    break;
            }
            
            System.out.println("\nVolume atual: " + va + "\n");
            
        } while (i != 2);
    }
        
    public void alteraCanal(int canal){
        int chan = canal;
        int i = 3;
        System.out.print("\nCanal: " + chan);
        do{
            System.out.println("\n0: canal anterior \n1: próximo canal \n2: Finalizar");
            i = sc.nextInt();
            switch(i){
                case 0:
                    chan -= 1;
                    break;
                case 1: 
                    chan += 1;
                    break;
                case 2:
                    break;
            }
    
            System.out.println("\nCanal atual: " + chan + "\n");
        } while (i != 2);
        
    }
}
