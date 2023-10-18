import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        int sueldo;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce las horas de trabajo realizadas: ");
        int horas = sc.nextInt();
        sc.close();
        if (horas <= 40){
            sueldo = (horas * 12);
        } else{ 
            sueldo = (horas * 16);
        }
        System.out.printf("Tus"+ " " +horas+ " "+"horas te dan el siguiente sueldo semanal: "+sueldo+" "+"euros.");
    }
}


