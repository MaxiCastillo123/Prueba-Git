public class Player extends Personaje{

    public Player(String nombre, String skin, String nivdelDeVida, String arma) {
        super(nombre, skin, nivdelDeVida, arma);
    }

    public Player() {
    }

    public void curarse(){
        System.out.println("Me estoy curando");
    }

    public void recargarArma(){
        System.out.println("Estoy recargando el arma");
    }

    @Override
    public String toString() {
        return "Player{} " + super.toString();
    }


}
