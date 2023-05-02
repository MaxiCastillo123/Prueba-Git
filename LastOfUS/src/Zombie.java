public class Zombie extends Personaje{

    public Zombie(String nombre, String skin, String nivdelDeVida, String arma) {
        super(nombre, skin, nivdelDeVida, arma);
    }

    public Zombie() {
    }

    @Override
    public String toString() {
        return "Zombie{} " + super.toString();
    }

    public void moreder(){
        System.out.println("He mordido al Player");
    }

}
