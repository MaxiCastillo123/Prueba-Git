public class Joel extends Player{

    private String nivelDeMalaOnda;

    private String nivelDeTestarudes;

    public Joel(String nombre, String skin, String nivdelDeVida, String arma, String nivelDeMalaOnda, String nivelDeTestarudes) {
        super(nombre, skin, nivdelDeVida, arma);
        this.nivelDeMalaOnda = nivelDeMalaOnda;
        this.nivelDeTestarudes = nivelDeTestarudes;
    }

    public Joel() {

    }

    public String getNivelDeMalaOnda() {
        return nivelDeMalaOnda;
    }

    public void setNivelDeMalaOnda(String nivelDeMalaOnda) {
        this.nivelDeMalaOnda = nivelDeMalaOnda;
    }

    public String getNivelDeTestarudes() {
        return nivelDeTestarudes;
    }

    public void setNivelDeTestarudes(String nivelDeTestarudes) {
        this.nivelDeTestarudes = nivelDeTestarudes;
    }

    @Override
    public String toString() {
        return "Joel{" +
                "nivelDeMalaOnda='" + nivelDeMalaOnda + '\'' +
                ", nivelDeTestarudes='" + nivelDeTestarudes + '\'' +
                "} " + super.toString();
    }
}
