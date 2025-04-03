package Lambda_Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();

        garaje.agregarVehiculo(new Vehiculo("Ford", "Fiesta", 1000));
        garaje.agregarVehiculo(new Vehiculo("Ford", "Fiesta", 1000));
        garaje.agregarVehiculo(new Vehiculo("Ford", "Focus", 1200));
        garaje.agregarVehiculo(new Vehiculo("Ford", "Explorer", 2500));
        garaje.agregarVehiculo(new Vehiculo("Fiat", "Uno", 500));
        garaje.agregarVehiculo(new Vehiculo("Fiat", "Cronos", 1000));
        garaje.agregarVehiculo(new Vehiculo("Fiat", "Torino", 1250));
        garaje.agregarVehiculo(new Vehiculo("Chevrolet", "Aveo", 1250));
        garaje.agregarVehiculo(new Vehiculo("Chevrolet", "Spin", 2500));
        garaje.agregarVehiculo(new Vehiculo("Toyota", "Corolla", 1200));
        garaje.agregarVehiculo(new Vehiculo("Toyota", "Fortuner", 3000));
        garaje.agregarVehiculo(new Vehiculo("Renault", "Logan", 950));

        List<Vehiculo> vehiculos = garaje.getVehiculos();

        Collections.sort(vehiculos, Comparator.comparingInt(Vehiculo::getCosto));

        System.out.println("Vehículos ordenados por precio:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + vehiculo.getCosto());
        }

        Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getMarca)
                .thenComparing(Vehiculo::getCosto));

        System.out.println("Vehiculos ordenados por marca y precio:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getCosto());
        }

        List<Vehiculo> vehículosBajos = vehiculos.stream()
                .filter(v -> v.getCosto() < 1000).toList();

        List<Vehiculo> vehículosAltos = vehiculos.stream()
                .filter(v -> v.getCosto() >= 1000).toList();

        double promedioPrecios = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0.0); // Regresa 0.0 si la lista está vacía

        System.out.println("Vehículos con precio no mayor a 1000:");
        vehículosBajos.forEach(System.out::println);

        System.out.println("\nVehículos con precio mayor o igual a 1000:");
        vehículosAltos.forEach(System.out::println);

        System.out.println("\nPromedio total de precios de todos los vehículos: $" + promedioPrecios);
    }
}
