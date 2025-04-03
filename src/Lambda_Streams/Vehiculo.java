package Lambda_Streams;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer costo;

    public Vehiculo(String marca, String modelo, Integer costo) {
        setMarca(marca);
        setModelo(modelo);
        setCosto(costo);
    }

    public Integer getCosto() {
        return costo;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
