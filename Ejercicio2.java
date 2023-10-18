import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una hora: ");
        int hora = sc.nextInt();
        sc.close();
        switch(hora){
        case 1:
        if ((hora > 6) && (hora < 12)) {
            System.out.printf("Buenos días");
            break;
            }
        case 2:
        if ((hora > 13 ) && (hora < 20)){
            System.out.printf("Buenas tardes");
            break;
            }
        case 3:
        if ((hora >21)  && (hora < 5)){
            System.out.printf("Buenas noches");
            break;
            }
        }
    }
}
