public class Ubicacion {
    private String ubicacion;
    private int distancia;
    public Ubicacion(String ubicacion, int distancia) {
        this.ubicacion = ubicacion;
        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }

    public String getUbicacion() {
        return ubicacion;

    }
}
