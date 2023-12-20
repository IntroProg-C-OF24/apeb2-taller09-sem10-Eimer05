package ejercicio_01;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limMarca = 0, cont = 1, i = 0, num = 0;
        char Auxiliar = 0;
        String letra = null;
        System.out.println("Ingresar el numero de marcas que deseas ingresar");
        limMarca = teclado.nextInt();
        String marca[] = new String[limMarca];
        while (cont <= limMarca) {
            System.out.println("Ingresar el nombre de la marca ");
            marca[i] = teclado.next();
            Auxiliar = marca[i].charAt(0);
            letra = String.valueOf(Auxiliar);
            if (letra.equals("A") || letra.equals("C") || letra.equals("T")){
                marca[i] = "La marca ingresada no puede iniciar con alguna de las siguientes letras: A,C,T";
            }
            cont = cont + 1;
            i = i + 1;
        }
        System.out.println("----------------------------");
        System.out.println("MARCAS");
        for (int otroCont = 0; otroCont < marca.length; otroCont++) {
            System.out.println("Marca N "+(otroCont + 1) + ": " + marca[otroCont]);
        }
    }

}