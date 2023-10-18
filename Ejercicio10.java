import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        String horoscopo = "";
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce tu mes de nacimiento");
        int mes = sc.nextInt();
        System.out.print("Introduce tu dia de nacimiento");
        int dia = sc.nextInt();
        switch(mes){
            case 1:
            if (dia>=20 ){
                horoscopo = "acuario";
            }else {
                horoscopo = "capricornio";
            }
            case 2:
            if (dia>=19){
                horoscopo = "piscis";
            }else{
                horoscopo = "capricornio";
            }
            case 3:
            if (dia<21){
                horoscopo="piscis";
            }else{
                horoscopo="Aries";
            }
            case 4:
            if (dia>20){
                horoscopo ="Tauro";
            }else{

            }
        
        System.out.printf("Eres %s",horoscopo);
    }
}
