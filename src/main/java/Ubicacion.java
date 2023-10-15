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

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getUbicacion() {
        return ubicacion;

    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
