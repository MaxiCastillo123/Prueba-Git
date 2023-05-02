public class Bloaster extends Zombie{

    private Integer enojo;

    public Bloaster(String nombre, String skin, String nivdelDeVida, String arma, Integer enojo) {
        super(nombre, skin, nivdelDeVida, arma);
        this.enojo = enojo;
    }

    public Bloaster() {

    }

    public Integer getEnojo() {
        return enojo;
    }

    public void setEnojo(Integer enojo) {
        this.enojo = enojo;
    }

    @Override
    public String toString() {
        return "Bloaster{" +
                "enojo=" + enojo +
                "} " + super.toString();
    }
}

