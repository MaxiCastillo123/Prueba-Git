public class Personaje implements Actions {
    private String nombre;
    private String skin;
    private String nivdelDeVida;
    private String arma;

    public Personaje(String nombre, String skin, String nivdelDeVida, String arma) {
        this.nombre = nombre;
        this.skin = skin;
        this.nivdelDeVida = nivdelDeVida;
        this.arma = arma;
    }

    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getNivdelDeVida() {
        return nivdelDeVida;
    }

    public void setNivdelDeVida(String nivdelDeVida) {
        this.nivdelDeVida = nivdelDeVida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", skin='" + skin + '\'' +
                ", nivdelDeVida='" + nivdelDeVida + '\'' +
                ", arma='" + arma + '\'' +
                '}';
    }

    @Override
    public void atacar() {
        System.out.println("El personaje esta atacando");
    }

    @Override
    public void defenderse() {
        System.out.println("El personaje se esta defendiendo");
    }

    @Override
    public void morir() {
        System.out.println("el personaje ha muerto");
    }

    @Override
    public void cargarEnergia() {
        System.out.println("el personaje esta recargando energia");
    }
}
