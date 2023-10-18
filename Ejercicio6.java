import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca la altura desde la que se encuentra el objeto: ");
        double h = sc.nextDouble();
        double tiempo = Math.sqrt((2*h)/9.81);
        System.out.printf("El tiempo que tardará en caer sera "+tiempo+" "+"seg");
        sc.close();
    }
}
//Math.sqrt