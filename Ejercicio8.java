import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce la primer nota: ");
        double primerNota =sc.nextDouble(); ;
        System.out.printf("Introduce la segunda nota: ");
        double segundaNota=sc.nextDouble();;
        System.out.printf("Introduce la tercera nota: ");
        double terceraNota=sc.nextDouble();
        double total = ((primerNota+segundaNota+terceraNota)/3);
        System.out.printf("La media de tus tres notas es de : %.2f",total, " ");
        sc.close();
        if (total<5){
            System.out.print(" Tienes un insuficiente en el boletín");
        }
        if (total >= 5 && total < 6){
            System.out.print(" Tienes un suficiente");
        }
        if (total >= 6 && total <7){
            System.out.print(" Tienes un bien");
        }
        if (total >= 7 && total <= 8){
            System.out.print(" Tienes un notable");
        }
        if (total >= 9 && total <=10){
            System.out.print(" Tienes un sobresaliente");
        }
    
    }
}