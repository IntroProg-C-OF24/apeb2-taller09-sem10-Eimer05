package ejercicio_03;

public class Ejercicio_03 {

    public static void main(String[] args) {
        double[] promedio = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez","Mark Hogan","Teresa Martinez","Julia Johnson","Mark Cook","Jennifer Manning","Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < promedio.length; i++) {
            if ((promedio[i] >= 0) & (promedio[i] <= 5.9)) {
                promediosCualitativos[i] = "Regular";
            } else if ((promedio[i] >= 6) & (promedio[i] <= 8.9)) {
                promediosCualitativos[i] = "Bueno";
            } else if ((promedio[i] >= 9) & (promedio[i] <= 10)) {
                promediosCualitativos[i] = "Sobresaliente";
            }
        }
        for (int i = 0; i < promedio.length; i++) {
            System.out.println("");
            System.out.println(estudiantes[i]);
            System.out.println("Promedio: " + promedio[i]);
            System.out.println("Promedio Cualitativo: " + promediosCualitativos[i]);
        }
    }

}
