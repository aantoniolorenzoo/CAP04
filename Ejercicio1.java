import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un dia de la semana para decirle que asignatura tiene a primera hora: ");
        String dia = sc.next();
        dia.toLowerCase();
        sc.close();
        switch(dia){
            case "Lunes":
            System.out.printf("Usted tiene a primera Programación");
            break;
            case "Martes":
            System.out.printf("Usted tiene a primera hora FOL");
            break;
            case "Miércoles":
            System.out.printf("Usted tiene a primera base de datos");
            break;
            case "Jueves":
            System.out.printf("Usted tiene a primera Sistemas informáticos");
            break;
            case "Viernes": 
            System.out.printf("Usted tiene a primera entornos de desarrollo");
            break;
            case "Sábado":
            System.out.printf("Usted hoy no tiene clases");
            break;
            case "Domingo": 
            System.out.printf("Usted no tiene clases hoy");
            break;
            default:
            System.out.printf("La opción introducida no es correcta");
        }
    }
}