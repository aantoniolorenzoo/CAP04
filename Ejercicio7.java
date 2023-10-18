import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce la primer nota: ");
        double primerNota =sc.nextDouble(); ;
        System.out.printf("Introduce la segunda nota: ");
        double segundaNota=sc.nextDouble();;
        System.out.printf("Introduce la tercera nota: ");
        double terceraNota=sc.nextDouble();
        double total = ((primerNota+segundaNota+terceraNota)/3);
        System.out.printf("La media de las tres notas es: "+(total));
        sc.close();
    }
}
