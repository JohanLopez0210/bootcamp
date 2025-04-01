package Introduccion_P2;

public class Categoria {
    private String id;
    private String nombre;
    private String descripcion;
    private double montoChicoMenor;
    private double montoChicoMayor;
    private double montoMedioMenor;
    private double montoMedioMayor;
    private double montoAvanzadoMayor;

    public Categoria(String id, String nombre, String descripcion, double montoChicoMenor, double montoChicoMayor,
                     double montoMedioMenor, double montoMedioMayor, double montoAvanzadoMayor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.montoChicoMenor = montoChicoMenor;
        this.montoChicoMayor = montoChicoMayor;
        this.montoMedioMenor = montoMedioMenor;
        this.montoMedioMayor = montoMedioMayor;
        this.montoAvanzadoMayor = montoAvanzadoMayor;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto(int edad, String circuito) {
        switch (circuito) {
            case "Circuito chico":
                return (edad < 18) ? montoChicoMenor : montoChicoMayor;
            case "Circuito medio":
                return (edad < 18) ? montoMedioMenor : montoMedioMayor;
            case "Circuito avanzado":
                return (edad >= 18) ? montoAvanzadoMayor : 0;
            default:
                return 0;
        }
    }
}