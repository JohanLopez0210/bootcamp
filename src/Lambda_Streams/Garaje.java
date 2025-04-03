package Lambda_Streams;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private static int contador = 0;
    private int id;
    private List<Vehiculo> vehiculos;

    public Garaje() {
        this.id = ++contador;
        this.vehiculos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
