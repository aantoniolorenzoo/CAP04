import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.printf("Introduce el numero correspondiente al dia que desee: ");
        int dia = sc.nextInt();
        sc.close();
        switch(dia){
            case 1:
            if (dia == 1){
                System.out.printf("!!!Es Lunes¡¡¡");
            }
            break;
            case 2:
            if (dia == 2){
                System.out.printf("!!!Es Martes¡¡¡");
            }
            break;
            case 3:
            if (dia == 3){
                System.out.printf("!!!Es Miércoles¡¡¡");
            }
            break;
            case 4:
            if (dia == 4){
                System.out.printf("!!!Es Jueves¡¡¡");
            }
            break;
            case 5:
            if (dia == 5){
                System.out.printf("!!!Es Viernes¡¡¡");
            }
            break;
            case 6:
            if (dia == 6){
                System.out.printf("!!!Es Sábado¡¡¡");
            }
            break;
            case 7:
            if (dia == 7){
                System.out.printf("!!!Es Domingo¡¡¡");
            }
            break;
        }
    }
}
