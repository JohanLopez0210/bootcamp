package Introduccion_P2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Carrera {
    private List<Categoria> categorias;
    private List<Inscripcion> inscripciones;

    public Carrera() {
        categorias = new ArrayList<>();
        inscripciones = new ArrayList<>();
        crearCategorias();
    }

    private void crearCategorias() {
        categorias.add(new Categoria("1", "Circuito chico", "2 km por selva y arroyos", 1300, 1500, 2000, 2300, 0));
        categorias.add(new Categoria("2", "Circuito medio", "5 km por selva, arroyos y barro", 2000, 2300, 0, 0, 0));
        categorias.add(new Categoria("3", "Circuito avanzado", "10 km por selva, arroyos, barro y escalada en piedra", 0, 0, 0, 0, 2800));
    }

    public void inscribirParticipante(String numero, String dni, String nombre, String apellido, int edad,
                                      String celular, String numeroEmergencia, String grupoSanguineo, String idCategoria) {
        Categoria categoria = buscarCategoriaPorId(idCategoria);
        if (categoria == null) {
            System.out.println("Categoría no encontrada.");
            return;
        }

        double monto = categoria.getMonto(edad, categoria.getNombre());
        if (monto == 0) {
            System.out.println("No se permite inscribirse en esta categoría.");
            return;
        }

        Participante participante = new Participante(numero, dni, nombre, apellido, edad, celular, numeroEmergencia, grupoSanguineo);
        Inscripcion inscripcion = new Inscripcion(UUID.randomUUID().toString(), categoria, participante, monto);
        inscripciones.add(inscripcion);
        System.out.println("Participante inscrito: " + participante.getNombre() + " " + participante.getApellido() + " en " + categoria.getNombre());
    }

    private Categoria buscarCategoriaPorId(String id) {
        for (Categoria categoria : categorias) {
            if (categoria.getId().equals(id)) {
                return categoria;
            }
        }
        return null;
    }

    public void mostrarInscritosPorCategoria(String idCategoria) {
        System.out.println("Inscritos en la categoría: " + idCategoria);
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getCategoria().getId().equals(idCategoria)) {
                Participante p = inscripcion.getParticipante();
                System.out.println(p.getNumero() + ": " + p.getNombre() + " " + p.getApellido() + ", Edad: " + p.getEdad() + ", Monto: $" + inscripcion.getMonto());
            }
        }
    }

    public void desinscribirParticipante(String numeroInscripcion) {
        inscripciones.removeIf(inscripcion -> inscripcion.getId().equals(numeroInscripcion));
    }

    public double calcularMontoTotalPorCategoria(String idCategoria) {
        double total = 0;
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getCategoria().getId().equals(idCategoria)) {
                total += inscripcion.getMonto();
            }
        }
        return total;
    }

    public double calcularMontoTotal() {
        double total = 0;
        for (Inscripcion inscripcion : inscripciones) {
            total += inscripcion.getMonto();
        }
        return total;
    }
}