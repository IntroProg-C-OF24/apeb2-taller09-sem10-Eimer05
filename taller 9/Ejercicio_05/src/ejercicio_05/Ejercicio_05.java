package ejercicio_05;
import java.util.Random;
public class Ejercicio_05 {
    public static void main(String[] args) {
         int limEst = 28;
        double notasEst[] = new double[limEst];
        double suma = 0, promedio, masAlta=0, masBaja=10;
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i]=(double)(Math.random()*(9-0+1)-0);
            suma=suma+notasEst[i];
        }
        promedio=suma/limEst;
        System.out.println("Estudinates con notas arriba del promedio");
        System.out.println("");
        for (int i = 0; i < notasEst.length; i++) {
            if(notasEst[i]>promedio){
                System.out.printf("Estudiante %d: %.2f ",(i+1),notasEst[i]);
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.printf("Estudiantes con notas bajo el promedio");
        for (int i = 0; i < notasEst.length; i++) {
            if(notasEst[i]<promedio){
                System.out.println("");
                System.out.printf("Estudiante %d: %.2f ",(i+1),notasEst[i]);
            }
        }
        for (int i = 0; i < notasEst.length; i++) {
            if(notasEst[i]>masAlta)
                masAlta=notasEst[i];
            if(notasEst[i]<masBaja)
                masBaja=notasEst[i];
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("LA NOTA MAYOR ES: %.2f",masAlta);
        System.out.println("");
        System.out.printf("LA NOTA MENOR ES: %.2f",masBaja);
        System.out.println("");

    }
    
}
