public class Ellie extends Player{

    private String gradoDeHumor;
    private Integer cantidadDeChistesMalos;

    public Ellie(String nombre, String skin, String nivdelDeVida, String arma, String gradoDeHumor, Integer cantidadDeChistesMalos) {
        super(nombre, skin, nivdelDeVida, arma);
        this.gradoDeHumor = gradoDeHumor;
        this.cantidadDeChistesMalos = cantidadDeChistesMalos;
    }

    public Ellie() {

    }

    public String getGradoDeHumor() {
        return gradoDeHumor;
    }

    public void setGradoDeHumor(String gradoDeHumor) {
        this.gradoDeHumor = gradoDeHumor;
    }

    public Integer getCantidadDeChistesMalos() {
        return cantidadDeChistesMalos;
    }

    public void setCantidadDeChistesMalos(Integer cantidadDeChistesMalos) {
        this.cantidadDeChistesMalos = cantidadDeChistesMalos;
    }

    @Override
    public String toString() {
        return "Ellie{" +
                "gradoDeHumor='" + gradoDeHumor + '\'' +
                ", cantidadDeChistesMalos=" + cantidadDeChistesMalos +
                "} " + super.toString();
    }
}
