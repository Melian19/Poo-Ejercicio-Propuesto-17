import java.util.Scanner;

public class PooEj17{
    public static void main(String[] args){
        System.out.println("Ingrese el radio del circulo: ");
        Scanner entrada = new Scanner(System.in);
        double radio = entrada.nextDouble();
        double perimetro = 2 * radio * Math.PI;
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("El area del circulo es: "+area);
    }
}
