package Introduccion_P1;

public class Temperaturas {
    public static void main(String[] args) {
        String[] ciudades = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo" ,
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };

        int[][] temperaturas = {
                {-2,-3,-8,4,6,5,0,-7,-1,-10},
                {33,32,27,37,42,43,39,26,31,35}
        };

        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        String ciudadMayor = "";
        String ciudadMenor = "";

        for (int i = 0; i < ciudades.length; i++) {
            if (tempMin > temperaturas[0][i]) {
                tempMin = temperaturas[0][i];
                ciudadMenor = ciudades[i];
            }
            if (tempMax < temperaturas[1][i]) {
                tempMax = temperaturas[1][i];
                ciudadMayor = ciudades[i];
            }
        }

        System.out.println("La mayor temperatura fue en " + ciudadMayor + " con " + tempMax + " grados.");
        System.out.println("La menor temperatura fue en " + ciudadMenor + " con " + tempMin + " grados.");
    }
}