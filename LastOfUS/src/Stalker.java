public class Stalker extends Zombie{

    private Integer vision;

    public Stalker(String nombre, String skin, String nivdelDeVida, String arma, Integer vision) {
        super(nombre, skin, nivdelDeVida, arma);
        this.vision = vision;
    }

    public Stalker() {
    }

    public Integer getVision() {
        return vision;
    }

    public void setVision(Integer vision) {
        this.vision = vision;
    }

    public void nightWatch(){
        System.out.println("Puedo ver en la oscuridad");
    }

    @Override
    public String toString() {
        return "Stalker{" +
                "vision=" + vision +
                "} " + super.toString();
    }
}
