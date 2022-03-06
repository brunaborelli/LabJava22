
public class Retangulo {
    
    private int lado1, lado2;

    public void setLado1(int la){
        this.lado1 = la;
    }
    public int getLado1(){
        return this.lado1;
    }

    public void setLado2(int la){
        this.lado2 = la;
    }
    public int getLado2(){
        return this.lado2;
    }

    public int area(){
        return lado1 * lado2;
    }

    public int perimetro(){
        return lado1 + lado2;
    } 
       
}
