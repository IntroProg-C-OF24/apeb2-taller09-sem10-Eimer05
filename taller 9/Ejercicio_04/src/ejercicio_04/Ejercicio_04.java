package ejercicio_04;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingresar una letra, escribela en mayuscula porfavor");
            inicial = entrada.nextLine().toUpperCase();
            for (int i = 0; i < estudiantes.length; i++) {
                
                if(estudiantes[i].startsWith(inicial))
                    bandera = false;      
            }
        }
        System.out.println("La letra es igual a una de las iniciales");
    }

}
