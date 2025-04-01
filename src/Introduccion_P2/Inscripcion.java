package Introduccion_P2;

public class Inscripcion {
    private String id;
    private Categoria categoria;
    private Participante participante;
    private double monto;

    public Inscripcion(String id, Categoria categoria, Participante participante, double monto) {
        this.id = id;
        this.categoria = categoria;
        this.participante = participante;
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Participante getParticipante() {
        return participante;
    }

    public double getMonto() {
        return monto;
    }
}
