public class Objeto {

    private double ancho;
    private double alto;

    public Objeto(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
