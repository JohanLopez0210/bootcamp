package Introduccion_P2;

public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();

        carrera.inscribirParticipante("001", "12345678", "Juan", "Pérez", 21, "123456789", "987654321", "A+", "1");
        carrera.inscribirParticipante("002", "87654321", "María", "Gómez", 17, "987654321", "123456789", "B-", "2");
        carrera.inscribirParticipante("003", "13579246", "Pedro", "Zapata", 25, "246813579", "123123123", "O+", "3");

        carrera.mostrarInscritosPorCategoria("1");
        carrera.mostrarInscritosPorCategoria("2");
        carrera.mostrarInscritosPorCategoria("3");

        System.out.println("Total recaudado por Circuito chico: $" + carrera.calcularMontoTotalPorCategoria("1"));
        System.out.println("Total recaudado por Circuito medio: $" + carrera.calcularMontoTotalPorCategoria("2"));
        System.out.println("Total recaudado por Circuito avanzado: $" + carrera.calcularMontoTotalPorCategoria("3"));
        System.out.println("Total recaudado en toda la carrera: $" + carrera.calcularMontoTotal());

        carrera.desinscribirParticipante("1"); // Asumiendo que "1" es el ID de la inscripción
        carrera.mostrarInscritosPorCategoria("1");
    }
}
