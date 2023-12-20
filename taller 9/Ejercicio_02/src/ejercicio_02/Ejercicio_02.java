package ejercicio_02;

public class Ejercicio_02 {

    public static void main(String[] args) {
        int array[] = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0, prom = 0;
        for (int i = 0; i < array.length; i=i+1) {
            suma = suma + array[i];
        }
        prom=suma/array.length;
        System.out.printf("Promedio: "+ prom);
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Elementos por arriba de la media aritmetica");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > prom) {
                System.out.print("N# " + (i + 1) + ": " + array[i] + " ; ");
            }
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Elementos por debajo de la media aritmetica");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < prom) {
                System.out.print("N# " + (i + 1) + ": " + array[i] + " ; ");
            }
        }
    }

}
