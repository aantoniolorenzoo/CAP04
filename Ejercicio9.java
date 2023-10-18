import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        double total1;
        double total2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el valor de c:");
        double c = sc.nextDouble();
        sc.close();
        double total = (Math.sqrt((b*b)-(4*a*(c))));
        total1 = (-b +(total)/2*a);
        total2 = (-b -(total)/2*a);
        System.out.printf("Tu solución es %.2f\n",total1);
        System.out.printf("Tu solución es %.2f",total2);
    }
}
