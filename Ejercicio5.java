import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
    double total;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.printf("Introduzca el valor de b: ");
        double b = sc.nextDouble();
        sc.close();
        if (a != 0 ){
            b = -b;
            total = b/a;
            System.out.printf("x ="+total);
        }else{
            System.out.printf("Esa ecuación no tiene solución real");
        }
    }
}    
