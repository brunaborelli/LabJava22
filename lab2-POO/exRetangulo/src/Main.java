import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();

        System.out.print("Digite o lado 1 do primeiro retangulo: ");
        ret1.setLado1(sc.nextInt());
        System.out.print("Digite o lado 2 do primeiro retangulo: ");
        ret1.setLado2(sc.nextInt());
        System.out.print("Digite o lado 1 do segundo retangulo: ");
        ret2.setLado1(sc.nextInt());
        System.out.print("Digite o lado 2 do segundo retangulo: ");
        ret2.setLado2(sc.nextInt());

        ret1.getLado1();
        ret2.getLado2();

        System.out.println("\nRetangulo 1: \narea = " + ret1.area() + "\nperimetro = " + ret1.perimetro());
        System.out.println("\nRetangulo 2: \narea = " + ret2.area() + "\nperimetro = " + ret2.perimetro());
    }
}
