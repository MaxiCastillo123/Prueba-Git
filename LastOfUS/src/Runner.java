public class Runner extends Zombie{

    private String maxSpeed;

    public Runner(String nombre, String skin, String nivdelDeVida, String arma, String maxSpeed) {
        super(nombre, skin, nivdelDeVida, arma);
        this.maxSpeed = maxSpeed;
    }

    public Runner() {
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void runFaster(){
        System.out.println("Corriendo mas rapido");
    }

    @Override
    public String toString() {
        return "Runner{" +
                "maxSpeed='" + maxSpeed + '\'' +
                "} " + super.toString();
    }

}
