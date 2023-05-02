public class Muro extends Objeto{
    private Integer resistencia;

    public Muro(double ancho, double alto, Integer resistencia) {
        super(ancho, alto);
        this.resistencia = resistencia;
    }

    public Muro(double ancho, double alto) {
        super(ancho, alto);
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Muro{" +
                "resistencia=" + resistencia +
                "} " + super.toString();
    }
}
